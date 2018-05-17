package jhotel;

/**
 * Ini class DoubleRoom, Pada class ini akan terdapat method untuk  kamar bertipe double.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */
public class SingleRoom extends Room {
    private static TipeKamar TIPE_KAMAR = TipeKamar.SINGLE;

    /**
     * ini merupakan method SingleRoom, yang merupakan Contructor.
     *
     * @param hotel
     * @param nomor_kamar
     */
    public SingleRoom(Hotel hotel, String nomor_kamar) {
        super(hotel, nomor_kamar);
    }

    /**
     * ini merupakan method getTipeKamar, yang digunakan untuk mendapatkan tipe kamar yang dipilih user.
     *
     * @return TIPE_KAMAR
     */
    public TipeKamar getTipeKamar() {
        return TIPE_KAMAR;
    }

}
    
    
