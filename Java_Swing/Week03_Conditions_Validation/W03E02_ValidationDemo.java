import javax.swing.*; import java.awt.*;
public class W03E02_ValidationDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  JFrame f=new JFrame("Validation 2"); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); f.setSize(520,220); f.setLayout(new FlowLayout());
  JTextField t=new JTextField(18); JButton b=new JButton("Validate"); JLabel r=new JLabel(" ");
  b.addActionListener(e->{try{double v=Double.parseDouble(t.getText()); r.setText(v<0||v>100?"Invalid":v>=75?"Passed":"Failed");}catch(Exception ex){r.setText("Invalid input");}});
  f.add(new JLabel("Grade:"));f.add(t);f.add(b);f.add(r);f.setLocationRelativeTo(null);f.setVisible(true);
 });}
}
