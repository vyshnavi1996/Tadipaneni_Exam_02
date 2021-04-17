/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07_example01;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public enum Vehicle {

    CAR(4), TRUCK(6), BICYCLE(2);

    private int noOfTyres;

    private Vehicle(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public int getNoOfTyres() {
      return noOfTyres;
    }
}
