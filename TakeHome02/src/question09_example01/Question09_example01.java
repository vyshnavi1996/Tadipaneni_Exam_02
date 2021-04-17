/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09_example01;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Question09_example01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Answer for question09_example01 : Vyshnavi Tadipaneni");
        Solid x;
        x = new Square();
        System.out.println("Square has " + x.getNoOfSides() + " sides");
        
        x = new Triangle1();
        System.out.println("Triangle has " + x.getNoOfSides() + " sides");
    }
}
