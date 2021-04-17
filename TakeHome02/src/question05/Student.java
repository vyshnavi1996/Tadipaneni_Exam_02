/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;
/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Student extends Person {


    private String grade;
    private final String Status= "Graduate";

    public Student(String grade, String name, String address, long phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public String getStatus() {
        return Status;
    }

    @Override
    public String toString() {
        return "Student Name: " +super.getName();
    }
}
   
