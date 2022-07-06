package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        BankAccount account;

        System.out.print("Enter account number: ");
        int accNumber = scanner.nextInt();
        scanner.nextLine(); // pra consumir a quebra de linha após nextInt
        System.out.print("Enter account holder: ");
        String accName = scanner.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        String initialDeposit = scanner.next();

        if (initialDeposit.equals("y")){
            System.out.print("Enter initial deposit value: ");
            double deposit = scanner.nextDouble();
            account = new BankAccount(accNumber, accName, deposit);
        }

        else {
            account = new BankAccount(accNumber, accName);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);
        System.out.print("Enter a deposit value: ");

        double balanceChange = scanner.nextDouble();
        account.deposit(balanceChange);

        System.out.println(account);
        System.out.print("Enter a withdraw value: ");

        balanceChange = scanner.nextDouble();
        account.withdraw(balanceChange);
        System.out.println(account);
    }
}
