public class BankAccountModifiers {
    static class BankAccount {
        public String accountNumber;
        protected String accountHolder;
        private double balance;

        public BankAccount(String accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }

    static class SavingsAccount extends BankAccount {
        public SavingsAccount(String accountNumber, String accountHolder, double balance) {
            super(accountNumber, accountHolder, balance);
        }

        public void displayAccountInfo() {
            System.out.println("Account Number (public): " + accountNumber);
            System.out.println("Account Holder (protected): " + accountHolder);
            System.out.println("Balance (private accessed via getter): $" + getBalance());
        }
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA12345", "Eve", 1500.0);
        sa.displayAccountInfo();
        
        System.out.println("\nUpdating Balance...");
        sa.setBalance(2000.0);
        sa.displayAccountInfo();
    }
}
