
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malij6756
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // New scanner
        Scanner input = new Scanner(System.in);

        // Asks the user to input a number between 1 and 10
        System.out.println("Please input a number between 1 and 10");

        // stores inputted number as numbAst
        int numbAst = input.nextInt();

        // loop that creates the columns
        for (int x = 0; x < numbAst; x++) {

            // prints the astericks depending on the number the user inputted - ROWS
            for (int i = 0; i < numbAst; i++) {
                System.out.print("*");
            }
            // creates space after astericks for the next line
            System.out.println("");
        }
    }
}