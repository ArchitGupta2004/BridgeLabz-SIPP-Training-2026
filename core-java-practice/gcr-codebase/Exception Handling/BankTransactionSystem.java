import java.util.Scanner;
public class BankTransactionSystem{
static class InsufficientBalanceException extends Exception{
public InsufficientBalanceException(String message){
super(message);
}
}
static double balance=5000;
public static void withdraw(double amount) throws InsufficientBalanceException{
if(amount<0) throw new IllegalArgumentException("Invalid amount!");
if(amount>balance) throw new InsufficientBalanceException("Insufficient balance!");
balance-=amount;
System.out.println("Withdrawal successful, new balance: "+balance);
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
try{
System.out.print("Enter withdrawal amount: ");
double amount=sc.nextDouble();
withdraw(amount);
}catch(InsufficientBalanceException | IllegalArgumentException e){
System.out.println(e.getMessage());
}
sc.close();
}
}
