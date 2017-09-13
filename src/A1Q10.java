
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malij6756
 */
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner
        Scanner input = new Scanner(System.in);

        // used to hold the the value that counts the amount of words
        int wordnumb = 0;

        // a while loop stuck on true that can only be removed by a "break" when "exit" is typed in
        while (true) {

            // asks the user to enter a word and stores it as a string called "random"
            System.out.println("Enter a word:");
            String random = input.nextLine();

            // if the string entered is the word to exit the program, "exit", then the loop will break
            if (random.equals("exit")) {
                break;

                // if the string entered is not "exit", then the program adds +1 to the counter and loops back up
            } else {

                wordnumb++;
            }

        }

        // prints out the amount of words entered with a statement
        System.out.println("You typed in " + wordnumb + " words");

    }
}
