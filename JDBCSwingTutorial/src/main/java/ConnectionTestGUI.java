
package jdbcswingtutorial;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.*;

public class ConnectionTestGUI extends JFrame {

    private JButton btnConnect;

    public ConnectionTestGUI() {
        setTitle("JDBC Connection Test");
        setSize(350, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnConnect = new JButton("Test Connection");
        add(btnConnect);

        btnConnect.addActionListener(e -> testConnection());
    }

    private void testConnection() {
        try (Connection conn =
                DBConnection.getConnection()) {

            JOptionPane.showMessageDialog(this,
                "Database Connected Successfully!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
                "Connection Failed: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
            new ConnectionTestGUI().setVisible(true)
        );
    }
}
