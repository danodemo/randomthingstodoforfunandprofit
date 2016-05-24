package mondo.cigarparty;

/**
 * Created by danarchy on 5/24/16.
 */
public class CigarTester {

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            if(cigars >= 40){
                return true;
            } else {
                return false;
            }
        } else {
            if(cigars >= 40 && cigars <= 60){
                return true;
            } else {
                return false;
            }
        }
    }

}
