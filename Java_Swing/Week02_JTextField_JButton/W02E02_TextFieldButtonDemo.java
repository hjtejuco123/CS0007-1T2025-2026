import javax.swing.*; import java.awt.*;
public class W02E02_TextFieldButtonDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  JFrame f=new JFrame("Example 2"); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); f.setSize(460,210); f.setLayout(new FlowLayout());
  JTextField t=new JTextField(15); JButton b=new JButton("Double It"); JLabel r=new JLabel(" ");
  b.addActionListener(e->{try{double v=Double.parseDouble(t.getText());r.setText(String.valueOf(v*2));}catch(Exception ex){r.setText("Invalid number");}}); f.add(new JLabel("First Number:")); f.add(t); f.add(b); f.add(r);
  f.setLocationRelativeTo(null); f.setVisible(true);
 });}
}
