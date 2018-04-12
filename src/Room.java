
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
    private Pesanan pesan;
    protected double dailyTariff;

    public Room(Hotel hotel, String nomor_kamar, StatusKamar status_kamar) {
        this.hotel = hotel;//instance variable
        this.nomor_kamar = nomor_kamar;//instance variable
        this.status_kamar = status_kamar;//instance variable

    }

    public Hotel getHotel() {
        return hotel;
    }

    public Pesanan getPesanan(){
        return pesan;
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

    public void setPesanan(Pesanan pesan) {
        this.pesan = pesan;
    }


    public String toString() {
        return null;
//        if (isAvailable) {
//            return "Nama Hotel adalah  " + hotel.getNama() +
//                    "Tipe Kamar:" + getTipeKamar() +
//                    "Harga: " + getDailyTariff() +
//                    "Status Kamar: " + status_kamar;
//        } else {
//            return "Nama Hotel      : " + hotel.getNama() +
//                    "Tipe Kamar      : " + getTipeKamar() +
//                    "Harga           : " + getDailyTariff() +
//                    "Status Kamar    : " + status_kamar +
//                    "Pelanggan       : " + pesan.getPelanggan().getNama();
//        }
    }

}
