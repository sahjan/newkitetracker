import java.util.List;

public class Main {

    public static void main(String[] args) {
        Parser parser = new Parser();
        NewKiteChecker kiteChecker = new NewKiteChecker();

        //parse the csv files
        //these files are confidential and as such are not shared
        List<Kite> changeTrackerKites = parser.parseKites("src\\main\\resources\\changequeue07-11.csv");
        List<Kite> changeQueueKites = parser.parseKites("src\\main\\resources\\changetracker07-11.csv");

        List<Kite> newKites = kiteChecker.checkForNewKites(changeTrackerKites, changeQueueKites);

        newKites.forEach(kite -> System.out.println(kite.getNumber()));
    }

}
