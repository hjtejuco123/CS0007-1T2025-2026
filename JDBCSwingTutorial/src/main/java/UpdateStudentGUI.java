
package jdbcswingtutorial;

import java.awt.GridLayout;
import java.sql.*;
import javax.swing.*;

public class UpdateStudentGUI extends JFrame {

    JTextField txtID = new JTextField();
    JTextField txtName = new JTextField();
    JTextField txtCourse = new JTextField();
    JTextField txtAge = new JTextField();

    JButton btnSearch = new JButton("Search");
    JButton btnUpdate = new JButton("Update");

    public UpdateStudentGUI() {
        setTitle("Update Student");
        setSize(450, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new JLabel("Student ID:"));
        add(txtID);

        add(new JLabel("Name:"));
        add(txtName);

        add(new JLabel("Course:"));
        add(txtCourse);

        add(new JLabel("Age:"));
        add(txtAge);

        add(btnSearch);
        add(btnUpdate);

        btnSearch.addActionListener(e -> searchStudent());
        btnUpdate.addActionListener(e -> updateStudent());
    }

    private int getStudentID() {
        int id = Integer.parseInt(txtID.getText().trim());
        if (id <= 0) throw new NumberFormatException();
        return id;
    }

    private void searchStudent() {
        String sql = "SELECT * FROM students WHERE student_id=?";

        try {
            int id = getStudentID();

            try (Connection conn = DBConnection.getConnection();
                 PreparedStatement ps =
                     conn.prepareStatement(sql)) {

                ps.setInt(1, id);

                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        txtName.setText(
                            rs.getString("student_name"));
                        txtCourse.setText(
                            rs.getString("course"));
                        txtAge.setText(
                            String.valueOf(rs.getInt("age")));
                    } else {
                        txtName.setText("");
                        txtCourse.setText("");
                        txtAge.setText("");
                        JOptionPane.showMessageDialog(this,
                            "Student not found.");
                    }
                }
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                "Enter a valid student ID.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
                "Error: " + ex.getMessage());
        }
    }

    private void updateStudent() {
        String sql = "UPDATE students SET " +
                     "student_name=?, course=?, age=? " +
                     "WHERE student_id=?";

        try {
            int id = getStudentID();
            int age = Integer.parseInt(txtAge.getText().trim());
            String name = txtName.getText().trim();
            String course = txtCourse.getText().trim();

            if (name.isEmpty() || course.isEmpty()
                    || age <= 0 || age > 120) {
                throw new IllegalArgumentException(
                    "Check the name, course, and age.");
            }

            try (Connection conn = DBConnection.getConnection();
                 PreparedStatement ps =
                     conn.prepareStatement(sql)) {

                ps.setString(1, name);
                ps.setString(2, course);
                ps.setInt(3, age);
                ps.setInt(4, id);

                int rows = ps.executeUpdate();

                JOptionPane.showMessageDialog(this,
                    rows > 0 ? "Student updated!"
                             : "Student not found.");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                "ID and age must be valid numbers.");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this,
                ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
                "Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
            new UpdateStudentGUI().setVisible(true)
        );
    }
}
