package jhotel;

/**
 * Write a description of class SingleRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SingleRoom extends Room
    {
        private static TipeKamar TIPE_KAMAR=TipeKamar.SINGLE;
        
        public SingleRoom(Hotel hotel,String nomor_kamar)
        {
            super(hotel,nomor_kamar);
        }
        public TipeKamar getTipeKamar()
        {
            return TIPE_KAMAR;
        }
            
    }
    
    
