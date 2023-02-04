/**
 * Class: Time
 * Author: William Chokbengboune
 * Written: 2/2/23
 * Version: 1.0
 * Description: This programs take the amount of seconds given by the user and turns it into hours, minutes, seconds
 */

import java.util.Scanner;
public class Time {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number of seconds: ");
        int totalSeconds = in.nextInt();
        int hours = totalSeconds/3600;
        int secondsRemain = totalSeconds%3600;
        int minutes = secondsRemain/60;
        int seconds = secondsRemain%60;
        System.out.println("If the total amount of seconds is " + totalSeconds +
                ", there is " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds." );

    }
}
