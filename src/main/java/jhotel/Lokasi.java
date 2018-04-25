package jhotel;

/**
 * Ini merupakan class Lokasi dimana pada kelas ini akan terdapat informasi tentang lokasi hotel.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 01/03/2018
 */
public class Lokasi
{
    
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;

   /**
   * ini merupakan method Lokasi, yang merupakan Constructor.
   * @param x_coord adalah untuk koordinat x.
   * @param y_coord adalah untuk koordinat y.
   */
    public Lokasi(float x_coord, float y_coord, String deskripsiLokasi)
    {
        this.x_coord=x_coord;//instance variable
        this.y_coord=y_coord;//instance variable
        this.deskripsiLokasi=deskripsiLokasi;//instance variable

    }

    /**
    * ini merupakan method getX, yang merupakan accessor.

    * @return xcoord.
    */


    public float getX()
    {
        return x_coord;
    }

    /**
    * ini merupakan method getY, yang meurupakan accessor.

    * @return y_coord.
    */

    public float getY()
    {
        return y_coord;
    }

    /**
    * ini merupakan method getDeskripsi, yang meurupakan accessor.

    * @return deskripsiLokasi
    */

    public String getDeskripsi()
    {
        return deskripsiLokasi;
    }

    /**
    * ini merupakan method setX, yang meurupakan mutator.

    */
    public void setX(float x_coord)
    {
        this.x_coord= x_coord;
    }

    /**
    * ini merupakan method setY, yang merupakan mutator.

    */
    public void setY(float y_coord)
    {   
        this.y_coord= y_coord; 
    }

    /**
    * ini merupakan method setDeskripsi, yang merupakan mutator.

    */

    public void setDeskripsi(String deskripsi)
    {
        deskripsiLokasi=deskripsi;
    }

    /**
    * ini merupakan method printData, yang akan menghasilkan input deskripsiLoksi.

    */
    public String toString()
    {
        
         return "\nKoordinat X adalah " +x_coord +
		"\nKoordinat Y adalah " +y_coord +
		"\nDeskripsi adalah " +deskripsiLokasi;
	}

}

    
    


