/*
 * Made by: Ismail Munawar
 * 2024 - 10 - 28
 * Practice Project - Robot Waiter
 */
import java.util.Scanner;

public class robotWaiter {
    public static void main() {
        Scanner inputScanner = new Scanner(System.in);

        // Prices and rates
        final double adultPrice = 30.00;         // Price per adult
        final double teenagerPrice = 15.00;      // Price for ages 12-18
        final double drinkPrice = 2.99;           // Price per drink
        final double automaticTipRate = 0.18;     // Automatic tip for groups over 20 adults
        final double taxRate = 0.13;              // Tax rate (13%)

        System.out.print("Welcome to the restaurant! The starting rate for dining here is as follows:\n");
        System.out.println("Adult Price - $30.00");
        System.out.println("Children below 12 - Eat free ($0)");
        System.out.println("Children ages 12-18 - $15.00");
        System.out.println("An Automatic tip of 18% will be applied for groups over 20 adults");
        System.out.println("Drinks Price - $2.99");

        // Input Data
        System.out.print("Enter the number of adults you have brought with you today: ");
        int adultCount = inputScanner.nextInt();

        System.out.print("Enter the number of children below 12 accompanying you: ");
        int childUnder12Count = inputScanner.nextInt();

        System.out.print("Enter the number of teenagers (ages 12-18) accompanying you: ");
        int teenagerCount = inputScanner.nextInt();

        System.out.print("Enter the number of drinks you wish to order: ");
        int drinkCount = inputScanner.nextInt();

        // Calculate subtotal for adults, teenagers, and drinks
        double adultSubtotal = adultCount * adultPrice; // Subtotal for adults
        double teenagerSubtotal = teenagerCount * teenagerPrice; // Subtotal for teenagers
        double childSubtotal = 0; // Children below 12 eat free
        double drinkSubtotal = drinkCount * drinkPrice; // Subtotal for drinks
        double overallSubtotal = adultSubtotal + teenagerSubtotal + childSubtotal + drinkSubtotal; // Overall subtotal 

        // Calculate tip using if-else for group party
        double calculatedTax;
        if (adultCount >= 20) {
            calculatedTax = overallSubtotal * automaticTipRate; // Apply automatic tip for large groups
        } else {
            calculatedTax = overallSubtotal * taxRate; // Apply standard tax
        }

        // Calculate final total
        double totalBillBeforeTip = overallSubtotal + calculatedTax;

        // Output the bill before tip
        System.out.println("Your bill so far is -->\n" +
                "Subtotal for Adults: $" + adultSubtotal + "\n" +
                "Subtotal for Teenagers: $" + teenagerSubtotal + "\n" +
                "Subtotal for Children: $0\n" +
                "Subtotal for Drinks: $" + drinkSubtotal + "\n" +
                "Subtotal: $" + overallSubtotal + "\n" +
                "Tax: $" + calculatedTax + "\n" +
                "Total Bill: $" + totalBillBeforeTip + "\n" +
                "Do you want to add a tip? (yes/no)");

        String wantsTip = inputScanner.next();

        double tipAmount = 0; // Initialize tip variable

        // Determine the tip amount based on the input
        if (wantsTip.equals("yes")) {
            System.out.print("Enter tip amount in dollars: ");
            tipAmount = inputScanner.nextDouble(); // Directly take the dollar tip amount
        } else if (wantsTip.equals("no")) {
            System.out.println("Thank you for joining us!");
        }

        double totalBillWithTip = overallSubtotal + calculatedTax + tipAmount;
        // Output the bill after tip
        System.out.println("Your final bill is as follows:\n" +
                "Subtotal for Adults: $" + adultSubtotal + "\n" +
                "Subtotal for Teenagers: $" + teenagerSubtotal + "\n" +
                "Subtotal for Children (under 12): $0\n" +
                "Subtotal for Drinks: $" + drinkSubtotal + "\n" +
                "Subtotal: $" + overallSubtotal + "\n" +
                "Tax: $" + calculatedTax + "\n" +
                "Total Bill: $" + totalBillWithTip);

    }
}
