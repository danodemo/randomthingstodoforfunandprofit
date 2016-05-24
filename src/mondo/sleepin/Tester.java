package mondo.sleepin;

/**
 * Created by danarchy on 5/24/16.
 */
public class Tester {

    public static void main (String[] args){
        sleepIn(true, false);
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(weekday==false || vacation==true){
             System.out.println("Sleeping in like a boss!");
            return true;
        }
        else {
             System.out.println("Wake up, mang!");
            return false;
        }
    }
}
