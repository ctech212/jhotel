package jhotel;

import java.util.ArrayList;

/**
 * Ini merupakan class DatabaseHotel, dimana pada class ini terdapat method untuk mendapatkan atau menghapus informasi atau database Hotel.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */
public class DatabaseHotel {
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<Hotel>();
    private static int LAST_HOTEL_ID = 0;

    /**
     * ini merupakan method addHotel, untuk menambahkan hotel ke database.
     *
     * @return baru.
     */
    public static boolean addHotel(Hotel baru) throws HotelSudahAdaException {
        for (int i = 0; i < HOTEL_DATABASE.size(); i++) {
            Hotel hotel = HOTEL_DATABASE.get(i);
            if (hotel.getID() == baru.getID() || (hotel.getNama() == baru.getNama() && hotel.getLokasi() == baru.getLokasi())) {
                throw new HotelSudahAdaException(baru);
            }
        }
        LAST_HOTEL_ID = baru.getID();
        HOTEL_DATABASE.add(baru);
        return true;
    }

    /**
     * ini merupakan method getLastHotelID, yang merupakan Accessor, untuk mendapatkan id terakhir hotel.
     *
     * @return LAST_HOTEL_ID
     */
    public static int getLastHotelID() {
        return LAST_HOTEL_ID;
    }

    /**
     * ini merupakan method removeHotel, untuk menghapus hotel dari database.
     *
     * @return hotel
     */
    public static boolean removeHotel(int id) throws HotelTidakDitemukanException {
        for (int i = 0; i < HOTEL_DATABASE.size(); i++) {
            Hotel hotel = HOTEL_DATABASE.get(i);
            if (hotel.getID() == id) {
                ArrayList<Room> KAMAR_TEST = DatabaseRoom.getRoomsFromHotel(hotel);
                for (int x = 0; x < KAMAR_TEST.size(); x++) {
                    Room kamar = KAMAR_TEST.get(x);
                    try {
                        DatabaseRoom.removeRoom(hotel, kamar.getNomorKamar());
                    } catch (RoomTidakDitemukanException test) {
                        System.out.println(test.getPesan());
                    }
                }
                if (HOTEL_DATABASE.remove(hotel)) {
                    return true;
                }
            }
        }
        throw new HotelTidakDitemukanException(id);
    }

    /**
     * ini merupakan method getHotel, untuk mengambil hotel dari database berdasarkan id.
     *
     * @return hotel
     */
    public static Hotel getHotel(int id) {
        for (int i = 0; i < HOTEL_DATABASE.size(); i++) {
            Hotel hotel = HOTEL_DATABASE.get(i);
            if (hotel.getID() == id) {
                return hotel;
            }
        }
        return null;
    }

    /**
     * ini merupakan method getHotelDatabase, untuk database hotel.
     *
     * @return nama
     */
    public static ArrayList<Hotel> getHotelDatabase() {
        return HOTEL_DATABASE;
    }
}
