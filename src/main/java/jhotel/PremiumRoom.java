package jhotel;

/**
 * Ini class DoubleRoom, Pada class ini akan terdapat method untuk  kamar bertipe double.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */
public class PremiumRoom extends Room {
    private static double DISCOUNT = 0.3;
    private static TipeKamar TIPE_KAMAR = TipeKamar.PREMIUM;

    /**
     * ini merupakan method PremiumRoom, yang merupakan Contructor.
     *
     * @param hotel
     * @param nomor_kamar
     */
    public PremiumRoom(Hotel hotel, String nomor_kamar) {
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

    /**
     * ini merupakan method getDISCOUNT, yang digunakan untuk mengatur discount.
     *
     * @return DISCOUNT
     */
    public double getDISCOUNT() {
        return DISCOUNT;
    }

    /**
     * ini merupakan method setDailyTariff, yang digunakan untuk mengatur discount pada kamar premium.
     *
     * @param dailyTariff
     */
    public void setDailyTariff(double dailyTariff) {
        super.setDailyTariff(dailyTariff * DISCOUNT);
    }

}