package jhotel.controller;

import jhotel.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class HotelController {

    @RequestMapping("/hotel")
    public ArrayList<Hotel> hotelsList(){
       ArrayList<Hotel> hotel=DatabaseHotel.getHotelDatabase();
        return hotel;
    }

    @RequestMapping("/hotel/{id_hotel}")
    public Hotel getHotel(@PathVariable int id_hotel){
        Hotel hotel = DatabaseHotel.getHotel(id_hotel);
        return hotel;
    }

}
