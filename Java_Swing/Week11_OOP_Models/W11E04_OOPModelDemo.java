import javax.swing.*;
class StudentModel4 {
 private int id; private String name; private String course;
 public StudentModel4(int id,String name,String course){this.id=id;this.name=name;this.course=course;}
 public int getId(){return id;} public String getName(){return name;} public String getCourse(){return course;}
 public String toString(){return id+" - "+name+" ("+course+")";}
}
public class W11E04_OOPModelDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  StudentModel4 s=new StudentModel4(104,"Student 4","BSIT");JFrame f=new JFrame("OOP Model 4");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setSize(470,220);
  f.add(new JLabel(s.toString(),SwingConstants.CENTER));f.setLocationRelativeTo(null);f.setVisible(true);
 });}
}
