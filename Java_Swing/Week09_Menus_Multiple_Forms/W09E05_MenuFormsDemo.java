import javax.swing.*; import java.awt.*;
public class W09E05_MenuFormsDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  JFrame f=new JFrame("Menu/Form 5");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setSize(620,360);
  JMenuBar bar=new JMenuBar();JMenu menu=new JMenu("Navigate");JMenuItem open=new JMenuItem("Open Form"),about=new JMenuItem("About"),exit=new JMenuItem("Exit");
  open.addActionListener(e->{JFrame c=new JFrame("Child Form");c.setSize(350,200);c.add(new JLabel("Secondary Form",SwingConstants.CENTER));c.setLocationRelativeTo(f);c.setVisible(true);});
  about.addActionListener(e->JOptionPane.showMessageDialog(f,"Java Swing Multi-Form Example"));exit.addActionListener(e->f.dispose());
  menu.add(open);menu.add(about);menu.addSeparator();menu.add(exit);bar.add(menu);f.setJMenuBar(bar);f.add(new JLabel("Use the menu",SwingConstants.CENTER));
  f.setLocationRelativeTo(null);f.setVisible(true);
 });}
}
