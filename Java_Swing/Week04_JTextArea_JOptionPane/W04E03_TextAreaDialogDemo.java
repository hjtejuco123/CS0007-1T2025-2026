import javax.swing.*; import java.awt.*;
public class W04E03_TextAreaDialogDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  JFrame f=new JFrame("Text Area Example 3");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setSize(560,360);
  JTextArea a=new JTextArea();a.setLineWrap(true);a.setWrapStyleWord(true);JButton b=new JButton("Run Action");
  b.addActionListener(e->{if(JOptionPane.showConfirmDialog(f,"Clear all text?","Confirm",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)a.setText("");});f.add(new JScrollPane(a),BorderLayout.CENTER);f.add(b,BorderLayout.SOUTH);
  f.setLocationRelativeTo(null);f.setVisible(true);
 });}
}
