import java.util.List;

public class Main {

    public static void main(String[] args) {
        Parser parser = new Parser();
        NewKiteChecker kiteChecker = new NewKiteChecker();

        //parse the csv files
        //these files are confidential and as such are not shared
        List<QueueKite> changeQueueKites = parser.parseQueueKites("src\\main\\resources\\changequeue07-11.csv");
        List<TrackerKite> changeTrackerKites = parser.parseTrackerKites("src\\main\\resources\\changetracker07-11.csv");

        System.out.println("Queue kites: ");
        changeQueueKites.forEach(kite -> System.out.println(kite.getNumberString() + ", " + kite.getTitle()));

        System.out.println("Tracker kites: ");
        changeTrackerKites.forEach(kite -> System.out.println(kite.getNumberString() + ", " + kite.getTitle()));

        List<Kite> newKites = kiteChecker.checkForNewKites(changeTrackerKites, changeQueueKites);
    }

}
