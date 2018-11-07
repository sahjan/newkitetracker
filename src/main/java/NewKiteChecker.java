import java.util.ArrayList;
import java.util.List;

public class NewKiteChecker {

    private ArrayList<Kite> newKites;

    public List<Kite> checkForNewKites(List<Kite> changeTrackerDocKites, List<Kite> changeQueueKites) {
        newKites = new ArrayList<>();

        //DO CHECKING LOGIC and add new kites to newKites arraylist
        for (Kite k : changeQueueKites) {
            //check if present in change tracker kites.
            //if not, then it is a new kite, then add into newKites.
            newKites.add(kite);
        }
        
        return newKites;
    }
}
