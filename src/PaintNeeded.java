/**
 * Class: PaintNeeded
 * Author: William Chokbengboune
 * Written: 2/2/23
 * Version: 1.0
 * Description: This program will calculate the amount of space needed for the room
 */
import java.util.Scanner;

public class PaintNeeded {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height: ");
        int height = in.nextInt();
        System.out.println("Enter the length: ");
        int length = in.nextInt();
        System.out.println("Enter the width: ");
        int width = in.nextInt();
        System.out.println("Enter the number of doors: ");
        int numberOfDoor = in.nextInt();
        System.out.println("Enter the number of windows: ");
        int numberOfWindow = in.nextInt();
        int doors = 21; // this is the sq ft of doors
        int window = 15; // this is the sq ft of window
        int gallon = 350; // this is the amount of space 1 gallon of paint covers
        int maximumArea = length * width * height;
        int exclusions = (window * numberOfWindow) + (doors * numberOfDoor);
        int areaToCover = maximumArea - exclusions;
        int amountOfPaintNeeded = areaToCover/gallon;
        System.out.println(amountOfPaintNeeded + " gallons is needed to cover the whole area.");
    }
}

