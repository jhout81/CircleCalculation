//import package

import java.util.Scanner;

//outputs diameter, area, and circumference of a circle based on user input
public class CircleCalculation {

    public static void main(String[] args) {
        //initializing scanner
        Scanner in = new Scanner(System.in);
        //initializing variable rad
        double rad;
        //printing out statement to screen asking for radius input
        System.out.print("Please enter a radius of a circle in centimeters: ");
        //storing keyboard input into rad variable from scanner
        rad = in.nextDouble();
        //printing out diameter results and formatting to 2 decimal places and newline
        System.out.printf("The diameter is: %.2f%n", computeDiameter(rad));
        //printing out area results and formatting to 2 decimal places and newline
        System.out.printf("The area is: %.2f%n", computeArea(rad));
        //printing out circumference results and formatting to 2 decimal places and newline
        System.out.printf("The circumference is: %.2f%n", computeCircumference(rad));
    }

    //function that computes Diameter and takes one parameter
    public static double computeDiameter(double radius) {
        //local variable that computes diameter
        double diameter = 2 * radius;
        //returns diameter
        return diameter;
    }

    //function that computes Area and takes one parameter
    public static double computeArea(double radius) {
        //local variable that computes area
        double area = Math.PI * Math.pow(radius, 2);
        //returns diameter
        return area;
    }

    //function that computes Circumference and takes one parameter
    public static double computeCircumference(double radius) {
        //local variable that computes circumference
        double circumference = 2 * Math.PI * radius;
        //returns circumference
        return circumference;
    }

}

