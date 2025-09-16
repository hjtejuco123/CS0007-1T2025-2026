package Module4;
//arrays
//create a program to store 5 student names and display them
//syntax datatype[] arrayName = new datatype[size];
//or datatype[] arrayName = {value1, value2, value3, ...};
public class sample8 {
    public static void main(String[] args) {
        String[] studentNames = new String[10];
        studentNames[0] = "Alice";
        studentNames[1] = "Bob";
        studentNames[2] = "Charlie";
        studentNames[3] = "David";
        studentNames[4] = "Eva";
        studentNames[5] = "Frank";
        studentNames[6] = "Grace";
        studentNames[7] = "Hannah";
        studentNames[8] = "Ian";
        studentNames[9] = "Jack";         

        System.out.println("Student Names:");
        for (String name : studentNames) {
            System.out.println(name);
        }
        //use for loops to display the names
        //           i<=4
        for(int i=0; i<studentNames.length; i++){
            System.out.println(studentNames[i]);    
        }
    }
}
