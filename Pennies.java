import java.util.Scanner;
/**
 * Ask user for a number of days.
 * Starting with a penny on the first day,
 * The amount earned doubles each day.
 * 
 * Table will be printed displaying the amounts
 * earned by day
 */

public class Pennies {
    public static void main(String[] args) {
        
        // Initialize variables
        int days;
        int earnHold = 2; // Temporarily holds daily value
        double total = 0; // # of days user earns money

        // Create input object
        Scanner scan = new Scanner(System.in);

        // Ask user number of days earning
        System.out.println("How many days will you be earning money?");
        days = scan.nextInt();

        //Create table
        System.out.println("Days\tEarnings");
        System.out.println("----------------");
        for (int i = 1; i <= days; i++) {
            if ((double)earnHold/100 < 1.08E7) {
            System.out.println(i + "\t" + (double)earnHold/100);
            total += earnHold;
            earnHold *= 2;}
        }
        System.out.println("Total:\t" + total);

    }
}
