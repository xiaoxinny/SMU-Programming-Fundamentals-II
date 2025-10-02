package app;

import app.exceptions.InsufficientFundsException;
import app.exceptions.InvalidAmountException;
import java.util.ArrayList;
import java.util.Scanner;

public class BankDemo {

    public static void main(String[] args) {
        BankAccount bc = new BankAccount("123", 100);
        new BankDemo().getAndPerformOperation(bc);
    }

    private void getAndPerformOperation(BankAccount bc) {
        try (Scanner sc = new Scanner(System.in)) {
            OUTER:
            while (true) {
                try {
                    System.out.print("Enter operation > ");
                    try (Scanner row = new Scanner(sc.nextLine())) {
                        row.useDelimiter(" ");
                        ArrayList<String> parameters = new ArrayList<>();
                        while (row.hasNext()) {
                            parameters.add(row.next());
                        }
                        String command = parameters.get(0).toLowerCase();
                        int amount = (parameters.size() > 1) ? Integer.parseInt(parameters.get(1)) : 0;
                        switch (command) {
                            case "quit" -> {
                                System.out.println("Goodbye!");
                                break OUTER;
                            }
                            case "withdraw" -> {
                                bc.withdraw(amount);
                                System.out.println("New balance: " + bc.getBalance());
                            }
                            case "deposit" ->
                            {
                                bc.deposit(amount);
                                System.out.println("New balance: " + bc.getBalance());
                            }
                            case "balance" ->
                                System.out.println("Current balance: " + bc.getBalance());
                            default ->
                                System.out.println("Unknown command: " + command);
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format. Please enter a valid decimal number.");
                } catch (InvalidAmountException | InsufficientFundsException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
