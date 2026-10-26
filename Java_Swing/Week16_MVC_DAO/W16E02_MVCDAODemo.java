import javax.swing.*; import java.awt.*; import java.util.*;
class Item2 {private int id;private String name;Item2(int id,String name){this.id=id;this.name=name;}public String toString(){return id+" - "+name;}}
interface ItemDAO2 {void save(Item2 x);java.util.List<Item2> all();}
class MemoryDAO2 implements ItemDAO2 {private final java.util.List<Item2> d=new ArrayList<>();public void save(Item2 x){d.add(x);}public java.util.List<Item2> all(){return new ArrayList<>(d);}}
public class W16E02_MVCDAODemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{ItemDAO2 dao=new MemoryDAO2();JFrame f=new JFrame("MVC DAO 2");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setSize(500,350);DefaultListModel<Item2> m=new DefaultListModel<>();JList<Item2> l=new JList<>(m);JTextField id=new JTextField(5),n=new JTextField(12);JButton save=new JButton("Save through DAO");
 save.addActionListener(e->{try{dao.save(new Item2(Integer.parseInt(id.getText()),n.getText()));m.clear();for(Item2 x:dao.all())m.addElement(x);}catch(Exception ex){JOptionPane.showMessageDialog(f,"Invalid input");}});JPanel p=new JPanel();p.add(id);p.add(n);p.add(save);f.add(p,BorderLayout.NORTH);f.add(new JScrollPane(l),BorderLayout.CENTER);f.setLocationRelativeTo(null);f.setVisible(true);});}
}
