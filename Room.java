
/**
 * Ini class Room, berisi tentang informasi booking kamar.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 10/03/2018
 */

public abstract class Room
{
    
    private Hotel hotel;
    private String nomor_kamar;
    private boolean isAvailable;
    protected double dailyTariff;
    private StatusKamar status_kamar;
    private Pesanan pesan;
    
    public Room(Hotel hotel,String nomor_kamar, boolean isAvailable, StatusKamar status_kamar)
    {
        this.hotel=hotel;//instance variable
        this.nomor_kamar=nomor_kamar;//instance variable
        this.isAvailable=isAvailable;//instance variable
        this.status_kamar=status_kamar;//instance variable
        
    }
    public Hotel getHotel()
    {
        return hotel;
    }
    public String getNomorKamar()
    {
        return nomor_kamar;
    }
    public boolean getStatusAvailable()
    {
        return isAvailable;
    }

    public double getDailyTariff()
    {
        return dailyTariff;
    }
    public abstract TipeKamar getTipeKamar();
    
    public StatusKamar getStatusKamar()
    {
        return status_kamar;
    }
    public Pesanan getPesanan()
    {
        return pesan;
    }
    public void setHotel(Hotel hotel)
    {
        this.hotel=hotel;
    }

    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar=nomor_kamar;
    }
    
    public void setStatusAvailable(boolean isAvailable)
    {
        this.isAvailable=isAvailable;
    }

    public void setDailyTariff(double dailytariff)
    {
        dailyTariff=dailytariff;
    }
    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar=status_kamar;
    }
    public void setPesanan(Pesanan pesan)
    {
        this.pesan=pesan;
    }
    
    public String toString()
    {
        return null;
    }
    
    public void printData()
    {
        System.out.println("Room");
        System.out.println("Nama Hotel adalah  "+ hotel.getNama());
        System.out.printf("Nomor Kamar adalah %s\n", nomor_kamar);
        System.out.println("Tersedia: "+ isAvailable);
        System.out.println("Tipe Kamar:"+getTipeKamar().toString());
        System.out.println("Harga: "+ getDailyTariff());
        System.out.println("Status Kamar: "+ status_kamar);
    }

}
