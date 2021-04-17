/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Question01 {

    public static void removeDuplicate(ArrayList<Integer> list) {

        ArrayList<Integer> distinctList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!distinctList.contains(list.get(i))) {
                distinctList.add(list.get(i));
            }
        }

        System.out.print("The distinct integers are ");
        for (int i = 0; i < distinctList.size(); i++) {
            System.out.print(distinctList.get(i) + " ");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for question 01 : Vyshnavi Tadipaneni");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter ten integers: ");
        while (list.size() < 10) {
            list.add(sc.nextInt());
        }
        removeDuplicate(list);
    }
}
