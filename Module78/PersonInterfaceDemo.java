
package Module78;


public class PersonInterfaceDemo {
    public static void main(String[] args) {
        //create object
        
        Student student = new Student ("Hadji",20,"S123456");
        
        Employee emp = new Employee ("James",23,"ID101","ABC");
        
        System.out.println("Student Information");
        student.displayInfo();
        
        System.out.println();
        
        System.out.println("Employee Information");
        emp.displayInfo();
        
    }
}
