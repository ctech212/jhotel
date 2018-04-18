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
    private static String[] list_pesanan;


    /**
     * ini merupakan method getPesananDatabase, yang merupakan Accessor.
     *
     * @return nothing.
     */

    public static ArrayList<Pesanan> getPesananDatabase(){
        return PESANAN_DATABASE;
    }

    public static int getLastPesananID(){
        return LAST_PESANAN_ID;
    }

    /**
     * ini merupakan method addPesanan.
     *
     * @param baru
     * @return baru.
     */
    public static boolean addPesanan(Pesanan baru) {
        for (int i = 0; i < PESANAN_DATABASE.size(); i++) {
            Pesanan pesanan = PESANAN_DATABASE.get(i);
            if (pesanan.getStatusAktif()==true&&pesanan.getID()==baru.getID()){
                return false;
            }
        }
        LAST_PESANAN_ID=baru.getID();
        PESANAN_DATABASE.add(baru);
        return true;
    }

    /**
     * ini merupakan method removePesanan.
     * @return pesan.
     */
    public static boolean removePesanan(Pesanan pesan)
    {
        for (int i = 0; i < PESANAN_DATABASE.size(); i++) {
            Pesanan tes = PESANAN_DATABASE.get(i);
            if (tes.equals(pesan)){
                if(tes.getRoom() != null)
                {
                    Administrasi.pesananDibatalkan(tes);
                }
                else
                {
                    if(tes.getStatusAktif())
                    {
                        tes.setStatusAktif(false);
                    }
                }

                if(PESANAN_DATABASE.remove(tes))
                {
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * ini merupakan method getPesanan, yang merupakan Accessor.
     *
     * @return nama.
     */
    public static Pesanan getPesanan(Room kamar) {
        for (int i = 0; i < PESANAN_DATABASE.size(); i++) {
            Pesanan pesanan= PESANAN_DATABASE.get(i);
            if (pesanan.getRoom()==kamar){
                return pesanan;
            }
        }
        return null;
    }

    public static Pesanan getPesananAktif(Customer pelanggan) {
        for (int i = 0; i < PESANAN_DATABASE.size(); i++) {
            Pesanan pesanan = PESANAN_DATABASE.get(i);
            if (pesanan.getStatusAktif()==true&&pesanan.getPelanggan().equals(pelanggan)){
                return pesanan;
            }
        }
        return null;
    }

    public static Pesanan getPesanan(int id) {
        for (int i = 0; i < PESANAN_DATABASE.size(); i++) {
            Pesanan pesanan = PESANAN_DATABASE.get(i);
            if (pesanan.getID()==id){
                return pesanan;
            }
        }
        return null;
    }


    /**
     * Metode untuk membatalkan pesanan
     *
     * @param pesan pesanan
     *
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {

    }
}
