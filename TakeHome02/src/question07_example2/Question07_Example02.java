/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07_example2;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Question07_Example02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question07_Example2 : Vyshnavi Tadipaneni");
         DaysForMonth daysForMonth[] = DaysForMonth.values();
        System.out.println("Months in an year:");
        for (DaysForMonth daysCount : daysForMonth) {
            System.out.println(daysCount);
        }
    }
    
}
