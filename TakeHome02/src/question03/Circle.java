/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class Circle {
    private int perimeter;
    
    public Circle(int perimeter) {
        this.perimeter = perimeter;
    }
    
    @Override
    public String toString(){
        return "Perimeter of circle is:" + perimeter+"\n";
    }
}
