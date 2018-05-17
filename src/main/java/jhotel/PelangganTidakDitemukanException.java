package jhotel;


/**
 * Ini merupakan class PelangganTidakDitemukanException. Terdapat beberapa method terkait exception class hotel.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */

    public class PelangganTidakDitemukanException extends Exception{
    private int pelanggan_error;

    public PelangganTidakDitemukanException(int pelanggan_input) {
        super("Data Customer dengan ID :");
        pelanggan_error=pelanggan_input;
    }

    /**
     * Method yang digunakan untuk mendapatkan pesan Exception.
     *
     * @return String nilai pesan error.
     */
    public String getPesan() {
        return super.getMessage() + pelanggan_error + " tidak ditemukan.";
    }
}
