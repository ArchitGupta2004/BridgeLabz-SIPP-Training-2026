public class SmartLibrarySystem{
public static int getBookLength(int index){
String[] books={"Java","Python",null,"C++"};
try{
if(books[index]==null){
throw new NullPointerException("Book entry at index "+index+" is null.");
}
return books[index].length();
}catch(ArrayIndexOutOfBoundsException e){
System.out.println("Error: Invalid index "+index+".");
}catch(NullPointerException e){
System.out.println("Error: "+e.getMessage());
}
return -1;
}
public static void main(String[] args){
System.out.println("Length of book at index 0: "+getBookLength(0));
System.out.println("Length of book at index 2: "+getBookLength(2));
System.out.println("Length of book at index 5: "+getBookLength(5));
}
}
