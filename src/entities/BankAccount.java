package entities;

public class BankAccount {
    private final int number;
    private String name;
    private double balance;

    public BankAccount (int number, String name, double initialDeposit){
        this.number = number;
        this.name = name;
        deposit(initialDeposit);
    }

    public BankAccount (int number, String name){
        this.number = number;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit){
        this.balance += deposit;
    }

    public void withdraw(double withdraw){
        this.balance -= withdraw + 5.00;
    }

    @Override
    public String toString() {
        return "Account " +
                number +
                ", Holder: " +
                name +
                ", Balance: $ " +
                String.format("%.2f%n" , balance);
    }
}
