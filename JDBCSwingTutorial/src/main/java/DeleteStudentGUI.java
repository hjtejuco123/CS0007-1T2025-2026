
package jdbcswingtutorial;

import java.awt.GridLayout;
import java.sql.*;
import javax.swing.*;

public class DeleteStudentGUI extends JFrame {

    JTextField txtID = new JTextField();
    JButton btnDelete = new JButton("Delete Student");

    public DeleteStudentGUI() {
        setTitle("Delete Student");
        setSize(350, 160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2, 10, 10));

        add(new JLabel("Student ID:"));
        add(txtID);
        add(new JLabel(""));
        add(btnDelete);

        btnDelete.addActionListener(e -> deleteStudent());
    }

    private void deleteStudent() {

        int id;

        try {
            id = Integer.parseInt(txtID.getText().trim());
            if (id <= 0) throw new NumberFormatException();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                "Enter a valid student ID.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(
            this,
            "Delete student ID " + id + "?",
            "Confirm Delete",
            JOptionPane.YES_NO_OPTION
        );

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        String sql =
            "DELETE FROM students WHERE student_id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps =
                 conn.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            JOptionPane.showMessageDialog(this,
                rows > 0 ? "Student deleted successfully!"
                         : "Student not found.");

            txtID.setText("");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
                "Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
            new DeleteStudentGUI().setVisible(true)
        );
    }
}
