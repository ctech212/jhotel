package jhotel;

import java.lang.Exception;

/**
 * Ini merupakan class PelangganSudahAdaException. Terdapat beberapa method terkait exception class customer.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */

public class PelangganSudahAdaException extends Exception {
    private Customer pelanggan_error;

    /**
     * Constructor dari kelas exception PelangganSudahAdaException, menginisialisasikan nilai dari input.
     *
     * @param pelanggan_input nilai pesanan yang dicek.
     */
    public PelangganSudahAdaException(Customer pelanggan_input) {
        super("Pelanggan dengan data :");
        pelanggan_error = pelanggan_input;
    }

    public String getPesan() {
        return super.getMessage() + pelanggan_error + " sudah terdaftar.";
    }
}
