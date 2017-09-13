
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malij6756
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating scanner
        Scanner input = new Scanner(System.in);
        // Outputs message asking for name
        System.out.println("Please enter your name:");
        // Scans in word inputted as string "name"
        String name = input.nextLine();
        // Outputs name with message
        System.out.println("Hello " + name + "!");
    }
}
