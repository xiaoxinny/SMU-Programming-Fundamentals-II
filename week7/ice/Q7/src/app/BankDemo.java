package app;

import app.exceptions.InsufficientFundsException;
import app.exceptions.InvalidAmountException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class BankDemo {

    public static void main(String[] args) {
        BankAccount bc = new BankAccount(0, 100);
        new BankDemo().getAndPerformOperation(bc);
    }

    private void getAndPerformOperation(BankAccount bc) {
        try (Scanner sc = new Scanner(System.in)) {
            sc.useDelimiter(" ");
            Scanner row = new Scanner(sc.nextLine());
            row.useDelimiter(",");
            ArrayList<String> parameters = new ArrayList<>();

            while (row.hasNext()) {
                parameters.add(row.next());
            }
            String command = parameters.get(0).toLowerCase();
            int amount = (parameters.size() > 1) ? Integer.parseInt(parameters.get(1)) : 0;
            if (command.equals("quit")) {
                System.out.println("Goodbye!");
            } else if(command.equals("withdraw")) {
                bc.withdraw(amount);
            } else if(command.equals("deposit")) {
                bc.deposit(amount);
            } else if(command.equals("balance")) {
                System.out.println("Current balance: " + bc.getBalance());
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter a valid decimal number.");
            getAndPerformOperation(bc);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
