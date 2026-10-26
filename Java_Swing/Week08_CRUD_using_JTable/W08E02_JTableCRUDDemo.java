import javax.swing.*; import javax.swing.table.DefaultTableModel; import java.awt.*;
public class W08E02_JTableCRUDDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  JFrame f=new JFrame("JTable CRUD 2");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setSize(760,410);
  DefaultTableModel m=new DefaultTableModel(new String[]{"ID","Name"},0);JTable t=new JTable(m);JTextField id=new JTextField(5),nameF=new JTextField(12);
  JButton add=new JButton("Create"),update=new JButton("Update"),del=new JButton("Delete");
  add.addActionListener(e->m.addRow(new Object[]{id.getText(),nameF.getText()}));
  update.addActionListener(e->{int r=t.getSelectedRow();if(r>=0){m.setValueAt(id.getText(),r,0);m.setValueAt(nameF.getText(),r,1);}});
  del.addActionListener(e->{int r=t.getSelectedRow();if(r>=0)m.removeRow(r);});
  t.getSelectionModel().addListSelectionListener(e->{int r=t.getSelectedRow();if(r>=0){id.setText(m.getValueAt(r,0).toString());nameF.setText(m.getValueAt(r,1).toString());}});
  JPanel p=new JPanel();p.add(new JLabel("ID"));p.add(id);p.add(new JLabel("Name"));p.add(nameF);p.add(add);p.add(update);p.add(del);
  f.add(p,BorderLayout.NORTH);f.add(new JScrollPane(t),BorderLayout.CENTER);f.setLocationRelativeTo(null);f.setVisible(true);
 });}
}
