package csku.expense;

import java.util.ArrayList;

/**
 * Created by 708 on 8/31/2018.
 */
public class Expense {
    private ArrayList<ListExpense> listExpense = new ArrayList<>();

    public void addListExpense(String type, String detail, double amount) {
        if (type.equals("out")) {
            amount = amount*-1;
        }
        ListExpense newList = new ListExpense(type, detail, amount);
        this.listExpense.add(newList);
    }

    public double showTotal() {
        double total = 0;
        for (int i = 0; i < listExpense.size(); i++){
           total+=listExpense.get(i).getAmount();
        }
        return total;
    }

    public String showListExpenseDetails (){
        String details = "";
        for (int i = 0; i < listExpense.size(); i++){
            if (i>0) {
                details+="\n";
            }
            details = details + String.valueOf(i+1) + "   " + listExpense.get(i).getType() + " : " + listExpense.get(i).getDetail() + " = " + listExpense.get(i).getAmount();
        }
        details = details  + "\n" + "total : " + showTotal();
        return details;
    }
}