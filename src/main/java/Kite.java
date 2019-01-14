import com.opencsv.bean.CsvBindAndJoinByName;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import org.apache.commons.collections4.MultiValuedMap;

/***
 * POJO for Kite bean created
 * when parsing csv files
 */
public class Kite {

    @CsvBindAndJoinByName(column = "(Number|Change Num)", elementType = String.class)
    private MultiValuedMap<String, String> number;

    @CsvBindByName(column = "Title")
    private String title;

    private String numberString;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MultiValuedMap<String, String> getNumber() {
        return number;
    }

    public void setNumber(MultiValuedMap<String, String> number) {
        this.number = number;
    }

    public String getNumberString() {
        return numberString;
    }

    public void setNumberString(String numberString) {
        this.numberString = numberString;
    }

}
