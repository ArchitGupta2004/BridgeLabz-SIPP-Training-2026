import java.util.Scanner;
public class FinallyBlockDemo{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
try{
System.out.print("Enter two integers: ");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Result: "+(a/b));
}catch(ArithmeticException e){
System.out.println("Cannot divide by zero.");
}finally{
System.out.println("Operation completed");
}
sc.close();
}
}
