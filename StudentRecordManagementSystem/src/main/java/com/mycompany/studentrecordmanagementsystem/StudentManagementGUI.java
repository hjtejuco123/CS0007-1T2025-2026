package com.mycompany.studentrecordmanagementsystem;

import java.awt.*;
import java.sql.SQLException;
import java.util.List;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class StudentManagementGUI extends JFrame {

    private final JTextField number = new JTextField();
    private final JTextField first = new JTextField();
    private final JTextField last = new JTextField();
    private final JTextField email = new JTextField();
    private final JTextField contact = new JTextField();
    private final JTextField search = new JTextField();

    private final JComboBox<String> gender = new JComboBox<>(new String[]{"Male", "Female", "Prefer not to say"});
    private final JComboBox<String> course = new JComboBox<>(new String[]{"BSCS", "BSIT", "BSIS", "BSEMC", "Other"});
    private final JComboBox<Integer> year = new JComboBox<>(new Integer[]{1, 2, 3, 4});

    private final DefaultTableModel model = new DefaultTableModel(
            new String[]{"ID", "Student No.", "First Name", "Last Name", "Gender", "Course", "Year", "Email", "Contact"}, 0) {
        @Override
        public boolean isCellEditable(int r, int c) {
            return false;
        }
    };
    private final JTable table = new JTable(model);
    private final JLabel counter = new JLabel("Records: 0");
    private final StudentDAO dao = new StudentDAO();
    private int selectedId = -1;

    public StudentManagementGUI() {
        super("Student Record Management System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1150, 650);
        setLocationRelativeTo(null);

        JPanel root = new JPanel(new BorderLayout(10, 10));
        root.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
        setContentPane(root);

        JLabel heading = new JLabel("STUDENT RECORD MANAGEMENT SYSTEM");
        heading.setFont(new Font("SansSerif", Font.BOLD, 22));
        root.add(heading, BorderLayout.NORTH);

        JPanel form = new JPanel(new GridLayout(8, 2, 8, 8));
        field(form, "Student Number", number);
        field(form, "First Name", first);
        field(form, "Last Name", last);
        field(form, "Gender", gender);
        field(form, "Course", course);
        field(form, "Year Level", year);
        field(form, "Email", email);
        field(form, "Contact", contact);

        JPanel left = new JPanel(new BorderLayout(8, 8));
        left.setPreferredSize(new Dimension(340, 0));
        left.setBorder(BorderFactory.createTitledBorder("Student Information"));
        left.add(form, BorderLayout.NORTH);

        JPanel actions = new JPanel(new GridLayout(2, 3, 5, 5));
        button(actions, "Add", () -> save(false));
        button(actions, "Update", () -> save(true));
        button(actions, "Delete", this::deleteSelected);
        button(actions, "Clear", this::clear);
        button(actions, "Refresh", () -> load(""));
        button(actions, "Exit", this::dispose);
        left.add(actions, BorderLayout.SOUTH);
        root.add(left, BorderLayout.WEST);

        JPanel right = new JPanel(new BorderLayout(8, 8));
        JPanel searchPanel = new JPanel(new BorderLayout(6, 6));
        searchPanel.add(new JLabel("Search (number, name, course):"), BorderLayout.WEST);
        searchPanel.add(search, BorderLayout.CENTER);
        button(searchPanel, "Search", () -> load(search.getText()));
        right.add(searchPanel, BorderLayout.NORTH);

        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.setAutoCreateRowSorter(true);
        right.add(new JScrollPane(table), BorderLayout.CENTER);
        right.add(counter, BorderLayout.SOUTH);
        root.add(right, BorderLayout.CENTER);

        table.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                selectRow();
            }
        });
        search.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                refresh();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                refresh();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                refresh();
            }

            private void refresh() {
                load(search.getText());
            }
        });
        load("");
    }

    private void field(JPanel panel, String name, JComponent input) {
        panel.add(new JLabel(name + ":"));
        panel.add(input);
    }

    private JButton button(JPanel panel, String label, Runnable action) {
        JButton b = new JButton(label);
        b.addActionListener(e -> action.run());
        panel.add(b);
        return b;
    }

    private void selectRow() {
        int view = table.getSelectedRow();
        if (view < 0) {
            return;
        }
        int r = table.convertRowIndexToModel(view);
        selectedId = (int) model.getValueAt(r, 0);
        number.setText(String.valueOf(model.getValueAt(r, 1)));
        first.setText(String.valueOf(model.getValueAt(r, 2)));
        last.setText(String.valueOf(model.getValueAt(r, 3)));
        gender.setSelectedItem(model.getValueAt(r, 4));
        course.setSelectedItem(model.getValueAt(r, 5));
        year.setSelectedItem(model.getValueAt(r, 6));
        email.setText(String.valueOf(model.getValueAt(r, 7)));
        Object c = model.getValueAt(r, 8);
        contact.setText(c == null ? "" : c.toString());
    }

    private Student inputStudent() {
        String n = number.getText().trim();
        String f = first.getText().trim();
        String l = last.getText().trim();
        String e = email.getText().trim();
        String c = contact.getText().trim();

        if (n.isEmpty() || f.isEmpty() || l.isEmpty() || e.isEmpty()) {
            throw new IllegalArgumentException("Student number, first name, last name, and email are required.");
        }
        if (n.length() > 20 || f.length() > 50 || l.length() > 50 || e.length() > 100 || c.length() > 20) {
            throw new IllegalArgumentException("One or more fields exceed database length limits.");
        }
        if (!e.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")) {
            throw new IllegalArgumentException("Enter a valid email address.");
        }
        return new Student(selectedId, n, f, l,
                (String) gender.getSelectedItem(),
                (String) course.getSelectedItem(),
                (Integer) year.getSelectedItem(),
                e, c);
    }

    private void save(boolean editing) {
        try {
            if (editing && selectedId < 0) {
                alert("Select a student first.");
                return;
            }
            Student s = inputStudent();
            int rows = editing ? dao.update(s) : dao.add(s);
            if (rows > 0) {
                alert(editing ? "Student updated successfully." : "Student added successfully.");
                clear();
                load(search.getText());
            } else {
                alert("No record was changed.");
            }
        } catch (IllegalArgumentException ex) {
            alert(ex.getMessage());
        } catch (SQLException ex) {
            dbError(ex);
        }
    }

    private void deleteSelected() {
        if (selectedId < 0) {
            alert("Select a student first.");
            return;
        }
        int choice = JOptionPane.showConfirmDialog(this, "Delete the selected student?",
                "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (choice != JOptionPane.YES_OPTION) {
            return;
        }
        try {
            int rows = dao.delete(selectedId);
            alert(rows > 0 ? "Student deleted." : "Record not found.");
            clear();
            load(search.getText());
        } catch (SQLException ex) {
            dbError(ex);
        }
    }

    private void clear() {
        selectedId = -1;
        table.clearSelection();
        number.setText("");
        first.setText("");
        last.setText("");
        email.setText("");
        contact.setText("");
        gender.setSelectedIndex(0);
        course.setSelectedIndex(0);
        year.setSelectedIndex(0);
    }

    private void load(String keyword) {
        try {
            List<Student> students = dao.find(keyword);
            model.setRowCount(0);
            for (Student s : students) {
                model.addRow(new Object[]{s.id, s.studentNumber, s.firstName, s.lastName,
                    s.gender, s.course, s.yearLevel, s.email, s.contactNumber});
            }
            counter.setText("Records displayed: " + students.size());
        } catch (SQLException ex) {
            dbError(ex);
        }
    }

    private void dbError(SQLException ex) {
        String message = "23000".equals(ex.getSQLState())
                ? "Duplicate student number or email, or another database constraint was violated."
                : ex.getMessage();
        alert("Database error: " + message);
    }

    private void alert(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentManagementGUI().setVisible(true));
    }
}
