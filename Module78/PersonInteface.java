
package Module78;

interface PersonInterface {
    String getName();
    int getAge();
}

abstract class Person implements PersonInterface {
    protected String name;
    protected int age;
    
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public int getAge(){
        return age;
    
    }
    
    public abstract void displayInfo();
    
}

class Student extends Person {
    private String studentId;
    
    public Student (String name, int age, String studentId){
        super(name, age);
        this.studentId = studentId;
    } 
    
    @Override
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Student Id: "+studentId);
    
    }
}
    
class Employee extends Person {
    private String employeeId;
    private String department;
    
    public Employee (String name, int age, String employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    
    }
    @Override
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Department: "+department);
    
    }

}
    


