
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malij6756
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a scanner
        Scanner input = new Scanner(System.in);
        // array storing 3 numbers
        Double[] numbers = new Double[3];
        // Asks user for 3 numbers
        System.out.println("Please enter 3 numbers:");
        // Scans 3 doubles into the array
        for (int i = 0; i < 3; i++) {
            numbers[i] = input.nextDouble();
        }

        // Gets the product of all the numbers in the array
        double product = numbers[0] * numbers[1] * numbers[2];

        // Prints the Product, Squared value of the product, and square root of the product
        System.out.println("Product: " + product);
        System.out.println("Squared: " + Math.pow(product, 2));
        System.out.println("Square Root: " + Math.sqrt(product));
    }
}
