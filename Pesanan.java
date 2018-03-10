
/**
 * Ini merupakan class Pesanan, terdapat beberapa method untuk kepetingan pesanan.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 10/03/2018
 */
public class Pesanan
{
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private TipeKamar tipe_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
  


    /**
    * ini merupakan method Pesanan, yang merupakan Contructor.
    * @param biaya.
    * @param pelanggan.
    */
    public Pesanan(double biaya, Customer pelanggan)
    {
        this.biaya=biaya;//instance variable
        this.pelanggan=pelanggan;//instance variable
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

    /**
    * ini merupakan method getPelanggan, yang merupakan Accessor.
    * @param namaPelanggan.
    * @return namaPelanggan.
    */

    public Customer getPelanggan()
    {
        return pelanggan;
    }

    public String getNamaPelanggan()
    {
        return nama_pelanggan;
    }

    public TipeKamar getTipeKamar()
    {
        return tipe_kamar;
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

    /**
    * ini merupakan method setBiaya, yang merupakan Mutator.
    * @param biaya
    */

    public Room getRoom()
    {
        return kamar;
    }

    public void setBiaya(double biaya)
    {
        this.biaya= biaya;
    }

    /**
    * ini merupakan method setPelanggan, yang merupakan Mutator.
    * @param pelanggan
    */
    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan= pelanggan;
    }
    
    public void setNamaPelanggan(String namaPelanggan)
    {
        namaPelanggan= nama_pelanggan;
    }

    public void setTipeKamar(TipeKamar tipe_kamar)
    {
        this.tipe_kamar=tipe_kamar;
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
    * ini merupakan method printData, untuk menghasilkan outpu dari biaya.
    * @param biaya
    */
    public void printData()
    {
        System.out.println("\nPesanan");
        System.out.printf("Nama Pelanggan adalah "+ pelanggan.getNama());
        System.out.printf("\nTipe Kamar adalah %s", tipe_kamar);
        System.out.println("\nStatus Layanan Diproses adalah " + isDiproses);
        System.out.println("Status Layanan selesai adalah " + isSelesai);
    }
    


       
}
