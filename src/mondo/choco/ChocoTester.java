package mondo.choco;

/**
 * Created by danarchy on 5/24/16.
 */
public class ChocoTester {

    public static void main(String[] args) {
        makeChocolate(6, 3, 21);
    }


//    The goal divided by 5 without the remainder gives us the number of bigs we need
//    That number is the number of bigs we use.
//
//    The goal minus the weight of the number of bigs we used is equal to how much weight
//    can be filled with smalls
//
//    If the number of smalls needed is more than the number of smalls available, return -1.
//
//    If the number of smalls needed is less than or equal to the number of smalls,
//    return the number of smalls needed
//
//    If the total weight of the smalls + bigs is less than the goal, return -1
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
