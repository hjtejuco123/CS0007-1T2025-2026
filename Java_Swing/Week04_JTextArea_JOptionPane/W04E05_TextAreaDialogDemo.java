import javax.swing.*; import java.awt.*;
public class W04E05_TextAreaDialogDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  JFrame f=new JFrame("Text Area Example 5");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setSize(560,360);
  JTextArea a=new JTextArea();a.setLineWrap(true);a.setWrapStyleWord(true);JButton b=new JButton("Run Action");
  b.addActionListener(e->{JOptionPane.showMessageDialog(f,"Preview:\n"+a.getText());});f.add(new JScrollPane(a),BorderLayout.CENTER);f.add(b,BorderLayout.SOUTH);
  f.setLocationRelativeTo(null);f.setVisible(true);
 });}
}
