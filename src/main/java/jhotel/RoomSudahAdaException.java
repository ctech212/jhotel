package jhotel;

import java.lang.Exception;

/**
 * Ini merupakan class RoomSudahAdaException. Terdapat beberapa method terkait exception class room.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */
public class RoomSudahAdaException extends Exception {
    private Room room_error;


    /**
     * Constructor dari kelas exception HotelSudahAda, menginisialisasikan nilai dari input.
     *
     * @param room_input nilai pesanan yang dicek.
     */
    public RoomSudahAdaException(Room room_input) {
        super("Kamar dengan nomor ruang: ");
        room_error = room_input;
    }

    /**
     * Method yang digunakan untuk mendapatkan pesan Exception.
     *
     * @return String nilai pesan error.
     */
    public String getPesan() {
        return super.getMessage() + room_error.getNomorKamar() + " pada" + room_error.getHotel() + " sudah terdaftar.";
    }
}