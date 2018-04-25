package jhotel;

/**
 * Write a description of class PremiumRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumRoom extends Room
{
   private static double DISCOUNT= 0.3;
    private static TipeKamar TIPE_KAMAR = TipeKamar.PREMIUM;
    
    
    public PremiumRoom(Hotel hotel, String nomor_kamar)
    {
         super(hotel, nomor_kamar);
    }
    
    public TipeKamar getTipeKamar(){
    return TIPE_KAMAR;
  
    }
    
    public double getDISCOUNT(){
    return DISCOUNT;
    }
    
    public void setDailyTariff(double dailyTariff){
     super.setDailyTariff(dailyTariff*DISCOUNT);
    }
    
}