public class BankSimulation {
    static class BankAccount {
        String accountHolder;
        String accountNumber;
        double balance;

        public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: $" + amount + ". New Balance: $" + balance);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount + ". New Balance: $" + balance);
            } else if (amount > balance) {
                System.out.println("Insufficient balance for withdrawal.");
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
        }

        public void displayBalance() {
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Current Balance: $" + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Smith", "ACC123456", 500.0);
        account.displayBalance();
        account.deposit(200.0);
        account.withdraw(150.0);
        account.withdraw(1000.0); // Should fail due to insufficient balance
        account.displayBalance();
    }
}
