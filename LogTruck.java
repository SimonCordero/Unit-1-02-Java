/**
* The Log Truck program allows a user to choose the length of logs
* and output how many logs of that length the truck can carry
* 
* @author  Simon Cordero
* @version 2.0
* @since   2020-02-14 
*/

import java.util.Scanner;

public class LogTruck {

  public static void main(String[] args) {
    
    // Question Line
    String Question = ("Enter the length of the logs in meters.");
    System.out.println(Question);
    
    // User input
    Scanner input = new Scanner(System.in);
    System.out.println("Acceptable choices are 0.25, 0.5, and 1:   ");
    double number = input.nextDouble();
    
    // Calculation
    double max = 1100 / (20 * number); 
    
    // Output
    System.out.println("The truck can carry " + max + " logs that are " + number + " meters long.");
  }  
}  