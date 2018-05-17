package jhotel;

/**
 * Ini merupakan class Admisnistrasi, yang akan mengatur logika pemesanan dan pembatalan pesanan..
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
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
     * ini merupakan method pesananDibatalkan, yang mengatur status ruangan setelah proses pembatalan pesanan.
     *
     * @param kamar
     */
    public static void pesananDibatalkan(Room kamar) {
        //kamar.getPesanan().setStatusSelesai(false);
        //kamar.getPesanan().setStatusDiproses(false);
        //kamar.getPesanan().setRoom(null);
        kamar.setStatusKamar(StatusKamar.VACANT);
        //pesan.setStatusAktif(false);
    }


    /**
     * ini merupakan method pesananSelesai, yang mengubah status pesanan dan status room yang telah menyelesaikan pesanan serta me-unlink masing-masing objek.
     *
     * @param kamar
     */

    public static void pesananSelesai(Room kamar) {

        //kamar.getPesanan().setStatusSelesai(true);
        //kamar.getPesanan().setStatusDiproses(false);
        //kamar.getPesanan().setRoom(null);
        kamar.setStatusKamar(StatusKamar.VACANT);
        //pesan.setStatusAktif(false);
    }


    /**
     * ini merupakan method pesananDibatalkan, yang mengatur status pesanan setelah proses pembatalan pesanan.
     *
     * @param pesan
     */
    public static void pesananDibatalkan(Pesanan pesan) {
        pesan.getRoom().setStatusKamar(StatusKamar.VACANT);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
    }


    /**
     * ini merupakan method pesananSelesai, yang mengatur status pesanan setelah proses pesanan diselesaikan.
     *
     * @param pesan
     */
    public static void pesananSelesai(Pesanan pesan) {
        pesan.getRoom().setStatusKamar(StatusKamar.VACANT);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
    }

}
