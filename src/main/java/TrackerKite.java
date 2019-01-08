import com.opencsv.bean.CsvBindByName;

public class TrackerKite extends Kite {

    @CsvBindByName(column = "Change Category")
    private String changeCategory;
    @CsvBindByName(column = "Change Owner")
    private String changeOwner;
    @CsvBindByName(column = "Status")
    private String status;

    public String getChangeCategory() {
        return changeCategory;
    }

    public void setChangeCategory(String changeCategory) {
        this.changeCategory = changeCategory;
    }

    public String getChangeOwner() {
        return changeOwner;
    }

    public void setChangeOwner(String changeOwner) {
        this.changeOwner = changeOwner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
