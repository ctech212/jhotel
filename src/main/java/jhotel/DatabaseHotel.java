package jhotel;

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


    public static boolean addHotel(Hotel baru) throws HotelSudahAdaException {
        for (int i = 0; i < HOTEL_DATABASE.size(); i++) {
            Hotel hotel = HOTEL_DATABASE.get(i);
            if (hotel.getID()==baru.getID()||(hotel.getNama()==baru.getNama() && hotel.getLokasi()==baru.getLokasi())){
                throw new HotelSudahAdaException(baru);
            }
        }
        LAST_HOTEL_ID=baru.getID();
        HOTEL_DATABASE.add(baru);
        return true;
    }

    public static int getLastHotelID() {
        return LAST_HOTEL_ID;
    }

    public static boolean removeHotel(int id) throws HotelTidakDitemukanException
    {
        for (int i = 0; i < HOTEL_DATABASE.size(); i++) {
            Hotel hotel = HOTEL_DATABASE.get(i);
            if (hotel.getID()==id){
                ArrayList<Room> KAMAR_TEST = DatabaseRoom.getRoomsFromHotel(hotel);
                for (int x = 0; x < KAMAR_TEST.size(); x++){
                    Room kamar = KAMAR_TEST.get(x);
                    try {
                        DatabaseRoom.removeRoom(hotel, kamar.getNomorKamar());
                    } catch (RoomTidakDitemukanException test){
                        System.out.println(test.getPesan());
                    }
                }
                if(HOTEL_DATABASE.remove(hotel))
                {
                    return true;
                }
            }
        }
        throw new HotelTidakDitemukanException(id);
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
