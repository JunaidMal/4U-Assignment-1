
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malij6756
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        //   food, DJ, the hall rental, the decorations, the wait staff, and any miscellaneous expenses
        // New scanner 
        Scanner input = new Scanner(System.in);

        // Creating an array to hold all of the expenses
        Double expenses[] = new Double[6];

        // Asks for and scans in all of the expenses to an array
        System.out.println("Please enter how much was spent on food:");
        expenses[0] = input.nextDouble();
        System.out.println("Please enter how much was spent on hiring the DJ:");
        expenses[1] = input.nextDouble();
        System.out.println("Please enter how much was spent on renting the hall:");
        expenses[2] = input.nextDouble();
        System.out.println("Please enter how much was spent on decorations:");
        expenses[3] = input.nextDouble();
        System.out.println("Please enter how much was spent on the waiter staff:");
        expenses[4] = input.nextDouble();
        System.out.println("Please enter any miscellaneous expenses:");
        expenses[5] = input.nextDouble();

        // new double to hold the total expenses
        double totalExpenses = 0;

        // Adds all of the expenses into a total product using a for loop
        for (int i = 0; i < 6; i++) {
            totalExpenses = totalExpenses + expenses[i];
        }
        // Prints out the total expenses to the user
        System.out.println("The total expenses will be $" + totalExpenses);

        // Finds out how many tickets are needed to pay the expenses then rounds up to maximize profits
        // Prints the amount of tickets needed to the user
        System.out.println("To break even, you would need to sell " + Math.ceil(totalExpenses / 35) + " tickets.");
    }
}
