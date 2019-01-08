import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

/***
 * This class is responsible for parsing the CSV files
 * and generating the POJO for kites.
 * CSV files are read from user input.
 */
public class Parser {

    private List<QueueKite> queueKites;
    private List<TrackerKite> trackerKites;
    private List<Kite> queueSuperKites;
    private List<Kite> trackerSuperKites;

    private List<Kite> superKites;

    public List<Kite> parseSuperKites(String path) {
        try {
            superKites = new CsvToBeanBuilder(new FileReader(path))
                    .withType(Kite.class).build().parse();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return superKites;
    }

    /**
     * Generate Queue Kite beans from csv file
     * @return a List of QueueKite objects
     */
    public List<QueueKite> parseQueueKites(String path) {
        try {
            queueKites = new CsvToBeanBuilder(new FileReader(path))
                    .withType(Kite.class).build().parse();
            queueSuperKites = parseSuperKites(path);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return queueKites;
    }

    /**
     * Generate Tracker Kite beans from csv file
     * @return a List of TrackerKite objects
     */
    public List<TrackerKite> parseTrackerKites(String path) {
        try {
            trackerKites = new CsvToBeanBuilder(new FileReader(path))
                    .withType(Kite.class).build().parse();
            trackerSuperKites = parseSuperKites(path);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return trackerKites;
    }

}
