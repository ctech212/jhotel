package jhotel;

/**
 * Ini class Room, berisi tentang informasi booking kamar.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 10/03/2018
 */

public abstract class Room {

    private Hotel hotel;
    private String nomor_kamar;
    private StatusKamar status_kamar;
    protected double dailyTariff;

    public Room(Hotel hotel, String nomor_kamar) {
        this.hotel = hotel;//instance variable
        this.nomor_kamar = nomor_kamar;//instance variable
        this.status_kamar = status_kamar.VACANT;//instance variable

    }

    public Hotel getHotel() {
        return hotel;
    }


    public String getNomorKamar() {
        return nomor_kamar;
    }


    public double getDailyTariff() {
        return dailyTariff;
    }

    public abstract TipeKamar getTipeKamar();

    public StatusKamar getStatusKamar() {
        return status_kamar;
    }


    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void setNomorKamar(String nomor_kamar) {
        this.nomor_kamar = nomor_kamar;
    }

    public void setDailyTariff(double dailytariff) {
        dailyTariff = dailytariff;
    }

    public void setStatusKamar(StatusKamar status_kamar) {
        this.status_kamar = status_kamar;
    }


    public String toString()
    {
        if(DatabasePesanan.getPesananAktif(this) == null)
        {
            return "\nNama Hotel      : " + getHotel().getNama() +
                    "\nTipe Kamar      : " + getTipeKamar() +
                    "\nHarga           : " + getDailyTariff() +
                    "\nStatus Kamar    : " + getStatusKamar();
        }

        else
        {
            return "\nNama Hotel      : " + getHotel().getNama() +
                    "\nTipe Kamar      : " + getTipeKamar() +
                    "\nHarga           : " + getDailyTariff() +
                    "\nStatus Kamar    : " + getStatusKamar() +
                    "\nPelanggan       : " + DatabasePesanan.getPesananAktif(this).getPelanggan().getNama();
        }
    }

}
