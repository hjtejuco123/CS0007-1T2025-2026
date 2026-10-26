import javax.swing.*;
class StudentModel3 {
 private int id; private String name; private String course;
 public StudentModel3(int id,String name,String course){this.id=id;this.name=name;this.course=course;}
 public int getId(){return id;} public String getName(){return name;} public String getCourse(){return course;}
 public String toString(){return id+" - "+name+" ("+course+")";}
}
public class W11E03_OOPModelDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  StudentModel3 s=new StudentModel3(103,"Student 3","BSIT");JFrame f=new JFrame("OOP Model 3");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setSize(470,220);
  f.add(new JLabel(s.toString(),SwingConstants.CENTER));f.setLocationRelativeTo(null);f.setVisible(true);
 });}
}
