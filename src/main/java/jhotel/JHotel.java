package jhotel;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

/**
 * Ini merupakan class JHotel, terdapat fungsi main pada class ini.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */
public class JHotel {

    /**
     * ini merupakan main method.
     */
    public static void main(String[] args) {


        Lokasi alexis = new Lokasi(1, 2, "Ancol, Jakarta");
        Lokasi borobudur = new Lokasi(1, 2, "Kemayoran, Jakarta");
        Lokasi capitol = new Lokasi(1, 2, "Taman Sari, Jakarta");
        Lokasi dias = new Lokasi(1, 2, "Kemayoran, Jakarta");
        Lokasi emeralda = new Lokasi(1, 2, "Taman Sari, Jakarta");


        Hotel A = new Hotel("HOTEL ALEXIS", alexis, 5);
        try {
            DatabaseHotel.addHotel(A);
        } catch (HotelSudahAdaException a) {
            System.out.println(a.getPesan());
        }

        Hotel B = new Hotel("HOTEL BOROBUDUR", borobudur, 3);
        try {
            DatabaseHotel.addHotel(B);
        } catch (HotelSudahAdaException a) {
            System.out.println(a.getPesan());
        }

        Hotel C = new Hotel("HOTEL CAPITOL", capitol, 2);
        try {
            DatabaseHotel.addHotel(C);
        } catch (HotelSudahAdaException a) {
            System.out.println(a.getPesan());
        }

        Hotel D = new Hotel("HOTEL DIAS", dias, 3);
        try {
            DatabaseHotel.addHotel(D);
        } catch (HotelSudahAdaException a) {
            System.out.println(a.getPesan());
        }

        Hotel E = new Hotel("HOTEL EMERALDA", emeralda, 6);
        try {
            DatabaseHotel.addHotel(E);
        } catch (HotelSudahAdaException a) {
            System.out.println(a.getPesan());
        }

        //Room
        Room A191 = new SingleRoom(A, "A101");
        A191.setDailyTariff(300000);
        try {
            DatabaseRoom.addRoom(A191);
        } catch (RoomSudahAdaException a) {
            System.out.println(a.getPesan());
        }
        Room A404 = new PremiumRoom(A, "A404");
        A404.setDailyTariff(400000);
        try {
            DatabaseRoom.addRoom(A404);
        } catch (RoomSudahAdaException a) {
            System.out.println(a.getPesan());
        }
        Room A202 = new DoubleRoom(A, "A202");
        A202.setDailyTariff(500000);
        try {
            DatabaseRoom.addRoom(A202);
        } catch (RoomSudahAdaException a) {
            System.out.println(a.getPesan());
        }

        Room B191 = new SingleRoom(B, "B101");
        B191.setDailyTariff(200000);
        try {
            DatabaseRoom.addRoom(B191);
        } catch (RoomSudahAdaException a) {
            System.out.println(a.getPesan());
        }
        Room B404 = new PremiumRoom(B, "B404");
        B404.setDailyTariff(300000);
        try {
            DatabaseRoom.addRoom(B404);
        } catch (RoomSudahAdaException a) {
            System.out.println(a.getPesan());
        }
        Room B202 = new DoubleRoom(B, "B202");
        B202.setDailyTariff(400000);
        try {
            DatabaseRoom.addRoom(B202);
        } catch (RoomSudahAdaException a) {
            System.out.println(a.getPesan());
        }

        Room C191 = new SingleRoom(C, "C101");
        C191.setDailyTariff(200000);
        try {
            DatabaseRoom.addRoom(C191);
        } catch (RoomSudahAdaException a) {
            System.out.println(a.getPesan());
        }
        Room C404 = new PremiumRoom(C, "C404");
        C404.setDailyTariff(300000);
        try {
            DatabaseRoom.addRoom(C404);
        } catch (RoomSudahAdaException a) {
            System.out.println(a.getPesan());
        }
        Room C202 = new DoubleRoom(C, "C202");
        C202.setDailyTariff(400000);
        try {
            DatabaseRoom.addRoom(C202);
        } catch (RoomSudahAdaException a) {
            System.out.println(a.getPesan());
        }

        Room D404 = new PremiumRoom(D, "D404");
        D404.setDailyTariff(300000);
        try {
            DatabaseRoom.addRoom(D404);
        } catch (RoomSudahAdaException a) {
            System.out.println(a.getPesan());
        }
        Room E202 = new DoubleRoom(E, "E202");
        E202.setDailyTariff(400000);
        try {
            DatabaseRoom.addRoom(E202);
        } catch (RoomSudahAdaException a) {
            System.out.println(a.getPesan());
        }


        SpringApplication.run(JHotel.class, args);
    }

    /**
     * ini merupakan method Jhotel yang merupakan constructor.
     *
     * @return Nothing.
     */
    public JHotel() {

    }
}
