import java.util.*;
import java.text.*;
/**
 * Ini merupakan class Pesanan, terdapat beberapa method untuk kepetingan pesanan.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 10/03/2018
 */
public class Pesanan
{
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;
  


    /**
    * ini merupakan method Pesanan, yang merupakan Contructor.
    * @param biaya.
    * @param pelanggan.
    */
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar, int hari, int bulan, int tahun)
    {
        this.biaya=kamar.getDailyTariff()*jumlahHari;
        this.jumlahHari=jumlahHari;//instance variable
        this.pelanggan=pelanggan;//instance variablee
        this.kamar=kamar;//instance variable
        tanggalPesan= new Date(hari,bulan,tahun);
    }
    
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar, Date tanggalPesan)
    {
        this.biaya=kamar.getDailyTariff()*jumlahHari;
        this.jumlahHari=jumlahHari;//instance variable
        this.pelanggan=pelanggan;//instance variablee
        this.kamar=kamar;//instance variable
        this.tanggalPesan=tanggalPesan;
    }

    /**
    * ini merupakan method getBiaya, yang merupakan Accessor.
    * @param biaya.
    * @return biaya.
    */
    public double getBiaya()
    {
        return biaya;
    }
    
    public double getJumlahHari()
    {
        return jumlahHari;
    }
    
    /**
    * ini merupakan method getPelanggan, yang merupakan Accessor.
    * @param namaPelanggan.
    * @return namaPelanggan.
    */

    public Customer getPelanggan()
    {
        return pelanggan;
    }

    
    /**
    * ini merupakan method getStatusDiproses, yang merupakan Accessor.
    * @param isDiproses.
    * @return isDiproses.
    */

    public boolean getStatusDiproses()
    {
        return isDiproses;
    }

    /**
    * ini merupakan method getStatusSelesai, yang merupakan Accessor.
    * @param isSelesai.
    * @return isSelesai.
    */

    public boolean getStatusSelesai()
    {
        return isSelesai;
    }


    public Room getRoom()
    {
        return kamar;
    }
    
    public Date getTanggalPesan()
    {
        DateFormat formatter = new SimpleDateFormat("'DOB 'dd MMMM yyyy");
        String output = formatter.format(tanggalPesan);
        //System.out.print(output);
        System.out.println(output);
        return tanggalPesan;
    }


    /**
    * ini merupakan method setPelanggan, yang merupakan Mutator.
    * @param pelanggan
    */
    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan= pelanggan;
    }
    

    /**
    * ini merupakan method setStatusDiproses, yang merupakan Mutator.
    * @param isDiproses.
    */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses=diproses;
    }

    /**
    * ini merupakan method setStatusSelesai, yang merupakan Mutator.
    * @param isSelesai.
    */
    public void setStatusSelesai(boolean selesai)
    {
        isSelesai=selesai;
    }

    public void setRoom(Room kamar)
    {
        this.kamar=kamar;   
    }
    
    /**
    * ini merupakan method setBiaya, yang merupakan Mutator.
    * @param biaya
    */
    public void setBiaya()
    {
        biaya=kamar.getDailyTariff()*jumlahHari;
    }
    
    public void setTanggalPesan(Date tanggalPesan)
    {
        this.tanggalPesan=tanggalPesan;
    }
    
  
    /**
    * ini merupakan method printData, untuk menghasilkan outpu dari biaya.
    * @param biaya
    */
    public String toString()
    {
        String final_status = "KOSONG";
        
        if (isDiproses == true && isSelesai == false){
            final_status = "DIPROSES";
        } else if (isDiproses == false && isSelesai == false){
            final_status = "KOSONG";
        } else if (isDiproses == false && isSelesai == true){
            final_status = "SELESAI";
        }
        return "Dibuat Oleh " +pelanggan.getNama() +
                ".Proses booking untuk" +kamar.getHotel()+
                "Kamar Nomor " + kamar.getNomorKamar()+
                "dengan tipe kamar yang diinginkan "+kamar.getTipeKamar()+
                ". Status :" +final_status+ ".";
    }
    


       
}
