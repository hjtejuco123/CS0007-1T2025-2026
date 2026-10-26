import javax.swing.*; import java.awt.*;
public class W01E05_FrameLabelDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  JFrame f=new JFrame("Mini Dashboard"); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); f.setSize(520,240);
  JLabel l=new JLabel("Students: 120 | Courses: 8 | Sections: 5",SwingConstants.CENTER); l.setFont(new Font("SansSerif",Font.BOLD,22)); f.add(l);
  f.setLocationRelativeTo(null); f.setVisible(true);
 });}
}
