import javax.swing.*; import java.awt.*; import java.util.*;
class Item1 {private int id;private String name;Item1(int id,String name){this.id=id;this.name=name;}public String toString(){return id+" - "+name;}}
interface ItemDAO1 {void save(Item1 x);java.util.List<Item1> all();}
class MemoryDAO1 implements ItemDAO1 {private final java.util.List<Item1> d=new ArrayList<>();public void save(Item1 x){d.add(x);}public java.util.List<Item1> all(){return new ArrayList<>(d);}}
public class W16E01_MVCDAODemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{ItemDAO1 dao=new MemoryDAO1();JFrame f=new JFrame("MVC DAO 1");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setSize(500,350);DefaultListModel<Item1> m=new DefaultListModel<>();JList<Item1> l=new JList<>(m);JTextField id=new JTextField(5),n=new JTextField(12);JButton save=new JButton("Save through DAO");
 save.addActionListener(e->{try{dao.save(new Item1(Integer.parseInt(id.getText()),n.getText()));m.clear();for(Item1 x:dao.all())m.addElement(x);}catch(Exception ex){JOptionPane.showMessageDialog(f,"Invalid input");}});JPanel p=new JPanel();p.add(id);p.add(n);p.add(save);f.add(p,BorderLayout.NORTH);f.add(new JScrollPane(l),BorderLayout.CENTER);f.setLocationRelativeTo(null);f.setVisible(true);});}
}
