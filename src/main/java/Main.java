import java.util.List;

public class Main {

    public static void main(String[] args) {
        Parser parser = new Parser();
        NewKiteChecker kiteChecker = new NewKiteChecker();

        //parse the csv files
        //these files are confidential and as such are not shared
        List<QueueKite> changeTrackerKites = parser.parseQueueKites("src\\main\\resources\\changequeue07-11.csv");
        List<TrackerKite> changeQueueKites = parser.parseTrackerKites("src\\main\\resources\\changetracker07-11.csv");

//        List<Kite> newKites = kiteChecker.checkForNewKites(changeQueueKites, changeTrackerKites);

//        newKites.forEach(kite -> System.out.println(kite.getNumber()));
        changeQueueKites.forEach(kite -> System.out.println(kite.getNumber()));
    }

}
