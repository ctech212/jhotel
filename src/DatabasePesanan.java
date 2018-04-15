import java.util.ArrayList;

/**
 * Ini merupakan class DatabasePesanan, pada class ini akan terdapat method untuk menambahkan, menghapus pesanan, ataupun yang dibatalkan.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 01/03/2018
 */
public class DatabasePesanan {
    private static final ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID = 0;

    /**
     * ini merupakan method addPesanan.
     *
     * @param baru
     * @return baru.
     */
    public static boolean addPesanan(Pesanan baru) {
        if(baru.getStatusAktif()) {
            return false;
        } else{
            PESANAN_DATABASE.add(baru);
            DatabasePesanan.LAST_PESANAN_ID ++;
            return true;
        }
    }

    /**
     * ini merupakan method removePesanan.
     *
     * @param pesan
     * @return pesan.
     */

    /**
     * ini merupakan method getPesanan, yang merupakan Accessor.
     *
     * @return nama.
     */
    public static Pesanan getPesanan(Room kamar) {
        for(Pesanan pesanan : PESANAN_DATABASE){
            if(pesanan.getRoom() == kamar){
                return pesanan;
            }
        }
        return null;
    }

    public static Pesanan getPesananAktif(Customer pelanggan) {
        for(int i=0;i<PESANAN_DATABASE.size();i++){
            Pesanan pesanan=PESANAN_DATABASE.get(i);
            if (pesanan.getPelanggan()==pelanggan && pesanan.getStatusAktif()==true){
                return pesanan;
            }
        }
        return null;
    }

    public static Pesanan getPesanan(int id) {
        for(Pesanan pesanan : PESANAN_DATABASE){
            if(pesanan.getID() == id){
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

    public static int getLastPesananID() {
        return LAST_PESANAN_ID;
    }

    public static boolean removePesanan(Pesanan pesan) {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.equals(pesan))
            {
                if(pesanan.getRoom() != null)
                {
                    Administrasi.pesananDibatalkan(pesanan);
                }
                else
                {
                    if(pesanan.getStatusAktif())
                    {
                        pesanan.setStatusAktif(false);
                    }
                }

                if(PESANAN_DATABASE.remove(pesanan))
                {
                    return true;
                }
            }
        }

        return false;
    }


}
