class InsufficientBalanceException extends Exception{
public InsufficientBalanceException(String message){
super(message);
}
}
public class ATMWithdrawalSystem{
public static void withdraw(double balance,double amount){
try{
if(amount>balance){
throw new InsufficientBalanceException("Insufficient balance. Requested: ₹"+amount+", Available: ₹"+balance);
}
balance-=amount;
System.out.println("Withdrawal successful. Remaining balance: ₹"+balance);
}catch(InsufficientBalanceException e){
System.out.println("Exception caught: "+e.getMessage());
}
}
public static void main(String[] args){
double accountBalance=5000;
double withdrawalRequest=8000;
withdraw(accountBalance,withdrawalRequest);
}
}
