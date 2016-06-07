package mondo.choco;

import java.util.Scanner;

/**
 * Created by danarchy on 5/24/16.
 */
public class ChocoTester {

    public static Scanner lineScanner = new Scanner(System.in);

    public static int bigsNeeded;
    public static int smallsNeeded;
    public static ChocoBox currentBox;

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
        currentBox = new ChocoBox(small, big, goal);
        int barsneeded = makeChocolate(small, big, goal);
        if (barsneeded == -1){
            System.out.println("Looks like there aren't enough bars in that box.  You're fired.");
            userInput();
        } else {
            println(" ");
            bigBox();
            smallBox();
            userInput();
        }
    }

    public static void bigBox(){
        println("It will take " + bigsNeeded + " big bars for this box:");
        bigBoxTop();
        for(int count = 0; count<5; count++) {
            bigMiddle();
        }
        bigBoxTop();
        println(" ");
    }

    public static void smallBox(){
        println("It will take " + smallsNeeded + " small bars for this box:");
        smallTop();
        smallMiddle();
        smallTop();
        println("");
    }

    public static String bigBoxTop(){ //try adding a single param that can be small or large bars, so you don't split these
        String topBottom = "------      ";
        for(int count = 1; count < bigsNeeded;count++){
            topBottom = topBottom + "------      ";
        }
        topBottom = topBottom + "\n";
        System.out.print(topBottom);
        return topBottom;
    }

    public static String bigMiddle(){
        String bigMiddle = "|    |      ";
        for(int count = 1; count < bigsNeeded;count++){
            bigMiddle = bigMiddle + "|    |      ";
        }
        bigMiddle = bigMiddle + "\n";
        System.out.print(bigMiddle);
        return bigMiddle;
    }

    public static String smallMiddle(){
        String smallMiddle = "|    |      ";
        for(int count = 1; count < smallsNeeded;count++){
            smallMiddle = smallMiddle + "|    |      ";
        }
        smallMiddle = smallMiddle + "\n";
        System.out.print(smallMiddle);
        return smallMiddle;
    }

    public static String smallTop(){
        String topBottom = "------      ";
        for(int count = 1; count < smallsNeeded;count++){
            topBottom = topBottom + "------      ";
        }
        topBottom = topBottom + "\n";
        System.out.print(topBottom);
        return topBottom;
    }


    public static int makeChocolate(int small, int big, int goal) {
        bigsNeeded = goal/5;
        if(bigsNeeded >= big){
            bigsNeeded = big;
        }
        int adjustedGoal = goal - (bigsNeeded*5);
        if(small + (big*5) < goal || adjustedGoal > small) {
            return -1;
        } else {
            smallsNeeded = adjustedGoal;
//            currentBox.smallsNeeded = adjustedGoal;
            return adjustedGoal;
        }
    }

//        public static void box(int smalls, int bigs){
//
//    }
//
//
//
//    public static String topAndBottom(int iteration){
//        String topBottom = "------      ";
//        for(int count = 1; count < iteration;count++){
//            topBottom = topBottom + "------      ";
//        }
//        topBottom = topBottom + "\n";
//        System.out.print(topBottom);
//        return topBottom;
//    }
//
//    public static String middle(int iteration){
//        String bigMiddle = "|    |      ";
//        for(int count = 1; count < iteration;count++){
//            bigMiddle = bigMiddle + "|    |      ";
//        }
//        bigMiddle = bigMiddle + "\n";
//        System.out.print(bigMiddle);
//        return bigMiddle;
//    }

    private static void print(String message){
        System.out.print(message);
    }

    private static void println(String message){
        System.out.println(message);
    }

}
