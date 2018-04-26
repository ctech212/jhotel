package jhotel;

/**
 * Ini merupakan class Admisnistrasi, yang akan mengatur logika pemesanan dan pembatalan pesanan..
 *
 * @author Mochamad Fahmi Fajrin
 * @version 10/03/2018
 */

public class Administrasi {

    /**
     * ini merupakan method pesananDitugaskan, yang memproses ruangan yang akan di-assign.
     *
     * @param pesan
     * @param kamar
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar) {
        if (kamar.getStatusKamar() == StatusKamar.VACANT) {
            pesan.setStatusSelesai(false);
            pesan.setStatusDiproses(true);
            pesan.setRoom(kamar);
            kamar.setStatusKamar(StatusKamar.BOOKED);
        } else {
            pesan.setStatusAktif(false);

        }
    }


    /**
     * ini merupakan method pesanan Dibatalakan, yang mengubah status pesanan dan status room yang telah membatalkan pesanan serta me-unlink masing-masing objek.
     *
     * @param kamar
     */


    /**
     * ini merupakan method pesananSelesai, yang mengubah status pesanan dan status room yang telah menyelesaikan pesanan serta me-unlink masing-masing objek.
     *
     * @param kamar
     */




    public static void roomLepasPesanan(Room kamar) {
        kamar.setStatusKamar(StatusKamar.VACANT);
    }

    /**
     * ini merupakan method pesananSelesai, yang mengubah status pesanan dan status room yang telah menyelesaikan pesanan serta me-unlink masing-masing objek.
     */

    public static void pesananDibatalkan(Room kamar)
    {

        // kamar.getPesanan().setStatusSelesai(false);
        // tidak bisa dilakukan karena pesan merupakan private object milik class Room



        Pesanan pesanTemp = DatabasePesanan.getPesananAktif(kamar);
        pesanTemp.setStatusSelesai(false);
        pesanTemp.setStatusDiproses(false);
//        pesanTemp.setRoom(null);
        pesanTemp.setStatusAktif(false);

        roomLepasPesanan(kamar);
    }

    public static void pesananSelesai(Room kamar)
    {

        Pesanan pesanTemp = DatabasePesanan.getPesananAktif(kamar);
        pesanTemp.setStatusSelesai(true);
        pesanTemp.setStatusDiproses(false);
//        pesanTemp.setRoom(null);
        pesanTemp.setStatusAktif(false);

        roomLepasPesanan(kamar);
    }

    public static void pesananDibatalkan(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());

        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
//        pesan.setRoom(null);
    }

    public static void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());

        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
//        pesan.setRoom(null);
    }

}
