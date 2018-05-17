package jhotel;

/**
 * Ini class DoubleRoom, Pada class ini akan terdapat method untuk  kamar bertipe double.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */
public class DoubleRoom extends Room {
    private Customer customer2;
    private static TipeKamar TIPE_KAMAR = TipeKamar.DOUBLE;

    /**
     * ini merupakan method DoubleRoom, yang merupakan Contructor.
     *
     * @param hotel
     * @param nomor_kamar
     */
    public DoubleRoom(Hotel hotel, String nomor_kamar) {
        super(hotel, nomor_kamar);
    }

    /**
     * ini merupakan method getCustomer2, yang digunakan untuk mendapatkan customer kedua.
     *
     * @return customer2
     */

    public Customer getCustomer2() {
        return customer2;
    }

    /**
     * ini merupakan method getTipeKamar, yang digunakan untuk mendapatkan tipe kamar yang dipilih user.
     *
     * @return TIPE_KAMAR
     */
    public TipeKamar getTipeKamar() {
        return TIPE_KAMAR;
    }

    /**
     * ini merupakan method setCustomer2, yang digunakan untuk mengatur customer kedua.
     *
     * @return customer2
     */
    public void setCustomer2() {
        this.customer2 = customer2;
    }

}
