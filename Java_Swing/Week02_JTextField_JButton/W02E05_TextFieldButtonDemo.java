import javax.swing.*; import java.awt.*;
public class W02E05_TextFieldButtonDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  JFrame f=new JFrame("Example 5"); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); f.setSize(460,210); f.setLayout(new FlowLayout());
  JTextField t=new JTextField(15); JButton b=new JButton("Echo"); JLabel r=new JLabel(" ");
  b.addActionListener(e->{r.setText("Entered: "+t.getText());}); f.add(new JLabel("Weight kg:")); f.add(t); f.add(b); f.add(r);
  f.setLocationRelativeTo(null); f.setVisible(true);
 });}
}
