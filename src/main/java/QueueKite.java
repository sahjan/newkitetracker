import com.opencsv.bean.CsvBindByName;

public class QueueKite extends Kite {

    @CsvBindByName(column = "Category")
    private String category;
    @CsvBindByName(column = "Assignee Name")
    private String assigneeName;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAssigneeName() {
        return assigneeName;
    }

    public void setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName;
    }

}
