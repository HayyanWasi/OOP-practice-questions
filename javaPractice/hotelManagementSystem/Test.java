import java.util.List;
import java.util.ArrayList;

class Room{
    private int roomNumber;
    private String roomType;
    private float price;
    private boolean isBooked;

    Room(int roomNumber, String roomType, float price, boolean isBooked){
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.isBooked = isBooked;
    }
    
    public String toString(){
       return  "roomNumber " + roomNumber +"\n"+
                "roomType " + roomType    +"\n"+
                "price " + price          +"\n"+
                "Booked " + isBooked;
    }
    public int getRoomNumber(){
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }

    public String getRoomType(){
        return roomType;
    }
    public void setRoomType(String roomType){
        this.roomType = roomType;

    }

    public float getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public boolean IsBooked(){
        return isBooked;
    }
    public void setIsBooked(boolean isBooked){
        this.isBooked = isBooked;

    }

    public void markAsBooked(){
        if(isBooked != true){
            isBooked = true;
            System.out.println("marked as booked");
        }else{
            System.out.println("error");
        }
    }

    public void markAsAvailable(){
        if(isBooked){
            isBooked = false;
            System.out.println("mark as available");
        }else{
            System.out.println("not available");
        }
    }
}




class Guest{
    private int guestId;
    private String name;
    private int contactNumber;

    Guest(){}

    Guest(int guestId, String name, int contactNumber){
        this.contactNumber = contactNumber;
        this.guestId = guestId;
        this.name = name;
    }


    public int getGuestId(){
        return guestId;
    }
    public void setGuestId(int guestId){
        this.guestId = guestId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getContactNumber(){
        return name;
    }
    public void SetContactNumber(int contactNumber){
        this.contactNumber = contactNumber;
    }


    public String toString(){
       return "guestId " + guestId+"\n"+
            "name " + name+ "\n"+
            "contact number " + contactNumber+"\n";
    }
}
class Booking {
    private Room room;
    private Guest guest;
    int bookingId;
    String checkInDate;
    String checkOutDate;

    Booking(){}
    Booking(int bookingId, String checkInDate, String checkOutDate, Guest guest, Room room){
        this.bookingId = bookingId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.guest = guest;
        this.room = room;
    }

    public String toString(){
        return "bookingId is " + bookingId+"\n"+
                "checkInDate " + checkInDate+"\n"+
                "checkOutDate " + checkOutDate+"\n"+
                "Guest: " + guest.getName() + "\n" + 
                "Room: " + room.getRoomNumber();
    }

    public int getBookingId(){
        return bookingId;
    }

    public void setBookingId(int bookingId){
        this.bookingId = bookingId;
    }

    public String getCheckInDate(){
        return checkInDate;
    }
    public void setCheckInDate(String checkInDate){
        this.checkInDate = checkInDate;
    }

    public String getCheckoutDate(){
        return checkOutDate;
    }
    public void setcheckOutDate(String checkOutDate){
        this.checkOutDate = checkOutDate;
    }

 }
class Hotel{
    private List<Room> rooms;
    private List<Guest> guests;
    private List<Booking> bookings;

    Hotel(){
        rooms = new ArrayList<>();
        guests = new ArrayList<>();
        bookings = new ArrayList<>();
    }
    public void addRoom(Room room){
        rooms.add(room);
        System.out.println("room added "+ room.getRoomNumber());

    }
    public void addGuest(Guest guest) {
    guests.add(guest);
    System.out.println("Guest added: " + guest.getName());
}







}












 public class Test{
    public static void main(String[] args) {
        
    }
 }