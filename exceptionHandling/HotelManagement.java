package exceptionHandling;
import java.util.*;

//Custom Exception Classes
class InvalidReservationException extends Exception {
 public InvalidReservationException(String message) {
     super(message);
 }
}

class RoomNotFoundException extends Exception {
 public RoomNotFoundException(String message) {
     super(message);
 }
}

//Guest class
class Guest {
 private String name;
 private String email;

 public Guest(String name, String email) {
     this.name = name;
     this.email = email;
 }

 // Getters and setters

 @Override
 public String toString() {
     return "Guest [name=" + name + ", email=" + email + "]";
 }
}

//Reservation classes (polymorphism)
class Reservation {
 private int reservationId;
 private Guest guest;
 private Date reservationDate;

 public Reservation(int reservationId, Guest guest, Date reservationDate) {
     this.reservationId = reservationId;
     this.guest = guest;
     this.reservationDate = reservationDate;
 }

 // Getters and setters

 @Override
 public String toString() {
     return "Reservation [reservationId=" + reservationId + ", guest=" + guest + ", reservationDate="
             + reservationDate + "]";
 }
}

class RoomReservation extends Reservation {
 private String roomType;

 public RoomReservation(int reservationId, Guest guest, Date reservationDate, String roomType) {
     super(reservationId, guest, reservationDate);
     this.roomType = roomType;
 }

 // Getters and setters
}

//Room hierarchy
class Room {
 private int roomNumber;
 private double price;
 boolean isAvailable;

 public Room(int roomNumber, double price) {
     this.roomNumber = roomNumber;
     this.price = price;
     this.isAvailable = true;
 }

 // Getters and setters

 @Override
 public String toString() {
     return "Room [roomNumber=" + roomNumber + ", price=" + price + ", isAvailable=" + isAvailable + "]";
 }


public boolean isAvailable() {
	return isAvailable;
}

public void setAvailable(boolean b) {
	// TODO Auto-generated method stub
	
}
}

class StandardRoom extends Room {
 public StandardRoom(int roomNumber) {
     super(roomNumber, 100.0); // Set the price for a standard room
 }
}

class DeluxeRoom extends Room {
 public DeluxeRoom(int roomNumber) {
     super(roomNumber, 150.0); // Set the price for a deluxe room
 }
}

class SuiteRoom extends Room {
 public SuiteRoom(int roomNumber) {
     super(roomNumber, 200.0); // Set the price for a suite
 }
}

//Hotel Management System
public class HotelManagement {
 private List<Guest> guests = new ArrayList<>();
 private List<Reservation> reservations = new ArrayList<>();
 private List<Room> rooms = new ArrayList<>();

 // Room management
 public void addRoom(Room room) {
     rooms.add(room);
 }

 public Room findAvailableRoom(String roomType) throws RoomNotFoundException {
     for (Room room : rooms) {
         if (room.getClass().getSimpleName().equals(roomType) && room.isAvailable) {
             return room;
         }
     }
     throw new RoomNotFoundException("No available " + roomType + " found.");
 }

 public void bookRoom(Room room, Guest guest, Date reservationDate) {
     room.setAvailable(false);
     reservations.add(new RoomReservation(reservations.size() + 1, guest, reservationDate, room.getClass().getSimpleName()));
 }

 // Guest management
 public void addGuest(Guest guest) {
     guests.add(guest);
 }

 // Reservation management
 public void makeReservation(String guestName, String guestEmail, String roomType, Date reservationDate)
         throws InvalidReservationException {
     try {
         Guest guest = new Guest(guestName, guestEmail);
         addGuest(guest);

         Room room = findAvailableRoom(roomType);
         bookRoom(room, guest, reservationDate);

         System.out.println("Reservation successful: " + roomType + " room booked for " + guestName);
     } catch (RoomNotFoundException e) {
         throw new InvalidReservationException(e.getMessage());
     }
 }

 public static void main(String[] args) {
     HotelManagement hotelSystem = new HotelManagement();

     // Example usage
     hotelSystem.addRoom(new StandardRoom(101));
     hotelSystem.addRoom(new DeluxeRoom(201));

     try {
         hotelSystem.makeReservation("Priyanshi Verma", "priyanshiverma874@.com", "StandardRoom", new Date());
         hotelSystem.makeReservation("Lavish Jaiswal", "LavishJaiswal@77.com", "DeluxeRoom", new Date());
     } catch (InvalidReservationException e) {
         System.err.println("Error: " + e.getMessage());
     }
 }
}