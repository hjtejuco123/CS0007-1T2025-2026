import javax.swing.*; import java.awt.*; import java.util.*;
public class W12E04_ArrayListDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  ArrayList<String> data=new ArrayList<>();DefaultListModel<String> m=new DefaultListModel<>();JList<String> list=new JList<>(m);
  JFrame f=new JFrame("ArrayList 4");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setSize(470,350);JTextField t=new JTextField(15);JButton add=new JButton("Add"),del=new JButton("Delete");
  add.addActionListener(e->{String v=t.getText().trim();if(!v.isEmpty()){data.add(v);m.addElement(v);t.setText("");}});
  del.addActionListener(e->{int x=list.getSelectedIndex();if(x>=0){data.remove(x);m.remove(x);}});
  JPanel p=new JPanel();p.add(t);p.add(add);p.add(del);f.add(p,BorderLayout.NORTH);f.add(new JScrollPane(list),BorderLayout.CENTER);f.setLocationRelativeTo(null);f.setVisible(true);
 });}
}
