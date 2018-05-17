package jhotel;

/**
 * Ini merupakan class HoteTidakDitemukanException. Terdapat beberapa method terkait exception class hotel.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */
public class HotelTidakDitemukanException extends Exception {
    private int hotel_error;

    public HotelTidakDitemukanException(int hotel_input) {
        super("Hotel dengan ID :");
        hotel_error = hotel_input;
    }

    /**
     * Method yang digunakan untuk mendapatkan pesan Exception.
     *
     * @return String nilai pesan error.
     */
    public String getPesan() {
        return super.getMessage() + hotel_error + "  tidak ditemukan.";
    }
}
