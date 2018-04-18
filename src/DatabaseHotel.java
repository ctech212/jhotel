import java.util.ArrayList;

/**
 * Write a description of class DatabaseHotel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseHotel {
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<Hotel>();
    private static int LAST_HOTEL_ID = 0;


    public static boolean addHotel(Hotel baru) {
        for (int i = 0; i < HOTEL_DATABASE.size(); i++) {
            Hotel hotel = HOTEL_DATABASE.get(i);
            if (hotel.getID()==baru.getID()){
                return false;
            }
        }
        LAST_HOTEL_ID=baru.getID();
        HOTEL_DATABASE.add(baru);
        return true;
    }

    public static int getLastHotelID() {
        return LAST_HOTEL_ID;
    }




    public static boolean removeHotel(int id) {
        for(Hotel hotel : HOTEL_DATABASE){
            if(hotel.getID() == id){
                for(Room room : DatabaseRoom.getRoomsFromHotel(hotel)){
                    DatabaseRoom.removeRoom(hotel, room.getNomorKamar());
                }
                HOTEL_DATABASE.remove(hotel);
                return true;
            }
        }

        return false;
    }

    public static Hotel getHotel(int id) {
        for (int i = 0; i < HOTEL_DATABASE.size(); i++) {
            Hotel hotel = HOTEL_DATABASE.get(i);
            if (hotel.getID()==id){
                return hotel;
            }
        }
        return null;
    }


    public static ArrayList<Hotel> getHotelDatabase() {
        return HOTEL_DATABASE;
    }
}
