package mondo.choco;

/**
 * Created by danarchy on 5/27/16.
 */
public class ChocoBox {
    public int bigs;
    public int smalls;
    public int goalWeight;
    public int bigsNeeded;
    public int smallsNeeded;
    public boolean canPack;

    public ChocoBox(int bigs, int smalls, int goalWeight){
        this.bigs = bigs;
        this.smalls = smalls;
        this.goalWeight = goalWeight;
    }

}
