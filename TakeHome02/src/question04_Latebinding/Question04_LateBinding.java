/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04_Latebinding;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Question04_LateBinding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question04_LateBinding : Vyshnavi Tadipaneni");
        Vehicle car = new Car();
        car.print();
        car = new Vehicle();
        car.print();
    }
}
