import javax.swing.*; import java.awt.*;
public class W01E03_FrameLabelDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  JFrame f=new JFrame("System Banner"); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); f.setSize(520,240);
  JLabel l=new JLabel("Java Desktop Application",SwingConstants.CENTER); l.setFont(new Font("SansSerif",Font.BOLD,22)); f.add(l);
  f.setLocationRelativeTo(null); f.setVisible(true);
 });}
}
