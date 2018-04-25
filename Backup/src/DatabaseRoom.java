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

    public static boolean addRoom(Room baru) throws RoomSudahAdaException
    {
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room room = ROOM_DATABASE.get(i);
            if (room.getHotel()==(baru.getHotel())&&room.getNomorKamar()==baru.getNomorKamar()){
                throw new RoomSudahAdaException(baru);
            }
        }
        ROOM_DATABASE.add(baru);
        return true;
    }

    public static Room getRoom(Hotel hotel, String nomor_kamar)
    {
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room room = ROOM_DATABASE.get(i);
            if (room.getHotel().equals(hotel)&&room.getNomorKamar().equals(nomor_kamar)){
                return room;
            }
        }
        return null;
    }

    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel)
    {
        ArrayList<Room> REQUEST_ROOM = new ArrayList<Room>();
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room room = ROOM_DATABASE.get(i);
            if (room.getHotel().equals(hotel)){
                REQUEST_ROOM.add(room);
            }
        }
        return REQUEST_ROOM;
    }

    public static ArrayList<Room> getVacantRooms()
    {
        ArrayList<Room> REQUEST_ROOM = new ArrayList<Room>();
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room room = ROOM_DATABASE.get(i);
            if (room.getStatusKamar()==StatusKamar.VACANT){
                REQUEST_ROOM.add(room);
            }
        }
        return REQUEST_ROOM;
    }



    public static boolean removeRoom(Hotel hotel, String nomor_kamar) throws RoomTidakDitemukanException
    {
        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getHotel().equals(hotel) && kamar.getNomorKamar().equals(nomor_kamar))
            {
                Administrasi.pesananDibatalkan(kamar);
                if(ROOM_DATABASE.remove(kamar))
                {
                    return true;
                }
            }
        }

        throw new RoomTidakDitemukanException(hotel, nomor_kamar);
        //return false;
    }

}
