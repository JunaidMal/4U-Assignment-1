
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malij6756
 */
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // new scanner
        Scanner input = new Scanner(System.in);

        // creating an array to hold all 10 words
        String[] words = new String[9];

        // the length of each word is added onto this integer to get the total length
        int totalLength = 0;

        // requests user to input 10 words
        System.out.println("Please enter 10 words:");


        // allows the user to input 10 words, stores it into an array
        for (int i = 0; i < 10; i++) {
            words[i] = input.nextLine();
            // the stored number in the array will have it's length added to totalLength
            totalLength += words[i].length();
        }

        // divides the length of all of the words combined by 10 to get the average number of letters in a word
        totalLength /= 10;

        // outputs the average length of all the words inputted to the user
        System.out.println("The average word length is " + totalLength + " letters");

    }
}
