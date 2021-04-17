/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04_Inheritance;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Vehicle {

    public int noOfTyres;

    public Vehicle(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    @Override
    public String toString() {
        return "It has " + noOfTyres + " Tyres";
    }
}
