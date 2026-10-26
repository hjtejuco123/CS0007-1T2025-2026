import javax.swing.*; import java.awt.*;
public class W02E03_TextFieldButtonDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  JFrame f=new JFrame("Example 3"); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); f.setSize(460,210); f.setLayout(new FlowLayout());
  JTextField t=new JTextField(15); JButton b=new JButton("Convert"); JLabel r=new JLabel(" ");
  b.addActionListener(e->{try{double v=Double.parseDouble(t.getText());r.setText(String.format("%.2f F",v*9/5+32));}catch(Exception ex){r.setText("Invalid");}}); f.add(new JLabel("Celsius:")); f.add(t); f.add(b); f.add(r);
  f.setLocationRelativeTo(null); f.setVisible(true);
 });}
}
