package jhotel;

/**
 * Ini class Room, berisi tentang informasi booking kamar.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */

public abstract class Room {

    private Hotel hotel;
    private String nomor_kamar;
    private StatusKamar status_kamar;
    protected double dailyTariff;

    /**
     * Ini Constructor class Room, berisi tentang hal hal booking kamar.
     *
     * @param nomor_kamar
     * @param hotel
     */
    public Room(Hotel hotel, String nomor_kamar) {
        this.hotel = hotel;//instance variable
        this.nomor_kamar = nomor_kamar;//instance variable
        this.status_kamar = status_kamar.VACANT;//instance variable

    }

    /**
     * ini merupakan method getHotel, yang merupakan Accessor untuk mendapatkan hotel dari kamar yang bersangkutan.
     *
     * @return hotel.
     */
    public Hotel getHotel() {
        return hotel;
    }

    /**
     * ini merupakan method getNomorKamar, yang merupakan Accessor untuk mendapatkan nomor kamar.
     *
     * @return hotel.
     */
    public String getNomorKamar() {
        return nomor_kamar;
    }

    /**
     * ini merupakan method getDailyTariff, yang merupakan Accessor untuk mendapatkan tarif kamar.
     *
     * @return dailyTariff.
     */
    public double getDailyTariff() {
        return dailyTariff;
    }

    /**
     * ini merupakan method getTipeKamar, yang merupakan Accessor untuk mendapatkan tipe kamar.
     *
     * @return tipe_kamar.
     */
    public abstract TipeKamar getTipeKamar();

    /**
     * ini merupakan method getStatusKamar, yang merupakan Accessor untuk mendapatkan status kamar.
     *
     * @return status_kamar.
     */
    public StatusKamar getStatusKamar() {
        return status_kamar;
    }

    /**
     * ini merupakan method setHotel, yang merupakan Mutator untuk mengatur hotel .
     *
     * @param hotel
     */
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    /**
     * ini merupakan method setNomorKamar, yang merupakan Mutator untuk mengatur nomor kamar .
     *
     * @param nomor_kamar
     */
    public void setNomorKamar(String nomor_kamar) {
        this.nomor_kamar = nomor_kamar;
    }

    /**
     * ini merupakan method setdailyTariff, yang merupakan Mutator untuk mengatur tarif ruangan.
     *
     * @param dailytariff
     */
    public void setDailyTariff(double dailytariff) {
        dailyTariff = dailytariff;
    }

    /**
     * ini merupakan method setStatusKamar, yang merupakan Mutator untuk mengatur status kamar .
     *
     * @param status_kamar
     */
    public void setStatusKamar(StatusKamar status_kamar) {
        this.status_kamar = status_kamar;
    }

    /**
     * ini merupakan method toString, untuk menghasilkan output informasi dari kamar.
     */
    public String toString() {
        if (DatabasePesanan.getPesananAktif(this) == null) {
            return "\nNama Hotel      : " + getHotel().getNama() +
                    "\nTipe Kamar      : " + getTipeKamar() +
                    "\nHarga           : " + getDailyTariff() +
                    "\nStatus Kamar    : " + getStatusKamar();
        } else {
            return "\nNama Hotel      : " + getHotel().getNama() +
                    "\nTipe Kamar      : " + getTipeKamar() +
                    "\nHarga           : " + getDailyTariff() +
                    "\nStatus Kamar    : " + getStatusKamar() +
                    "\nPelanggan       : " + DatabasePesanan.getPesananAktif(this).getPelanggan().getNama();
        }
    }

}
