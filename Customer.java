
/**
 * Ini merupakan class DatabasePesanan, berisi database.
 *
 * @author (Mochamad Fahmi Fajrin)
 * @version 01/03/2018
 */
public class Customer
{
    protected int id;
    protected String nama;

    /**
    * ini merupakan method Customer, yang merupakan Contructor.
    * @param id.
    * @param nama.
    */
    public void Customer(int id, String nama)
    {

    }

    /**
    * ini merupakan method getID, yang merupakan Accessor.
    * @param id.
    * @return id.
    */
    public int getID()
    {
        return id;
    }
    public String getNama()
    {
        return nama;
    }
    public void setID(int id)
    {
        this.id=id;
    }
    public void setNama(String nama)
    {
        this.nama=nama;
    } 
    public void printData()
    {
        System.out.printf("Nama Customer adalah %s", nama);
    }

}
