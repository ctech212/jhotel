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

    private static String[] list_hotel;

    public static boolean addHotel(Hotel baru) {
        for (Hotel hotel : HOTEL_DATABASE) {
            if (baru.getID() != hotel.getID()) {
                return false;
            }
        }

        HOTEL_DATABASE.add(baru);
        DatabaseHotel.LAST_HOTEL_ID++;
        return true;
    }

    public static Hotel getHotel(int id) {
        for (Hotel hotel : HOTEL_DATABASE) {
            if (hotel.getID() == id) {
                return hotel;
            }
        }

        return null;
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

    public static ArrayList<Hotel> getHotelDatabase() {
        return HOTEL_DATABASE;
    }

    public static int getLastHotelID() {
        return LAST_HOTEL_ID;
    }
}
