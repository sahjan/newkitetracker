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

    private List<Kite> kites;

    /**
     * Generate Kite beans from csv file
     * @return a List of Kite objects
     */
    public List<Kite> parseKites(String path) {

        try {
            kites = new CsvToBeanBuilder(new FileReader(path))
                    .withType(Kite.class).build().parse();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return kites;
    }

}
