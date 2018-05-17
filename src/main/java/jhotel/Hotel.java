package jhotel;


/**
 * Ini merupakan class Hotel. Terdapat beberapa method terkait informasi hotel.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */
public class Hotel {

    private String nama;
    private Lokasi lokasi;
    private int bintang;
    private int id;

    /**
     * ini merupakan method Hotel, yang merupakan Contructor.
     *
     * @param nama
     * @param lokasi
     * @param bintang
     */
    public Hotel(String nama, Lokasi lokasi, int bintang) {
        this.nama = nama;//instance variable
        this.lokasi = lokasi;//instance variable
        this.bintang = bintang;//instance variable
        this.id = DatabaseHotel.getLastHotelID() + 1;
    }

    /**
     * ini merupakan method setID, yang merupakan Mutator.
     *
     * @param id
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     * ini merupakan method getBintang, yang merupakan Accessor.
     *
     * @return bintang
     */
    public int getBintang() {
        return bintang;
    }

    /**
     * ini merupakan method getNama, yang merupakan Accessor.
     *
     * @return nama.
     */
    public String getNama() {
        return nama;
    }

    /**
     * ini merupakan method getLokasi, yang merupakan Accessor.
     *
     * @return lokasi.
     */
    public Lokasi getLokasi() {
        return lokasi;
    }

    /**
     * ini merupakan method setNama, yang merupakan Mutator.
     *
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * ini merupakan method setLokasi, yang merupakan Mutator.
     *
     * @param lokasi
     */
    public void setLokasi(Lokasi lokasi) {
        this.lokasi = lokasi;
    }

    /**
     * ini merupakan method setBintang, yang merupakan Mutator.
     *
     * @param bintang
     */
    public void setBintang(int bintang) {
        this.bintang = bintang;
    }

    /**
     * ini merupakan method getID, yang merupakan Accessor.
     *
     * @return id.
     */
    public int getID() {
        return id;
    }

    /**
     * ini merupakan method toString, yang akan menghasilkan output nama hotel.
     */
    public String toString() {
        return "\nNama Hotel: " + getNama() +
                "\nLokasi Hotel:" + getLokasi().getDeskripsi() +
                "\nBintang Hotel: " + getBintang();
    }

}
