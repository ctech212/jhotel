package jhotel;

/**
 * Ini merupakan class PesananSudahAdaException. Terdapat beberapa method terkait exception class pesanan.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */

    public class PesananTidakDitemukanException extends Exception {
    private Customer pelanggan_error;

    public PesananTidakDitemukanException(Customer pelanggan_input) {
        super("Pesanan yang dipesan oleh :");
        pelanggan_error=pelanggan_input;
    }

    /**
     * Method yang digunakan untuk mendapatkan pesan Exception.
     *
     * @return String nilai pesan error.
     */
    public String getPesan() {
        return super.getMessage() + pelanggan_error.getNama() + " tidak ditemukan.";
    }
}
