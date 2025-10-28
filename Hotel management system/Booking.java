package hotelresevationsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bookings {
    private Guest guest;
    private Room room;
    private int numberOfNights;
    private String checkInDate;

    public Bookings(Guest guest, Room room, String checkInDate) {
        this.guest = guest;
        this.room = room;
        this.checkInDate= checkInDate;
        bookingsList.add(this);
    }
    
   public int getRoomNumber() {
        return room.getRoomNumber();
    }

    public Guest getGuest() {
        return guest;
    }
   
    public void setRoom(Room room) {
    this.room = room;
}

    public void setCheckInDate(String date) {
    this.checkInDate = date;
}

    public static void addBooking(Bookings booking) {
    bookingsList.add(booking);
}
    
    private static List<Bookings> bookingsList = new ArrayList<>();

    public static void cancelBookingByName(String name) {
        Bookings booking = findBookingByName(name);
        if (booking != null) {
            bookingsList.remove(booking);
            System.out.println("Booking canceled successfully for " + name);
        } else {
            System.out.println("No booking found for " + name);
        }
    }

    public static void viewBookingByName(String name) {
        Bookings booking = findBookingByName(name);
        if (booking != null) {
            booking.showBookingDetails();
        } else {
            System.out.println("No booking found for " + name);
        }
    }

    public static void updateBookingByName(String name, Scanner scanner) {
        Bookings booking = findBookingByName(name);
        if (booking != null) {
            System.out.println("Enter new check-in date (yyyy-mm-dd): ");
            String newDate = scanner.nextLine();
            booking.setCheckInDate(newDate);  // if you have such method
            System.out.println("Booking updated successfully.");
        } else {
            System.out.println("No booking found for " + name);
        }
    }

    public static void deleteBookingByName(String name) {
        cancelBookingByName(name); // reuse
    }

    public static Bookings findBookingByName(String name) {
        for (Bookings b : bookingsList) {
            if (b.getGuest().getName().equalsIgnoreCase(name)) {
                return b;
            } else {
            }
        }
        return null;
    }
   
   public void showBookingDetails(){
        double totalPrice = room.Calculate_Total_Price();
        guest.displayGuest();
        System.out.println("Room Type: "+ room.getRoomtype());
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Number of Nights: "+ room.getNumber_of_Nights());
        System.out.println("Total Price: "+ totalPrice + " ETB.");
        System.out.println("Check-In Date: " + (checkInDate != null ? checkInDate : "Not Set"));
        
        LocalDate checkIn = LocalDate.parse(checkInDate);
        LocalDate checkOut = checkIn.plusDays(room.getNumber_of_Nights());
        System.out.println("Check-Out Date: " + checkOut);
  
   }
   
    public static List<Bookings> getAllBookings() {
    return bookingsList;
    }