import javax.swing.*; import java.awt.*;
public class W03E05_ValidationDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  JFrame f=new JFrame("Validation 5"); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); f.setSize(520,220); f.setLayout(new FlowLayout());
  JTextField t=new JTextField(18); JButton b=new JButton("Validate"); JLabel r=new JLabel(" ");
  b.addActionListener(e->{try{double v=Double.parseDouble(t.getText()); double d=v>=5000?.20:v>=2000?.10:0; r.setText(String.format("Final %.2f",v*(1-d)));}catch(Exception ex){r.setText("Invalid input");}});
  f.add(new JLabel("Purchase Amount:"));f.add(t);f.add(b);f.add(r);f.setLocationRelativeTo(null);f.setVisible(true);
 });}
}
