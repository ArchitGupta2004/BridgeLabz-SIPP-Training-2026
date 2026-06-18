public class MovieSeatReservation{
public static int getSeat(int index){
int[] seats={101,102,103,104,105};
try{
return seats[index];
}catch(ArrayIndexOutOfBoundsException e){
System.out.println("Error: Invalid seat index "+index);
return -1;
}
}
public static void main(String[] args){
int requestedIndex=8;
int seatNumber=getSeat(requestedIndex);
System.out.println("Seat number returned: "+seatNumber);
System.out.println("Seat number for index 2: "+getSeat(2));
}
}
