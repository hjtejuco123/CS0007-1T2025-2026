import javax.swing.*; import java.awt.*; import java.util.*;
class Item5 {private int id;private String name;Item5(int id,String name){this.id=id;this.name=name;}public String toString(){return id+" - "+name;}}
interface ItemDAO5 {void save(Item5 x);java.util.List<Item5> all();}
class MemoryDAO5 implements ItemDAO5 {private final java.util.List<Item5> d=new ArrayList<>();public void save(Item5 x){d.add(x);}public java.util.List<Item5> all(){return new ArrayList<>(d);}}
public class W16E05_MVCDAODemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{ItemDAO5 dao=new MemoryDAO5();JFrame f=new JFrame("MVC DAO 5");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setSize(500,350);DefaultListModel<Item5> m=new DefaultListModel<>();JList<Item5> l=new JList<>(m);JTextField id=new JTextField(5),n=new JTextField(12);JButton save=new JButton("Save through DAO");
 save.addActionListener(e->{try{dao.save(new Item5(Integer.parseInt(id.getText()),n.getText()));m.clear();for(Item5 x:dao.all())m.addElement(x);}catch(Exception ex){JOptionPane.showMessageDialog(f,"Invalid input");}});JPanel p=new JPanel();p.add(id);p.add(n);p.add(save);f.add(p,BorderLayout.NORTH);f.add(new JScrollPane(l),BorderLayout.CENTER);f.setLocationRelativeTo(null);f.setVisible(true);});}
}
