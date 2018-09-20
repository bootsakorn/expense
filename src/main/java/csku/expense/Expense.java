package csku.expense;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by 708 on 8/31/2018.
 */
public class Expense {
    private ArrayList<ListExpense> listExpense = new ArrayList<>();

    public void addListExpense(String type, String detail, double amount, Date date) {
        if (type.equals("out")) {
            amount = amount*-1;
        }
        ListExpense newList = new ListExpense(type, detail, amount, date);
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
            details = details + String.valueOf(i+1) + "   " + listExpense.get(i).getType() + " : " + listExpense.get(i).getDetail() + " = " + listExpense.get(i).getAmount() + "  (" + listExpense.get(i).getDate() + ")";
        }
        details = details  + "\n" + "total : " + showTotal();
        return details;
    }

    public ListExpense getList(int i) {
        return listExpense.get(i-1);
    }

    public void editList(int i, String newString) {
        if (newString.equals("in") || newString.equals("out")){
            listExpense.get(i-1).setType(newString);
        } else {
            listExpense.get(i-1).setDetail(newString);
            if (listExpense.get(i-1).getAmount()<0){
                listExpense.get(i-1).setAmount(listExpense.get(i-1).getAmount()*-1);
            }
        }
        listExpense.get(i-1).setDate(new Date());
    }

    public void editList(int i, double newAmount) {
        if(listExpense.get(i-1).getType().equals("out")) {
            newAmount*=(-1);
        }
        listExpense.get(i-1).setAmount(newAmount);
        listExpense.get(i-1).setDate(new Date());
    }

    public ArrayList<ListExpense> save () {
        return listExpense;
    }

}