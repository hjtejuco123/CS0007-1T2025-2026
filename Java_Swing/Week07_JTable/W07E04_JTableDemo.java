import javax.swing.*; import javax.swing.table.DefaultTableModel; import java.awt.*;
public class W07E04_JTableDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  JFrame f=new JFrame("JTable 4");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setSize(620,350);
  DefaultTableModel m=new DefaultTableModel(new String[]{"ID","Name","Course"},0);m.addRow(new Object[]{1,"Ana","BSIT"});m.addRow(new Object[]{2,"Ben","BSCS"});
  JTable t=new JTable(m);JButton b=new JButton("Add Sample Row");b.addActionListener(e->m.addRow(new Object[]{m.getRowCount()+1,"Student "+(m.getRowCount()+1),"BSIT"}));
  f.add(new JScrollPane(t),BorderLayout.CENTER);f.add(b,BorderLayout.SOUTH);f.setLocationRelativeTo(null);f.setVisible(true);
 });}
}
