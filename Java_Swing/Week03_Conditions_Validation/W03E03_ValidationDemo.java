import javax.swing.*; import java.awt.*;
public class W03E03_ValidationDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  JFrame f=new JFrame("Validation 3"); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); f.setSize(520,220); f.setLayout(new FlowLayout());
  JTextField t=new JTextField(18); JButton b=new JButton("Validate"); JLabel r=new JLabel(" ");
  b.addActionListener(e->{try{String v=t.getText().trim(); r.setText(v.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")?"Valid":"Invalid email");}catch(Exception ex){r.setText("Invalid input");}});
  f.add(new JLabel("Email:"));f.add(t);f.add(b);f.add(r);f.setLocationRelativeTo(null);f.setVisible(true);
 });}
}
