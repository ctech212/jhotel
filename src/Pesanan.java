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
    private int id;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isAktif;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;
  


    /**
    * ini merupakan method Pesanan, yang merupakan Contructor.

    */
    public Pesanan(double jumlahHari, Customer pelanggan)
    {
        this.biaya=kamar.getDailyTariff()*jumlahHari;
        this.pelanggan=pelanggan;//instance variable
        isAktif=true;
        tanggalPesan=new Date();
        id= DatabasePesanan.getLastPesananID()+1;
    }


    /**
    * ini merupakan method getBiaya, yang merupakan Accessor.

    * @return biaya.
    */
    public double getBiaya()
    {
        return biaya;
    }

    public int getID()
    {
        return id;
    }


    public double getJumlahHari()
    {
        return jumlahHari;
    }
    
    /**
    * ini merupakan method getPelanggan, yang merupakan Accessor.

    * @return namaPelanggan.
    */

    public Customer getPelanggan()
    {
        return pelanggan;
    }

    public boolean getStatusAktif()
    {
        return isAktif;
    }

    
    /**
    * ini merupakan method getStatusDiproses, yang merupakan Accessor.

    * @return isDiproses.
    */

    public boolean getStatusDiproses()
    {
        return isDiproses;
    }

    /**
    * ini merupakan method getStatusSelesai, yang merupakan Accessor.

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

    public void setID(int id)
    {
        this.id= id;
    }
    

    /**
    * ini merupakan method setStatusDiproses, yang merupakan Mutator.
    */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses=diproses;
    }

    /**
    * ini merupakan method setStatusSelesai, yang merupakan Mutator.
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

    */
    public void setBiaya()
    {
        biaya=kamar.getDailyTariff()*jumlahHari;
    }
    
    public Date setTanggalPesan(Date tanggalPesan)
    {
        this.tanggalPesan=tanggalPesan;
        return tanggalPesan;

    }

    public void setStatusAktif(boolean aktif)
    {
        aktif=isAktif;
    }
    
  
    /**
    * ini merupakan method printData, untuk menghasilkan outpu dari biaya.

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
