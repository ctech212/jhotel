
/**
 * Ini merupakan class Customer, berisi method untuk mendapatkan informasi customer.
 *
 * @author Mochamad Fahmi Fajrin
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
    public Customer(int id, String nama)
    {
        this.id=id;
        this.nama=nama;
    }

    /**
    * ini merupakan method getID, yang merupakan Accessor, method ini digunakan untuk mengambil informasi tentang ID customer.
    * @param id.
    * @return id.
    */
    public int getID()
    {
        return id;
    }

    /**
    * ini merupakan method getNama, yang merupakan Accessor, method ini digunakan untuk mengambil informasi tentang nama customer.
    * @param nama.
    * @return nama.
    */
    public String getNama()
    {
        return nama;
    }

    /**
    * ini merupakan method setID, yang merupakan Mutator.
    * @param id.
    */
    public void setID(int id)
    {
        this.id=id;
    }

    /**
    * ini merupakan method setNama, yang merupakan Mutator.
    * @param nama.
    */
    public void setNama(String nama)
    {
        this.nama=nama;
    } 
    public void printData()
    {
        System.out.println("Customer");
        System.out.printf("ID adalah %d\n", id);
        System.out.printf("Nama adalah %s\n", nama);
    }

}
