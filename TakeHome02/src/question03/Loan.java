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
public class Loan {
    
    private int loanAmount;
    
    @Override
    public String toString() {
        return "Loan amount is: " + loanAmount+"\n";
    }
    
    public Loan(int loanAmountIn) {
        this.loanAmount = loanAmountIn;
    }
}
