/**
 * Class: Cylinder
 * Author: William Chokbengboune
 * Written: 2/2/23
 * Version: 1.0
 * Description: This program is meant to take a numerical value entered by the user
 * and calculates the area and volume of a cylinder
 */

import java.util.Scanner;
public class Cyclinder{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height: ");
        double height = input.nextDouble();
        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();
        double pi = 3.1416;
        double volume = pi * radius * radius * height;
        double area = pi * radius * radius;
        System.out.printf("The base area of the circle is %.2f.",area);
        System.out.printf("The volume of the cylinder is %.2f.",volume);
    }
}
