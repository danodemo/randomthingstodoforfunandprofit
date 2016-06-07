package mondo.threadracer;

/**
 * Created by danarchy on 6/7/16.
 */
public class ThreadRacerThread implements Runnable {
    public void run (){
        System.out.print("\r0");
        for(int count = 20; count >= 0; count--) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("-");
        }
    }
}
