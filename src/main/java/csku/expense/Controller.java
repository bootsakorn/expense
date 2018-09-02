package csku.expense;

import java.util.Scanner;

/**
 * Created by 708 on 9/3/2018.
 */
public class Controller {
    Expense expense = new Expense();
    Scanner reader = new Scanner(System.in);
    public void start (){
        String flow = "run";
        while (flow.equals("run")){
            System.out.println("Enter 'new' for add new expense and Enter 'show' for show expenses lists or Enter 'exit' for Exit :");
            String mode = reader.nextLine();
            if (mode.equals("new")){
                System.out.println("Enter 'in' for income and Enter 'out' for expense :");
                String type = reader.nextLine();
                System.out.println("Enter your detail of expense :");
                String detail = reader.nextLine();
                System.out.println("Enter your amount :");
                double amount = Double.parseDouble(reader.nextLine());
                expense.addListExpense(type, detail, amount);
            } else if (mode.equals("show")){
                System.out.println("Enter 'total' for show total and Enter 'all' for show expenses list :");
                String show = reader.nextLine();
                if(show.equals("total")) {
                    System.out.println(expense.showTotal());
                } else if (show.equals("all")){
                    System.out.println(expense.showListExpenseDetails());
                } else {
                    System.out.println("You entered an invalid command.");
                }
            } else if (mode.equals("exit")){
                flow = "stop";
                System.out.println("Goodbye.");
                System.exit(0);
            } else {
                System.out.println("You entered an invalid command.");
            }
        }
    }
}
