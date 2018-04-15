
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

    public Room(Hotel hotel, String nomor_kamar, StatusKamar status_kamar) {
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


    public String toString() {
        if (DatabasePesanan.getPesanan(this) == null) {
            return "\nNama hotel  : " + hotel.getNama() +
                    "\nTipe kamar  : " + getTipeKamar() +
                    "\nHarga       : " + dailyTariff +
                    "\nStatus kamar: " + status_kamar;
        } else {
            return "\nNama hotel  : " + hotel.getNama() +
                    "\nTipe kamar  : " + getTipeKamar().toString() +
                    "\nHarga       : " + dailyTariff +
                    "\nStatus kamar: " + status_kamar +
                    "\nPelanggan   : " + DatabasePesanan.getPesanan(this).getPelanggan().getNama();
        }
    }

}
