/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Robert Uriarte
 */
import java.util.Scanner;
import java.time.YearMonth;

public class Exercise6 {
    public static void main(String[] args){ //Program to tell you what year you can retire based on current age
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your current age? ");
        int age = scan.nextInt();
        System.out.print("At what age would you like to retire? ");
        int retire = scan.nextInt();

        System.out.println("You have " + (retire - age) + " Years until you can retire.");

        int current_year = YearMonth.now().getYear();
        System.out.print("It's " + current_year +", so you can retire in " + (current_year + (retire-age)) + ".");
    }
}
