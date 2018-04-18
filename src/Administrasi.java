
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
    * @param pesan
    * @param kamar
    */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        kamar.setStatusKamar(StatusKamar.BOOKED);
    }

    
    /**
    * ini merupakan method pesanan Dibatalakan, yang mengubah status pesanan dan status room yang telah membatalkan pesanan serta me-unlink masing-masing objek.
    * @param kamar
    */
    public static void pesananDibatalkan(Room kamar)
    {
        //Pesanan pesan=kamar.getPesanan();
        //pesan.setStatusSelesai(false);
        //pesan.setStatusDiproses(false);
        kamar.setStatusKamar(StatusKamar.VACANT);
        //roomLepasPesanan(kamar);
       
    }
    
    /**
    * ini merupakan method pesananSelesai, yang mengubah status pesanan dan status room yang telah menyelesaikan pesanan serta me-unlink masing-masing objek.
    * @param kamar
    */
    public static void pesananSelesai(Room kamar)
    {
        Pesanan pesan = DatabasePesanan.getPesanan(kamar);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        roomLepasPesanan(kamar);
    }
    
    /**
    * ini merupakan method pesananDibatalkan, yang mengubah status pesanan dan status room yang telah membatalkan pesanan serta me-unlink masing-masing objek.
    * @param pesan
    */
    public static void pesananDibatalkan(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        pesan.setRoom(null);
    }

    public static void roomLepasPesanan(Room kamar){
        kamar.setStatusKamar(StatusKamar.VACANT);
    }
    /**
    * ini merupakan method pesananSelesai, yang mengubah status pesanan dan status room yang telah menyelesaikan pesanan serta me-unlink masing-masing objek.
    */
    public static void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
}
