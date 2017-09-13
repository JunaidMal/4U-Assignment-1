
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malij6756
 */
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner
        Scanner input = new Scanner(System.in);

        int year = 0;
        double initial = 0;
        double balance = 0;
        double rate = 0;

        System.out.println("Please input the Initial Amount: ");
        initial = input.nextDouble();

        System.out.println("Please input the interest rate in percent amount: ");
        rate = input.nextDouble();

        balance = initial;

        // until the balance doubles
        while (balance < initial * 2) {
            // the balance will increase by the interest rate converted from percent form to decimal form
            balance = (1 + (rate / 100)) * balance;
            // adds + 1 to the year and moves to the next
            year++;
        }
        // gives the user the years until their money will double
        System.out.println("Your money will double in " + year + " years.");

        // resets balance back to original initial amount
        balance = initial;

        // while the user has less than 1 million dollars
        while (balance < 1000000) {
            // the balance will increase by the interest rate converted from percent form to decimal form
            balance = (1 + (rate / 100)) * balance;
            // adds another +1 to the year and moves onto the next year
            year++;
        }

        // creates space then prints out the # years until the user reaches 1 million dollars
        System.out.println("");
        System.out.println("You will have 1 million dollars in " + year + " years.");

    }
}
