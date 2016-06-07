package mondo.plusout;

import java.util.Scanner;

/**
 * Created by danarchy on 6/2/16.
 */
public class PlusOutRunner {
    public static void main(String[] args){
        System.out.println("Please enter the full string:");
        Scanner lineScanner = new Scanner(System.in);
        String fullString = lineScanner.nextLine();
        System.out.println("Please enter the target string (must be contained within the full string):");
        String targetString = lineScanner.nextLine();
        String returnedPlusOut = new PlusOut().plusOut(fullString, targetString);
        System.out.println(returnedPlusOut);
        return;
    }
}
