/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package money.changer;
import java.util.Scanner;

/**
 *
 * @author Nwanwobi Samuel
 */
public class MoneyChanger {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        calculation();
    }
    
    public static void calculation(){
         // Variable decleration
        /**Here the variables involved are declared
         * The variable number gives the the number of coin needed for each denomination of currency
         * Change is the inputed value that the cashier owes the customer
         */
        int cents;
        int num;
        int coin[] = {25, 10, 5, 1};
      
        // Scanner for change input in a new line
        Scanner input_amount = new Scanner(System.in);
        System.out.println("Enter change: ");
        int change = input_amount.nextInt();
        /**
         * We need to use the for statement  
         */
        for (int i = 0; i < coin.length; i++){
            //the value for coin should be lesser than the change so that after division the quotient
            //and remainder canbe gotten. The quotient(num) gives the number of a particular value of coin needed
            //Division starts from the largest value of i that can go into change
            if (coin[i] <= change){
                num = change / coin[i];
               
                // the print statement to print the number of each coin value needed to optimally dispense change
                System.out.println(num + "   " + coin[i] + " cents");
                //updates the value of change after each iteration
                change -= num * coin[i];
            }
        }    
    }
}
