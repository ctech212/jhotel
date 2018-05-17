package jhotel;

import java.util.ArrayList;

/**
 * Ini merupakan class DatabasePesanan, pada class ini akan terdapat method untuk menambahkan, menghapus pesanan, ataupun yang dibatalkan.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */
public class DatabasePesanan {
    private static final ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID = 0;

    /**
     * Constructor dari class DatabasePesanan.
     */
    public DatabasePesanan() {
    }

    /**
     * ini merupakan method addPesanan, untuk menambahkan pesanan ke database.
     *
     * @param baru
     * @return baru.
     */
    public static boolean addPesanan(Pesanan baru) throws PesananSudahAdaException {
        for (int i = 0; i < PESANAN_DATABASE.size(); i++) {
            Pesanan pesanan = PESANAN_DATABASE.get(i);
            if (pesanan.getStatusAktif() == true && pesanan.getID() == baru.getID()) {
                throw new PesananSudahAdaException(baru);
            }
        }

        PESANAN_DATABASE.add(baru);
        LAST_PESANAN_ID = baru.getID();
        return true;
    }


    /**
     * ini merupakan method removePesanan, mengapus pesanan dari Database.
     *
     * @return pesan.
     */
    public static boolean removePesanan(Pesanan pesan) throws PesananTidakDitemukanException {
        for (Pesanan pesanan : PESANAN_DATABASE) {
            if (pesanan.equals(pesan)) {
                if (pesanan.getRoom() != null) {
                    Administrasi.pesananDibatalkan(pesan);
                } else {
                    if (pesanan.getStatusAktif()) {
                        pesanan.setStatusAktif(false);
                    }
                }

                if (PESANAN_DATABASE.remove(pesan)) {
                    return true;
                }
            }
        }

        throw new PesananTidakDitemukanException(pesan.getPelanggan());
        //return false;
    }

    /**
     * ini merupakan method getPesanan, untuk mengambil pesanan dari database berdasarkan id.
     *
     * @return pesanan
     */
    public static Pesanan getPesanan(int id) {
        for (Pesanan pesanan : PESANAN_DATABASE) {
            if (pesanan.getID() == id) {
                return pesanan;
            }
        }
        return null;
    }


    /**
     * ini merupakan method getPesananAktif, untuk mengambil pesanan aktif dari database berdasarkan kamar.
     *
     * @return pesanan
     */
    public static Pesanan getPesananAktif(Room kamar) {
        for (int i = 0; i < PESANAN_DATABASE.size(); i++) {
            Pesanan pesanan = PESANAN_DATABASE.get(i);
            if (pesanan.getRoom() == kamar && pesanan.getStatusAktif()) {
                return pesanan;
            }
        }
        return null;
    }


    /**
     * ini merupakan method getPesananAktif, untuk mengambil pesanan aktif dari database berdasarkan pelanggan.
     *
     * @return pesanan
     */
    public static Pesanan getPesananAktif(Customer pelanggan) {
        for (Pesanan pesanan : PESANAN_DATABASE) {
            if (pesanan.getPelanggan() == pelanggan && pesanan.getStatusAktif()) {
                return pesanan;
            }
        }
        return null;
    }


    /**
     * ini merupakan method getPesananDatabase, yang merupakan Accessor.
     *
     * @return nothing.
     */

    public static ArrayList<Pesanan> getPesananDatabase() {
        return PESANAN_DATABASE;
    }

    /**
     * ini merupakan method getLastPesananID, yang merupakan Accessor, untuk mendapatkan id terakhir pesanan.
     *
     * @return LAST_HOTEL_ID
     */
    public static int getLastPesananID() {
        return LAST_PESANAN_ID;
    }

}
