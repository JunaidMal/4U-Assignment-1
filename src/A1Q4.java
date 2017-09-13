
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malij6756
 */
public class A1Q4 {

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

        // prints the astericks depending on the number the user inputted
        for (int i = 0; i < numbAst; i++) {
            System.out.print("*");
        }
        // creates space after astericks
        System.out.println("");
    }
}
