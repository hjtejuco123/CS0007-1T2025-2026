import javax.swing.*; import javax.swing.table.DefaultTableModel; import java.sql.*;
public class W13E01_JDBCDemo {
 static final String URL="jdbc:mysql://localhost:3306/swing_tutorial",USER="root",PASSWORD="";
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  JFrame f=new JFrame("JDBC 1");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setSize(680,380);DefaultTableModel m=new DefaultTableModel(new String[]{"ID","Name","Course","Email"},0);
  try(Connection c=DriverManager.getConnection(URL,USER,PASSWORD);Statement s=c.createStatement();ResultSet r=s.executeQuery("SELECT id,name,course,email FROM students")){while(r.next())m.addRow(new Object[]{r.getInt(1),r.getString(2),r.getString(3),r.getString(4)});}catch(SQLException ex){JOptionPane.showMessageDialog(f,ex.getMessage());}
  f.add(new JScrollPane(new JTable(m)));f.setLocationRelativeTo(null);f.setVisible(true);
 });}
}
