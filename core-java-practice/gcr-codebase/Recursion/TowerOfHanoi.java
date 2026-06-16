import java.util.*;
public class TowerOfHanoi { 
static int moves=0;

//hanoi
static void hanoi(int n,char A,char B,char C){
if(n==1){
System.out.println("Move disk 1 from "+A+" to "+C);
moves++;
return;
}
hanoi(n-1,A,C,B);
System.out.println("Move disk "+n+" from "+A+" to "+C);
moves++;
hanoi(n-1,B,A,C);
}

//binary
static int bs(int[] a,int l,int r,int k){
if(l>r)return-1;
int m=(l+r)/2;
if(a[m]==k)return m;
if(k<a[m])return bs(a,l,m-1,k);
return bs(a,m+1,r,k);
}

//sum
static int sum(int n){
if(n==0)return 0;
return n%10+sum(n/10);
}

//reverse
static String rev(String s){
if(s.isEmpty())return s;
return rev(s.substring(1))+s.charAt(0);
}

//balance
static boolean bal(String s,int c,int i){
if(c<0)return false;
if(i==s.length())return c==0;
if(s.charAt(i)=='(')return bal(s,c+1,i+1);
return bal(s,c-1,i+1);
}

//main
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.print("Enter number of disks: ");
int n=sc.nextInt();
hanoi(n,'A','B','C');
System.out.println("Total moves: "+moves);

System.out.print("Enter array size: ");
int size=sc.nextInt();
int[] a=new int[size];
System.out.println("Enter sorted elements:");
for(int i=0;i<size;i++)a[i]=sc.nextInt();
System.out.print("Enter key to search: ");
int key=sc.nextInt();
System.out.println("Index: "+bs(a,0,a.length-1,key));

System.out.print("Enter number for sum of digits: ");
int num=sc.nextInt();
System.out.println("Sum: "+sum(num));

System.out.print("Enter string to reverse: ");
String str=sc.next();
System.out.println("Reverse: "+rev(str));

System.out.print("Enter parentheses string: ");
String p=sc.next();
System.out.println("Balanced: "+bal(p,0,0));

sc.close();
}

}