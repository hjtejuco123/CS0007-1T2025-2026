import javax.swing.*;
class StudentModel5 {
 private int id; private String name; private String course;
 public StudentModel5(int id,String name,String course){this.id=id;this.name=name;this.course=course;}
 public int getId(){return id;} public String getName(){return name;} public String getCourse(){return course;}
 public String toString(){return id+" - "+name+" ("+course+")";}
}
public class W11E05_OOPModelDemo {
 public static void main(String[] args){SwingUtilities.invokeLater(()->{
  StudentModel5 s=new StudentModel5(105,"Student 5","BSIT");JFrame f=new JFrame("OOP Model 5");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setSize(470,220);
  f.add(new JLabel(s.toString(),SwingConstants.CENTER));f.setLocationRelativeTo(null);f.setVisible(true);
 });}
}
