package jhotel.controller;

import jhotel.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


/**
 * Ini merupakan class HotelController, yang akan mengatur dari sisi server dan sisi client saat pengambilan data hotel.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */
@RestController
public class HotelController {


    /**
     * ini merupakan method hotelsList, yang mengatur sisi server untuk Database Hotel.
     */
    @RequestMapping("/hotel")
    public ArrayList<Hotel> hotelsList() {
        ArrayList<Hotel> hotel = DatabaseHotel.getHotelDatabase();
        return hotel;
    }

    /**
     * ini merupakan method getHotel, yang mengatur sisi server untuk pengambilan data hotel berdasarkan id dari hotel..
     *
     * @param id_hotel
     */
    @RequestMapping("/hotel/{id_hotel}")
    public Hotel getHotel(@PathVariable int id_hotel) {
        Hotel hotel = DatabaseHotel.getHotel(id_hotel);
        return hotel;
    }

}
