package csku.expense;

import java.util.Date;

/**
 * Created by 708 on 8/31/2018.
 */
public class ListExpense {
    private Date date;
    private String type, detail;
    private double amount;
    public ListExpense (String type, String detail, double amount, Date date) {
        this.type = type;
        this.detail = detail;
        this.amount = amount;
        this.date = date;
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

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
