package jhotel;

import java.util.ArrayList;

/**
 * Ini class DatabaseRoom, Pada class ini akan terdapat method untuk menambahkan, menghapus pesanan, dan lain-lain yang berkaitan dengan data kamar.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */
public class DatabaseRoom {
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<Room>();

    public static ArrayList<Room> getRoomDatabase() {
        return ROOM_DATABASE;
    }

    public static boolean addRoom(Room baru) throws RoomSudahAdaException {
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room room = ROOM_DATABASE.get(i);
            if (room.getHotel() == (baru.getHotel()) && room.getNomorKamar() == baru.getNomorKamar()) {
                throw new RoomSudahAdaException(baru);
            }
        }
        ROOM_DATABASE.add(baru);
        return true;
    }

    /**
     * ini merupakan method getRoom, untuk mengambil room dari database berdasarkan nomor kamar.
     *
     * @param nomor_kamar
     * @param hotel
     * @return room
     */
    public static Room getRoom(Hotel hotel, String nomor_kamar) {
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room room = ROOM_DATABASE.get(i);
            if (room.getHotel().equals(hotel) && room.getNomorKamar().equals(nomor_kamar)) {
                return room;
            }
        }
        return null;
    }

    /**
     * ini merupakan method getRoomFromHotel, untuk mengambil room dari hotel yang berada pada database.
     *
     * @param hotel
     * @return REQUEST_ROOM
     */
    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel) {
        ArrayList<Room> REQUEST_ROOM = new ArrayList<Room>();
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room room = ROOM_DATABASE.get(i);
            if (room.getHotel().equals(hotel)) {
                REQUEST_ROOM.add(room);
            }
        }
        return REQUEST_ROOM;
    }

    /**
     * ini merupakan method getVacantRooms, untuk mengambil room dari hotel yang berada pada database dengan status VACANT.
     *
     * @return REQUEST_ROOM
     */
    public static ArrayList<Room> getVacantRooms() {
        ArrayList<Room> REQUEST_ROOM = new ArrayList<Room>();
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room room = ROOM_DATABASE.get(i);
            if (room.getStatusKamar() == StatusKamar.VACANT) {
                REQUEST_ROOM.add(room);
            }
        }
        return REQUEST_ROOM;
    }


    /**
     * ini merupakan method remoceRoom, untuk mengahpus room dari hotel yang berada pada database.
     *
     * @param hotel
     * @param nomor_kamar
     * @return kamar
     */
    public static boolean removeRoom(Hotel hotel, String nomor_kamar) throws RoomTidakDitemukanException {
        for (Room kamar : ROOM_DATABASE) {
            if (kamar.getHotel().equals(hotel) && kamar.getNomorKamar().equals(nomor_kamar)) {
                Administrasi.pesananDibatalkan(kamar);
                if (ROOM_DATABASE.remove(kamar)) {
                    return true;
                }
            }
        }

        throw new RoomTidakDitemukanException(hotel, nomor_kamar);
    }

}
