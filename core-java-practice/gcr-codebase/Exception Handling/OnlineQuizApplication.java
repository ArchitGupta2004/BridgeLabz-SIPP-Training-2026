public class OnlineQuizApplication{
public static void main(String[] args){
String[] answers={"A","B","C","D"};
int[] indicesToCheck={0,1,2,3,4,5};
for(int i:indicesToCheck){
try{
System.out.println("Checking answer at index "+i+": "+answers[i].equals("A"));
}catch(ArrayIndexOutOfBoundsException e){
System.out.println("Error: Index "+i+" is out of bounds.");
}
}
}
}
