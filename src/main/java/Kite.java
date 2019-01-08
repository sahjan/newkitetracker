import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

/***
 * POJO for Kite bean created
 * when parsing csv files
 */
public class Kite {

    @CsvBindByPosition(position = 0, required = true)
    private String number;

    @CsvBindByName
    private String title;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
