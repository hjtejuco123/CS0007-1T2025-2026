import javax.swing.*; import java.awt.*;
public class W05E03_SelectionControlsDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  JFrame f=new JFrame("Selection Controls 3");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setSize(520,260);f.setLayout(new FlowLayout());
  JCheckBox a=new JCheckBox("Java"), b=new JCheckBox("Database"); JRadioButton x=new JRadioButton("Beginner",true), y=new JRadioButton("Advanced");
  ButtonGroup g=new ButtonGroup();g.add(x);g.add(y);JButton show=new JButton("Show Selection");
  show.addActionListener(e->JOptionPane.showMessageDialog(f,"Java="+a.isSelected()+", Database="+b.isSelected()+", Level="+(x.isSelected()?"Beginner":"Advanced")));
  f.add(a);f.add(b);f.add(x);f.add(y);f.add(show);f.setLocationRelativeTo(null);f.setVisible(true);
 });}
}
