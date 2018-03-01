
/**
 * Ini merupakan class Hotel, terdapat beberapa method terkait informasi hotel.
 *
 * @author (Mochamad Fahmi Fajrin)
 * @version 01/03/2018
 */
public class Hotel
{

    private String nama;
    private Lokasi lokasi;
    private int bintang;

    /**
    * ini merupakan method Hotel, yang merupakan Contructor.
    * @param nama.
    * @param lokasi.
    * @param bintang.
    */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
     	this.nama=nama;
     	this.lokasi=lokasi;
     	this.bintang=bintang;
    }

    /**
    * ini merupakan method getBintang, yang merupakan Accessor.
    * @param bintang.
    * @return bintang.
    */
    public int getBintang()
    {
    	return bintang;
    }

    /**
    * ini merupakan method getNama, yang merupakan Accessor.
    * @param nama.
    * @return nama.
    */
    public String getNama()
    {
    	return nama;
    }

    /**
    * ini merupakan method getLokasi, yang merupakan Accessor.
    * @param lokasi.
    * @return lokasi.
    */
    public Lokasi getLokasi()
    {
    	return lokasi;
    }

    /**
    * ini merupakan method setNama, yang merupakan Mutator.
    * @param nama.
    */
    public void setNama(String nama)
    {
    	this.nama=nama;
    }

    /**
    * ini merupakan method setLokasi, yang merupakan Mutator.
    * @param seLokasi.
    */
    public void setLokasi(Lokasi lokasi)
    {
    	this.lokasi=lokasi;
    }

    /**
    * ini merupakan method setBintang, yang merupakan Mutator.
    * @param bintang.
    */
    public void setBintang(int bintang)
    {
    	this.bintang=bintang;
    }

    /**
    * ini merupakan method print, yang akan menghasilkan output nama hotel.
    * @param nama.
    */
    public void printData()
    {
    	System.out.printf("Nama Pelanggan: %s", nama);
    }


}
