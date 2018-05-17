package jhotel.controller;

import jhotel.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Ini merupakan class RoomController, yang akan mengatur dari sisi server dan sisi client saat pengambilan data kamar.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */

@RestController
public class RoomController {

    /**
     * ini merupakan method vacantRooms, yang mengatur sisi server untuk mengambil database room.
     */
    @RequestMapping("/vacantrooms")
    public ArrayList<Room> vacantRooms() {
        ArrayList<Room> room = DatabaseRoom.getRoomDatabase();
        return room;
    }

    /**
     * ini merupakan method getRoom, yang mengatur sisi server untuk mengambil detail room berdasarkan id room.
     *
     * @param id_hotel
     * @param room_no
     */
    @RequestMapping("/room/{id_hotel}/{room_no}")
    public Room getRoom(@PathVariable int id_hotel,
                        @PathVariable String room_no) {
        Room room = DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), room_no);
        return room;
    }
}
