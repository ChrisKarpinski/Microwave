/****************************************************************************
 *
 * Created by: Chris Karpinski
 * Created on: Sept 2016
 * This program calculates the time a meal should be in the microwave for
 *
 ****************************************************************************/

import java.util.Scanner;

public class microwave {

     public static void main(String[] args) {

     String itemName;
     int numberOfPortions;
     double itemTime;
     double totalTime;

     Scanner scan = new Scanner(System.in);

     for (;;) {
     System.out.println("Enter the item to be microwaved");
     itemName = scan.next();

     if (itemName.equals("pizza")) {

         itemTime = 0.75;

     }

     else if (itemName.equals("sub")) {

         itemTime = 1;

     }

     else if (itemName.equals("soup")) {

         itemTime = 1.75;

     }

     while (!(itemName.equals("pizza") || itemName.equals("sub") || itemName.equals("soup"))) {

         System.out.println("Invalid input, please re-enter");
         System.out.println("Enter the item to be microwaved");
         itemName = scan.next();
     }

     System.out.println("Enter the number of portions");
     numberOfPortions = scan.nextInt();

     while (!(numberOfPortions == 1 || numberOfPortions == 2 || numberOfPortions == 3)) {

         System.out.println("Enter the number of portions");
         numberOfPortions = scan.nextInt();

     }
     System.out.println("The total microwave time is: " + numberOfPortions*itemTime + " minutes");

     }

     }

}
