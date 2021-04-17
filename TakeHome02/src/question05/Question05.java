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
public class Question05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question05 : Vyshnavi Tadipaneni");
        
        Person person = new Person("vyshnavi", "address",123456789,"vyshnavi.t14@gmail.com");
        System.out.println(person.toString());

        Employee employee = new Employee("TMobile",5000,"14-12-2016","vyshnavi","address",123456789,"vyshnavi.t14@gmail.com");
        System.out.println(employee.toString());

        Faculty faculty = new Faculty(3,3,"professor",5000,"14/12/2016","vyshnavi","address",123456789,"vyshnavi.t14@gmail.com");
        System.out.println(faculty.toString());

        Staff staff = new Staff("GA","TMobile",5000,"14/12/2016","vyshnavi","address",123456789,"vyshnavi.t14@gmail.com");
        System.out.println(staff.toString());

        Student student = new Student("B","vyshnavi","address",123456789,"vyshnavi.t14@gmail.com");
        System.out.println(student.toString());
               
    }
    
}
