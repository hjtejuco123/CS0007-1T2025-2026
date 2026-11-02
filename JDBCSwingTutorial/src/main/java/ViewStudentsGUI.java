
package jdbcswingtutorial;

import java.awt.BorderLayout;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewStudentsGUI extends JFrame {

    DefaultTableModel model = new DefaultTableModel(
        new String[]{"ID", "Name", "Course", "Age"}, 0
    ) {
        @Override
        public boolean isCellEditable(int row, int col) {
            return false;
        }
    };

    JTable table = new JTable(model);
    JButton btnLoad = new JButton("Load Students");

    public ViewStudentsGUI() {
        setTitle("Student Records");
        setSize(650, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        add(new JScrollPane(table), BorderLayout.CENTER);
        add(btnLoad, BorderLayout.SOUTH);

        btnLoad.addActionListener(e -> loadStudents());
        loadStudents();
    }

    private void loadStudents() {

        String sql = "SELECT * FROM students " +
                     "ORDER BY student_id";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps =
                 conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("student_id"),
                    rs.getString("student_name"),
                    rs.getString("course"),
                    rs.getInt("age")
                });
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
                "Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
            new ViewStudentsGUI().setVisible(true)
        );
    }
}
