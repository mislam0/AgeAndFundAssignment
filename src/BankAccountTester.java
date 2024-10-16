public class BankAccountTester {
    public static void testBankAccount() {
        System.out.println("\n");
        BankAccount account = new BankAccount();

        try {
            account.withdraw(1500.0);  //This should throw exception
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            account.withdraw(500.0);  //This should be fine and work
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}