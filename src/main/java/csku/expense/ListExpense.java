package csku.expense;

/**
 * Created by 708 on 8/31/2018.
 */
public class ListExpense {
    private String type, detail;
    private double amount;
    public ListExpense (String type, String detail, double amount) {
        this.type = type;
        this.detail = detail;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public String getDetail() {
        return detail;
    }

    public double getAmount() {
        return amount;
    }
}
