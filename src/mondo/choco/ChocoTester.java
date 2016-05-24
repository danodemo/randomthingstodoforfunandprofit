package mondo.choco;

import java.util.Scanner;

/**
 * Created by danarchy on 5/24/16.
 */
public class ChocoTester {

    public static Scanner lineScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Choco-Boxer.");
        userInput();
    }

    public static void userInput(){
        System.out.println("How many small bars (1-99)?");
        int small = Integer.parseInt(lineScanner.next());
        System.out.println("How many big bars (1-99)?");
        int big = Integer.parseInt(lineScanner.next());
        System.out.println("How many KG of choco in this box?");
        int goal = Integer.parseInt(lineScanner.next());
        int barsneeded = makeChocolate(small, big, goal);
        if (barsneeded == -1){
            System.out.println("Looks like there aren't enough bars in that box.  You're fired.");
            userInput();
        } else {
            System.out.println("It will take " + barsneeded + " small bars to make this work.");
            userInput();
        }
    }

    public static int makeChocolate(int small, int big, int goal) {
        int bigsNeeded = goal/5;
        if(bigsNeeded > big){
            bigsNeeded = big;
        }
        int adjustedGoal = goal - (bigsNeeded*5);
        if(small + (big*5) < goal || adjustedGoal > small) {
            return -1;
        } else {
            return adjustedGoal;
        }
    }

}
