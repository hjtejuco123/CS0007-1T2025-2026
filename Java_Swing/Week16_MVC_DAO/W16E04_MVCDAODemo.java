import javax.swing.*; import java.awt.*; import java.util.*;
class Item4 {private int id;private String name;Item4(int id,String name){this.id=id;this.name=name;}public String toString(){return id+" - "+name;}}
interface ItemDAO4 {void save(Item4 x);java.util.List<Item4> all();}
class MemoryDAO4 implements ItemDAO4 {private final java.util.List<Item4> d=new ArrayList<>();public void save(Item4 x){d.add(x);}public java.util.List<Item4> all(){return new ArrayList<>(d);}}
public class W16E04_MVCDAODemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{ItemDAO4 dao=new MemoryDAO4();JFrame f=new JFrame("MVC DAO 4");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setSize(500,350);DefaultListModel<Item4> m=new DefaultListModel<>();JList<Item4> l=new JList<>(m);JTextField id=new JTextField(5),n=new JTextField(12);JButton save=new JButton("Save through DAO");
 save.addActionListener(e->{try{dao.save(new Item4(Integer.parseInt(id.getText()),n.getText()));m.clear();for(Item4 x:dao.all())m.addElement(x);}catch(Exception ex){JOptionPane.showMessageDialog(f,"Invalid input");}});JPanel p=new JPanel();p.add(id);p.add(n);p.add(save);f.add(p,BorderLayout.NORTH);f.add(new JScrollPane(l),BorderLayout.CENTER);f.setLocationRelativeTo(null);f.setVisible(true);});}
}
