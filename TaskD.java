// Thomas Venegas
// CS 1400
// Assignment 
// 3/1/2021

import java.util.Scanner;
public class TaskD
{
    public static void main(String[] args)
    {
        double shortbread;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many shortbread do you want to make?");
        shortbread = keyboard.nextDouble();

        double OzButter = 4 * (shortbread/24);
        double OzSugar = 2 * (shortbread/24);
        double OzFlour = 6 * (shortbread/24);

        System.out.println("\nThe ingredients for " + shortbread + " shortbread are:\n");
        System.out.printf("Butter(oz): %7.2f\n", OzButter);
        System.out.printf("Sugar(oz): %7.2f\n", OzSugar);
        System.out.printf("Flour(oz): %7.2f\n", OzFlour);
    }
}
