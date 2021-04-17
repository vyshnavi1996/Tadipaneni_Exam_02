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
public enum DaysForMonth {

    JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31),
    AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);
    
    private int noOfDays;
    
    private DaysForMonth (int noOfDays) {
        this.noOfDays = noOfDays;
    }
    
}

