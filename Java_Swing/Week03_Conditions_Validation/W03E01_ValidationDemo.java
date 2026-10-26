import javax.swing.*; import java.awt.*;
public class W03E01_ValidationDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  JFrame f=new JFrame("Validation 1"); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); f.setSize(520,220); f.setLayout(new FlowLayout());
  JTextField t=new JTextField(18); JButton b=new JButton("Validate"); JLabel r=new JLabel(" ");
  b.addActionListener(e->{try{int v=Integer.parseInt(t.getText()); r.setText(v>=0&&v<=130?(v>=18?"Adult":"Minor"):"Invalid age");}catch(Exception ex){r.setText("Invalid input");}});
  f.add(new JLabel("Age:"));f.add(t);f.add(b);f.add(r);f.setLocationRelativeTo(null);f.setVisible(true);
 });}
}
