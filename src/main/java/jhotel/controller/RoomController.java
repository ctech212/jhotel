package jhotel.controller;

import jhotel.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RoomController {

    @RequestMapping("/vacantrooms")
    public ArrayList<Room> vacantRooms(){
        ArrayList<Room> room= DatabaseRoom.getVacantRooms();
        return room;
        //return DatabaseRoom.getVacantRooms();
    }

    @RequestMapping("/room/{id_hotel}/{room_no}")
    public Room getRoom(@PathVariable int id_hotel,
                        @PathVariable String room_no){
        Room room= DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel),room_no);
        return room;
    }
}
