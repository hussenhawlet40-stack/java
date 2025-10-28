package hotelresevationsystem;

public class DoubleRoom extends Room {
    
     private static final double PricePerNight= 3000.00;

    public DoubleRoom(int RoomNumber, boolean isAvailable) {
        super(RoomNumber, isAvailable);
    }
    
    @Override
     public double CalculatePricePerNight(){
         return PricePerNight;
     }
    @Override
    public String getRoomtype(){
        return "Double Room!!";
    }
    
}