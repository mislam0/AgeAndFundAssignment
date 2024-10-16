public class BankAccount {
    private double balance = 1000.0;

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds: cannot withdraw $" + amount);
        }
        balance -= amount;
        System.out.println("Successfully withdrew: $" + amount);
    }

    public double getBalance() {
        return balance;
    }
}