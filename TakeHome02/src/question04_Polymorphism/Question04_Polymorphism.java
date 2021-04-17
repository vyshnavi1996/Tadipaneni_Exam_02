/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04_Polymorphism;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Question04_Polymorphism {

    void myDetails(String firstName, String lastName) {
        System.out.println("First Name: " + firstName + ", Last Name: " + lastName);
    }

    void myDetails(String firstName, String middleName, String lastName) {
        System.out.println("First Name: " + firstName + ", Middle Name: "
                + middleName + ", Last Name: " + lastName);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question04_Polymorphism : Vyshnavi Tadipaneni");
        Question04_Polymorphism obj = new Question04_Polymorphism();
        obj.myDetails("Vyshnavi", "Tadipaneni");
        obj.myDetails("Vyshnavi", "", "Tadipaneni");
    }

}
