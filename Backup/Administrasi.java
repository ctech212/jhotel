
/**
 * Ini merupakan class Admisnistrasi, yang akan mengatur logika pemesanan dan pembatalan pesanan..
 *
 * @author Mochamad Fahmi Fajrin
 * @version 10/03/2018
 */

public class Administrasi
{
    
    /**
    * ini merupakan method pesananDitugaskan, yang memproses ruangan yang akan di-assign.
    * @param pesan.
    * @param kamar.
    */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        roomAmbilPesanan(pesan,kamar);
    }
    
    /**
    * ini merupakan method roomAmbilPesanan, yang menyatakan bahwa status ruangan sudah berubah menjadi “booked” dan “ter-link” dengan objek Pesanan yang diberikan.
    * @param pesan.
    * @param kamar.
    */
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.BOOKED);
        kamar.setPesanan(pesan);
    }
    
    /**
    * ini merupakan method roomAmbilPesanan, yang menyatakan kalau status room menjadi “vacant” dan “ter-unlink” dengan objek Pesanan apapun.
    * @param kamar.
    */
   public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.VACANT);
        kamar.setPesanan(null);
    }
    
    /**
    * ini merupakan method pesananDibatalakan, yang mengubah status pesanan dan status room yang telah membatalkan pesanan serta me-unlink masing-masing objek.
    * @param kamar.
    */
    public static void pesananDibatalkan(Room kamar)
    {
        Pesanan pesan=kamar.getPesanan();
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        kamar.setPesanan(null);
        roomLepasPesanan(kamar);
       
    }
    
    /**
    * ini merupakan method pesananSelesai, yang mengubah status pesanan dan status room yang telah menyelesaikan pesanan serta me-unlink masing-masing objek.
    * @param kamar.
    */
    public static void pesananSelesai(Room kamar)
    {
        Pesanan pesan=kamar.getPesanan();
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        kamar.setPesanan(null);
        roomLepasPesanan(kamar);
    }
    
    /**
    * ini merupakan method pesananDibatalkan, yang mengubah status pesanan dan status room yang telah membatalkan pesanan serta me-unlink masing-masing objek.
    * @param pesan.
    */
    public static void pesananDibatalkan(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        
    }
    
    /**
    * ini merupakan method pesananSelesai, yang mengubah status pesanan dan status room yang telah menyelesaikan pesanan serta me-unlink masing-masing objek.
    * @param pesan.
    */
    public static void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
}
