import java.util.Scanner;
public class ThrowVsThrowsDemo{
public static double calculateInterest(double amount,double rate,int years) throws IllegalArgumentException{
if(amount<0||rate<0){
throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
}
return (amount*rate*years)/100;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
try{
System.out.print("Enter amount, rate, years: ");
double amount=sc.nextDouble();
double rate=sc.nextDouble();
int years=sc.nextInt();
double interest=calculateInterest(amount,rate,years);
System.out.println("Calculated interest: "+interest);
}catch(IllegalArgumentException e){
System.out.println(e.getMessage());
}
sc.close();
}
}
