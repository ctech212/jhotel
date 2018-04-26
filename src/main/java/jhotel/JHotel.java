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

        Lokasi test1 = new Lokasi(1, 2, "AAAAAAAA");
        Lokasi test2 = new Lokasi(3, 4, "BBBBBBBB");

        Hotel D = new Hotel("A", test1, 5);
        try {
            DatabaseHotel.addHotel(D);
        } catch (HotelSudahAdaException a) {
            System.out.println(a.getPesan());
        }


        Hotel E = new Hotel("B", test2, 4);
        try {
            DatabaseHotel.addHotel(E);
        } catch (HotelSudahAdaException a) {
            System.out.println(a.getPesan());
        }


        Room A101 = new SingleRoom(D, "A101");
        try {
            DatabaseRoom.addRoom(A101);
        } catch (RoomSudahAdaException a) {
            System.out.println(a.getPesan());
        }


        Room D404 = new PremiumRoom(D, "D404");
        try {
            DatabaseRoom.addRoom(D404);
        } catch (RoomSudahAdaException a) {
            System.out.println(a.getPesan());
        }

        Room B202 = new DoubleRoom(E, "B202");
        try {
            DatabaseRoom.addRoom(B202);
        } catch (RoomSudahAdaException a) {
            System.out.println(a.getPesan());
        }


    }

    /**
     * ini merupakan method Jhotel yang merupakan constructor.
     *
     * @return Nothing.
     */
    public JHotel() {

    }
}
