/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // year int
        int year = 1999;

        // the population starts at 6 billion, using smaller scale numbers
        double population = 6;
        // x will hold the value that the population increases by yearly
        double x = 0;

        // while the population is less than 10 billion
        while (population <= 10) {

            // making x 1.4% of the current population the year recorded
            x = population * 0.014;
            // increasing the population by the amount it increases
            population += x;
            // updating the year to the next
            year++;
            // prints out the current stats of the year and population
            System.out.println("Year: " + year + " Population: " + population + " billion");
        }

        // placeholder to create space
        System.out.println("");

        // prints out the final message with the year the population will exceed 10 billion
        System.out.println("The population of Earth will exceed 10 billion by " + year);
    }
}
