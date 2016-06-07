package mondo.threadracer;

import java.util.Scanner;

/**
 * Created by danarchy on 6/7/16.
 */
public class ThreadRacerMain {

    public static Scanner lineScanner = new Scanner(System.in);
    public static int racers = 1;

    public static void main(String[] args){
        welcome();
        race();
        println("Race over!");
    }

    private static void race() {
        print("\r0");
        for(int count = 20; count >= 0; count--) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            print("-");
        }
    }

    private static void welcome() {
        println("Welcome to Thread racer!");
        println("How many racers (1-5) are competing?");
        racers = Integer.parseInt(lineScanner.nextLine());
    }

    private static void println(String message){
        System.out.println(message);
    }

    private static void print(String message){
        System.out.print(message);
    }

    private static void sleep(int sleeptime) throws InterruptedException {
        Thread.sleep(sleeptime);
    }

}
