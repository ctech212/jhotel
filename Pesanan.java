
/**
 * Ini merupakan class Pesanan, terdapat beberapa method untuk kepetingan pesanan.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 01/03/2018
 */
public class Pesanan
{
    private double biaya;
    private Customer pelanggan;
    private String namaPelanggan;
    private String jenisKamar;
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

    public String getPelanggan()
    {
        return namaPelanggan;
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

    public void setBiaya(double biaya)
    {
        this.biaya= biaya;
    }

    /**
    * ini merupakan method setPelanggan, yang merupakan Mutator.
    * @param pelanggan
    */
    public void setPelanggan(Customer baru)
    {
        pelanggan= baru;
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

    /**
    * ini merupakan method printData, untuk menghasilkan outpu dari biaya.
    * @param biaya
    */
    public void printData()
    {
        System.out.printf("Biaya adalah %.1f\n", biaya);
    }
    
    public void setRoom(Room kamar)
    {
    }
    public Room getRoom()
    {
        return kamar;
    }
       
}
