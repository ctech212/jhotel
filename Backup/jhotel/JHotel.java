package jhotel;

import java.util.GregorianCalendar;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication


/**
 * Ini merupakan class JHotel, terdapat fungsi main pada class ini.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 01/03/2018
 */
public class JHotel {

    /**
     * ini merupakan main method.
     */
    public static void main(String[] args) {
        SpringApplication.run(JHotel.class, args);
//
//        System.out.printf("======================================");
//        System.out.println("\nException Pelanggan Sudah Ada");
//        Customer A = new Customer("A", 1, 4, 1999, "a@ui.com");
//        try {
//            DatabaseCustomer.addCustomer(A);
//        } catch (PelangganSudahAdaException a) {
//            System.out.println(a.getPesan());
//        }
//
//
//        Customer B = new Customer("B", 16, 4, 1999, "b@b.com");
//        try {
//            DatabaseCustomer.addCustomer(B);
//        } catch (PelangganSudahAdaException a) {
//            System.out.println(a.getPesan());
//        }
//
//
//        Customer C = new Customer("C", 10, 4, 1991, "a@ui.com");
//        try {
//            DatabaseCustomer.addCustomer(C);
//            DatabaseCustomer.addCustomer(C);
//        } catch (PelangganSudahAdaException a) {
//            System.out.println(a.getPesan());
//        }
//
//        Pesanan pesan1 = new Pesanan(1, DatabaseCustomer.getCustomer(1));
//        Pesanan pesan2 = new Pesanan(1, DatabaseCustomer.getCustomer(1));
//        Pesanan pesan3 = new Pesanan(3, DatabaseCustomer.getCustomer(3));
//        Pesanan pesan4 = new Pesanan(4, DatabaseCustomer.getCustomer(4));
//
//        System.out.println("\n-Exception Pesanan Sudah Ada-");
//        try {
//            DatabasePesanan.addPesanan(pesan1);
//            DatabasePesanan.addPesanan(pesan2);
//            DatabasePesanan.addPesanan(pesan3);
//            DatabasePesanan.addPesanan(pesan4);
//        }
//
//        catch (PesananSudahAdaException tes)
//        {
//            System.out.println(tes.getPesan());
//        }
//
//        System.out.printf("======================================");
//        System.out.printf("\nException Hotel Sudah Ada\n");
//
//        Lokasi test1 = new Lokasi(1, 2, "AAAAAAAA");
//        Lokasi test2 = new Lokasi(3, 4, "BBBBBBBB");
//        Lokasi test3 = new Lokasi(5, 6, "CCCCCCCC");
//        Lokasi test4 = new Lokasi(7, 8, "DDDDDDDD");
//
//        Hotel D = new Hotel("A", test1, 5);
//        try {
//            DatabaseHotel.addHotel(D);
//        } catch (HotelSudahAdaException a) {
//            System.out.println(a.getPesan());
//        }
//
//
//        Hotel E = new Hotel("A", test2, 4);
//        try {
//            DatabaseHotel.addHotel(E);
//        } catch (HotelSudahAdaException a) {
//            System.out.println(a.getPesan());
//        }
//
//
//        Hotel F = new Hotel("C", test3, 3);
//        try {
//            DatabaseHotel.addHotel(F);
//        } catch (HotelSudahAdaException a) {
//            System.out.println(a.getPesan());
//        }
//
//
//        Hotel G = new Hotel("D", test4, 3);
//        try {
//            DatabaseHotel.addHotel(G);
//            DatabaseHotel.addHotel(D);
//        } catch (HotelSudahAdaException a) {
//            System.out.println(a.getPesan());
//        }
//
//
//        System.out.printf("====================================");
//        System.out.printf("\nException Room Sudah Ada\n");
//
//        Room A101 = new SingleRoom(D, "A101");
//        try {
//            DatabaseRoom.addRoom(A101);
//        } catch (RoomSudahAdaException a) {
//            System.out.println(a.getPesan());
//        }
//
//
//        Room D404 = new PremiumRoom(D, "D404");
//        try {
//            DatabaseRoom.addRoom(D404);
//        } catch (RoomSudahAdaException a) {
//            System.out.println(a.getPesan());
//        }
//
//
//        Room B202 = new DoubleRoom(E, "B202");
//        try {
//            DatabaseRoom.addRoom(B202);
//        } catch (RoomSudahAdaException a) {
//            System.out.println(a.getPesan());
//        }
//
//
//        Room C303 = new PremiumRoom(F, "C303");
//        try {
//            DatabaseRoom.addRoom(C303);
//            DatabaseRoom.addRoom(A101);
//        } catch (RoomSudahAdaException a) {
//            System.out.println(a.getPesan());
//        }
//
//        System.out.printf("====================================");
//        System.out.println("\nException Pelanggan Tidak Ditemukan");
//
//        try {
//            DatabaseCustomer.removeCustomer(3);
//        } catch (PelangganTidakDitemukanException a) {
//            System.out.println(a.getPesan());
//        }
//
//        System.out.printf("====================================");
//        System.out.println("\nException Hotel Tidak Ditemukan");
//
//        try {
//            DatabaseHotel.removeHotel(2);
//
//        } catch (HotelTidakDitemukanException a) {
//            System.out.println(a.getPesan());
//        }
//
//        System.out.printf("====================================");
//        System.out.println("\nException Room Tidak Ditemukan");
//
//        try {
//            DatabaseRoom.removeRoom(D, "D404");
//
//        } catch (RoomTidakDitemukanException a) {
//            System.out.println(a.getPesan());
//        }
//
//        System.out.printf("====================================");
//        System.out.println("\nException Pesanan Tidak Ditemukan");
//        Pesanan pesan5 = new Pesanan(4, DatabaseCustomer.getCustomer(2));
//        try {
//            DatabasePesanan.removePesanan(pesan5);
//        } catch (PesananTidakDitemukanException a) {
//            System.out.println(a.getPesan());
//        }
//
//
//
//
//        System.out.println("\n---  Hasil Akhir Customer  --- \n");
//        System.out.println(DatabaseCustomer.getCustomerDatabase());
//        System.out.println("\n---  Hasil Akhir Room  --- \n");
//        System.out.println(DatabaseRoom.getRoomDatabase());
//        System.out.println("\n---  Hasil Akhir Hotel  --- \n");
//        System.out.println(DatabaseHotel.getHotelDatabase());
//        System.out.println("\n---  Hasil Akhir Pesanan  --- \n");
//        System.out.println(DatabasePesanan.getPesananDatabase());
    }

    /**
     * ini merupakan method Jhotel yang merupakan constructor.
     *
     * @return Nothing.
     */
    public JHotel() {

    }
}
