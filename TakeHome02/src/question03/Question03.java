/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Question03 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 03 : Vyshnavi Tadipaneni");
        Loan loan = new Loan(25000);
        Circle circle = new Circle(50);
        ArrayList<Object> arrayList = new ArrayList<>();
        Date date = new Date();
        String string = new String("new string\n");

        arrayList.add(loan);
        arrayList.add(circle);
        arrayList.add(string);
        arrayList.add(date);
        System.out.println(arrayList.toString());

    }
}
