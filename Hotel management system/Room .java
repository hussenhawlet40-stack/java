package hotelresevationsystem;


public abstract class Room {
    private int RoomNumber;
    private boolean isAvailable;
    private int Number_of_Nights;
    
public Room(int RoomNumber, boolean isAvailable) {
        this.RoomNumber = RoomNumber;
        this.isAvailable = isAvailable;
    }
    public abstract double CalculatePricePerNight();
    public abstract String getRoomtype();

    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int RoomNumber) {
        this.RoomNumber = RoomNumber;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getNumber_of_Nights() {
        return Number_of_Nights;
    }

    public void setNumber_of_Nights(int Number_of_Nights) {
        if(Number_of_Nights<=0)
            System.err.println("Number of Nights must greater than 0.");
        this.Number_of_Nights = Number_of_Nights;
    }
    
    
   public double Calculate_Total_Price(){
       return Number_of_Nights * CalculatePricePerNight();
   }

   
}