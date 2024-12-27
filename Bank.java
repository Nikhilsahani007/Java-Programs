//Program 1

public class Bank {
    double amount;

    public Bank(double amount) {
        this.amount = amount;
    }

    // Method to withdraw money
    public void withdraw(double withdrawalAmount) {

        String message = (amount >= withdrawalAmount) ? "Withdraw successful" : "Insufficient balance";

        if (amount >= withdrawalAmount) {
            amount -= withdrawalAmount;
        }

        System.out.println(message);
    }

    // Method to deposit money
    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println(depositAmount + " deposited successfully.");
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }



    public static void main(String[] args) {
        // Program 1: Bank Class (Withdraw, Deposit, and Balance Calculation)

        Bank myAccount = new Bank(10000);

        myAccount.withdraw(3000);

        myAccount.deposit(5000);

        myAccount.displayBalance();

        System.out.println();

        
    }
}
