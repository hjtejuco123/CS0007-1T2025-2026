import javax.swing.*; import java.awt.*; import java.io.*; import java.nio.file.*;
public class W10E01_FileHandlingDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  JFrame f=new JFrame("File Handling 1");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setSize(600,400);JTextArea a=new JTextArea();
  JButton save=new JButton("Save"),load=new JButton("Load");String file="week10_example_1.txt";
  save.addActionListener(e->{try{Files.writeString(Path.of(file),a.getText());JOptionPane.showMessageDialog(f,"Saved to "+file);}catch(IOException ex){JOptionPane.showMessageDialog(f,ex.getMessage());}});
  load.addActionListener(e->{try{a.setText(Files.readString(Path.of(file)));}catch(IOException ex){JOptionPane.showMessageDialog(f,ex.getMessage());}});
  JPanel p=new JPanel();p.add(save);p.add(load);f.add(new JScrollPane(a),BorderLayout.CENTER);f.add(p,BorderLayout.SOUTH);f.setLocationRelativeTo(null);f.setVisible(true);
 });}
}
