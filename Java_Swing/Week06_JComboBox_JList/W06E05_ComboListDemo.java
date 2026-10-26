import javax.swing.*; import java.awt.*;
public class W06E05_ComboListDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  JFrame f=new JFrame("Combo/List 5");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setSize(520,330);
  JComboBox<String> combo=new JComboBox<>(new String[]{"BSIT","BSCS","BSIS"});JList<String> list=new JList<>(new String[]{"Java","Database","Networking","Operating Systems"});
  list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);JButton show=new JButton("Show");
  show.addActionListener(e->JOptionPane.showMessageDialog(f,"Course: "+combo.getSelectedItem()+"\nSubjects: "+list.getSelectedValuesList()));
  f.add(combo,BorderLayout.NORTH);f.add(new JScrollPane(list),BorderLayout.CENTER);f.add(show,BorderLayout.SOUTH);f.setLocationRelativeTo(null);f.setVisible(true);
 });}
}
