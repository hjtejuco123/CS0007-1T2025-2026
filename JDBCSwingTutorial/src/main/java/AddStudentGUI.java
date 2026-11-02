
package jdbcswingtutorial;

import java.awt.GridLayout;
import java.sql.*;
import javax.swing.*;

public class AddStudentGUI extends JFrame {

    JTextField txtName = new JTextField();
    JTextField txtCourse = new JTextField();
    JTextField txtAge = new JTextField();
    JButton btnSave = new JButton("Save Student");

    public AddStudentGUI() {
        setTitle("Add Student");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Student Name:"));
        add(txtName);

        add(new JLabel("Course:"));
        add(txtCourse);

        add(new JLabel("Age:"));
        add(txtAge);

        add(new JLabel(""));
        add(btnSave);

        btnSave.addActionListener(e -> saveStudent());
    }

    private void saveStudent() {

        String name = txtName.getText().trim();
        String course = txtCourse.getText().trim();

        if (name.isEmpty() || course.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Please complete all fields.");
            return;
        }

        int age;

        try {
            age = Integer.parseInt(txtAge.getText().trim());

            if (age <= 0 || age > 120) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                "Enter a valid age between 1 and 120.");
            return;
        }

        String sql = "INSERT INTO students " +
                     "(student_name, course, age) " +
                     "VALUES (?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps =
                 conn.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, course);
            ps.setInt(3, age);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                JOptionPane.showMessageDialog(this,
                    "Student saved successfully!");

                txtName.setText("");
                txtCourse.setText("");
                txtAge.setText("");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
                "Database Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
            new AddStudentGUI().setVisible(true)
        );
    }
}
