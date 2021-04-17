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
public class Car extends Vehicle{

    public String model;

    public Car(String model, int noOfTyres) {
        super(noOfTyres);
        this.model = model;
    }
    
    
    @Override
    public String toString() {
        return "This model is " + model + " and " + super.toString();
    }

}
