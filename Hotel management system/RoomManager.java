
package hotelresevationsystem;

import java.util.ArrayList;
import java.util.List;

public class RoomManager {
    private static int NextRoomNumber= 100; // start room numbers from 100
    private static List<Room> rooms = new ArrayList<>();
    
    public static int getNextRoomNumber() {
        return NextRoomNumber++;
    }

    public static void addRoom(Room room) {
        rooms.add(room);
    }

   
    public static List<Room> getRooms() {
        return rooms;
    }
   
}