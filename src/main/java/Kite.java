import com.opencsv.bean.CsvBindByPosition;

/***
 * POJO for Kite bean created
 * when parsing csv files
 */
public class Kite {

    @CsvBindByPosition(position = 0)
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
