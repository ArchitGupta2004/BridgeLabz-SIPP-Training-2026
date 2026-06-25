abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accNum, String name, double bal) {
        this.accountNumber = accNum;
        this.holderName = name;
        this.balance = bal;
    }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accNum) { this.accountNumber = accNum; }
    
    public String getHolderName() { return holderName; }
    public void setHolderName(String name) { this.holderName = name; }
    
    public double getBalance() { return balance; }
    public void setBalance(double bal) { this.balance = bal; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ". New Balance: $" + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal or insufficient funds.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Holder: " + holderName + ", Balance: $" + balance);
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accNum, String name, double bal, double rate) {
        super(accNum, name, bal);
        this.interestRate = rate;
    }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double rate) { this.interestRate = rate; }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

class CurrentAccount extends BankAccount {
    private double monthlyBonusRate;

    public CurrentAccount(String accNum, String name, double bal, double bonusRate) {
        super(accNum, name, bal);
        this.monthlyBonusRate = bonusRate;
    }

    public double getMonthlyBonusRate() { return monthlyBonusRate; }
    public void setMonthlyBonusRate(double bonusRate) { this.monthlyBonusRate = bonusRate; }

    @Override
    public double calculateInterest() {
        return getBalance() * monthlyBonusRate / 100;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA-100", "Alice", 5000.0, 4.5);
        CurrentAccount ca = new CurrentAccount("CA-200", "Bob", 10000.0, 2.0);

        System.out.println("--- Savings Account ---");
        sa.deposit(1000.0);
        sa.withdraw(500.0);
        sa.displayAccountDetails();
        System.out.println("Calculated Interest: $" + sa.calculateInterest());

        System.out.println("\n--- Current Account ---");
        ca.deposit(2000.0);
        ca.displayAccountDetails();
        System.out.println("Calculated Interest: $" + ca.calculateInterest());
    }
}
