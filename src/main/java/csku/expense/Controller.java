package csku.expense;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by 708 on 9/3/2018.
 */
public class Controller {
    Expense expense = new Expense();
    Scanner reader = new Scanner(System.in);
    public void start () throws IOException {
        try {
            Path file = Paths.get("txt\\expense.txt");
            BufferedReader reader = Files.newBufferedReader(file , StandardCharsets.UTF_8);
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] note = line.split("!3!");
                expense.addListExpense(note[0], note[1], Double.parseDouble(note[2]), new Date());
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }

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
                expense.addListExpense(type, detail, amount, new Date());
            } else if (mode.equals("show")){
                System.out.println("Enter 'total' for show total and Enter 'all' for show expenses list :");
                String show = reader.nextLine();
                if(show.equals("total")) {
                    System.out.println(expense.showTotal());
                } else if (show.equals("all")){
                    System.out.println(expense.showListExpenseDetails());
                    edit();
                } else {
                    System.out.println("You entered an invalid command.");
                }
            } else if (mode.equals("exit")){
                flow = "stop";
                System.out.println("Goodbye.");
                File file = new File("txt\\expense.txt");
                FileWriter writer = new FileWriter(file, false);
                for (ListExpense list:expense.save()){
                    writer.write(list.getType() + "!3!" +list.getDetail() + "!3!" + String.valueOf(list.getAmount())  + "!3!" +list.getDate() +"\r\n");
                }
                writer.close();
                System.exit(0);
            } else {
                System.out.println("You entered an invalid command.");
            }
        }
    }

    public void edit() {
        System.out.println("Enter 'ok' for back home and 'edit' for edit a list'");
        String edit = reader.nextLine();
        if (edit.equals("ok")) {
            System.out.println("ok");
        } else if (edit.equals("edit")) {
            System.out.println("Enter number of list");
            int i = Integer.parseInt(reader.nextLine());
            System.out.println(String.valueOf(i)+"   "+expense.getList(i).getType() + " : " + expense.getList(i).getDetail() + " = " + expense.getList(i).getAmount() + "  (" + expense.getList(i).getDate() + ")");
            System.out.println("Enter 't' for edit type or 'd' for edit detail or 'a' for edit amount");
            String title = reader.nextLine();
            if (title.equals("d")){
                System.out.println("Enter new detail");
                String newDetail = reader.nextLine();
                expense.editList(i, newDetail);
            } else if (title.equals("a")){
                System.out.println("Enter new amount");
                double newAmount = Double.parseDouble(reader.nextLine());
                expense.editList(i, newAmount);
            }  else if (title.equals("t")){
                System.out.println("Enter new type (in/out)");
                String newType = reader.nextLine();
                expense.editList(i, newType);
            }
            System.out.println(String.valueOf(i)+"   "+expense.getList(i).getType() + " : " + expense.getList(i).getDetail() + " = " + expense.getList(i).getAmount() + "  (" + expense.getList(i).getDate() + ")");
        }
    }
}
