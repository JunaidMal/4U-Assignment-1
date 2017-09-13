
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malij6756
 */
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // integer that counts down
        int countdown = 100;
        // new scanner
        Scanner input = new Scanner(System.in);

        // asks the user to input a # between 50 and 100
        System.out.println("Please enter a number between 50 and 100:");

        // takes inputted number as "number"
        int number = input.nextInt();

        // Makes sure that the program runs on a number between 50 and 100
        if (number >= 50 && number <= 100) {

            // once the countdown reaches a number +5 from the inputted number, the program will stop at the last number that it reached
            while (countdown >= number + 5) {

                // prints countdown and subtracts 5 each time, this counting down
                System.out.println(countdown);
                countdown -= 5;

            }
            // prints out the final countdown closest and greater to "number" when countdown is going down by 5
            System.out.println(countdown);

        }




    }
}
