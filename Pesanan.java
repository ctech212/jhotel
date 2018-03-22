import java.util.Date;
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
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar)
    {
        this.biaya=kamar.getDailyTariff()*jumlahHari;
        this.jumlahHari=jumlahHari;//instance variable
        this.pelanggan=pelanggan;//instance variablee
        this.kamar=kamar;//instance variable
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
    
    public String toString()
    {
        return null;
    }


    /**
    * ini merupakan method printData, untuk menghasilkan outpu dari biaya.
    * @param biaya
    */
    public void printData()
    {
        System.out.println("\nPesanan");
        System.out.println("Nama Pelanggan adalah "+ pelanggan.getNama());
        System.out.printf("Jumlah Hari adalah %f\n",jumlahHari);
        System.out.println("Status Layanan Diproses adalah " + isDiproses);
        System.out.println("Status Layanan selesai adalah " + isSelesai);
        System.out.println("Biaya adalah " + biaya);
    }
    


       
}
