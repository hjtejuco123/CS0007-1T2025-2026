
package com.mycompany.studentrecordmanagementsystem;

public class Student {

    public int id;
    public int yearLevel;

    public String studentNumber;
    public String firstName;
    public String lastName;
    public String gender;
    public String course;
    public String email;
    public String contactNumber;

    public Student(
            int id,
            String studentNumber,
            String firstName,
            String lastName,
            String gender,
            String course,
            int yearLevel,
            String email,
            String contactNumber) {

        this.id = id;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.course = course;
        this.yearLevel = yearLevel;
        this.email = email;
        this.contactNumber = contactNumber;
    }
}
