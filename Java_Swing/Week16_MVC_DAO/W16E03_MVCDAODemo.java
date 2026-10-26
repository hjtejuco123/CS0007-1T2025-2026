import javax.swing.*; import java.awt.*; import java.util.*;
class Item3 {private int id;private String name;Item3(int id,String name){this.id=id;this.name=name;}public String toString(){return id+" - "+name;}}
interface ItemDAO3 {void save(Item3 x);java.util.List<Item3> all();}
class MemoryDAO3 implements ItemDAO3 {private final java.util.List<Item3> d=new ArrayList<>();public void save(Item3 x){d.add(x);}public java.util.List<Item3> all(){return new ArrayList<>(d);}}
public class W16E03_MVCDAODemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{ItemDAO3 dao=new MemoryDAO3();JFrame f=new JFrame("MVC DAO 3");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setSize(500,350);DefaultListModel<Item3> m=new DefaultListModel<>();JList<Item3> l=new JList<>(m);JTextField id=new JTextField(5),n=new JTextField(12);JButton save=new JButton("Save through DAO");
 save.addActionListener(e->{try{dao.save(new Item3(Integer.parseInt(id.getText()),n.getText()));m.clear();for(Item3 x:dao.all())m.addElement(x);}catch(Exception ex){JOptionPane.showMessageDialog(f,"Invalid input");}});JPanel p=new JPanel();p.add(id);p.add(n);p.add(save);f.add(p,BorderLayout.NORTH);f.add(new JScrollPane(l),BorderLayout.CENTER);f.setLocationRelativeTo(null);f.setVisible(true);});}
}
