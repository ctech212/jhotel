import java.util.ArrayList;

/**
 * Ini class DatabaseRoom.
 *
 * @author Mochamad Fahmi Fajrin 
 * @version 10/03/2018
 */
public class DatabaseRoom
{
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<Room>();

    public static ArrayList<Room> getRoomDatabase()
    {
        return ROOM_DATABASE;
    }

    public static boolean addRoom(Room baru)
    {
        for(Room room : ROOM_DATABASE)
        {
            if(!room.getHotel().equals(baru.getHotel()) &&
                    !room.getNomorKamar().equals(baru.getNomorKamar()))
            {
                ROOM_DATABASE.add(baru);
                return true;
            }
        }

        return false;
    }

    public static Room getRoom(Hotel hotel, String nomor_kamar)
    {
        for(Room room : ROOM_DATABASE)
        {
            if(room.getHotel().equals(hotel) &&
                    room.getNomorKamar().equals(nomor_kamar))
            {
                return room;
            }
        }

        return null;
    }

    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel)
    {
        ArrayList<Room> roomHotel = new ArrayList<Room>();

        for(Room room : ROOM_DATABASE)
        {
            if(room.getHotel().equals(hotel))
            {
                roomHotel.add(room);
            }
        }

        return roomHotel;
    }

    public static ArrayList<Room> getVacantRooms()
    {
        ArrayList<Room> roomHotel = new ArrayList<Room>();

        for(Room room : ROOM_DATABASE)
        {
            if(room.getStatusKamar().equals(StatusKamar.VACANT))
            {
                roomHotel.add(room);
            }
        }

        return roomHotel;
    }



    public static boolean removeRoom(Hotel hotel, String nomor_kamar)
    {
        for(Room room : ROOM_DATABASE)
        {
            if(room.getHotel().equals(hotel) &&
                    room.getNomorKamar().equals(nomor_kamar))
            {
                Administrasi.pesananDibatalkan(room);
                if(ROOM_DATABASE.remove(room))
                {
                    return true;
                }
            }
        }
        return false;
    }
    


}
