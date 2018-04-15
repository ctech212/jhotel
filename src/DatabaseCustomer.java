import java.util.ArrayList;

/**
 * Ini merupakan class DatabaseCustomer, dimana pada class ini terdapat method untuk mendapatkan atau menghapus informasi atau database Customer.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 01/03/2018
 */
public class DatabaseCustomer
{
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;

    /**
     * ini merupakan method getCustomerDatabase, yang merupakan Accessor.

     * @return nothing.
     */
    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID() {
        return LAST_CUSTOMER_ID;
    }

    /**
    * ini merupakan method addCustomer.
    * @return baru.
    */
    public static boolean addCustomer(Customer baru)
    {

        for(Customer customer : CUSTOMER_DATABASE){
            if(baru.getID() == customer.getID()){
                return false;
            }
        }

        CUSTOMER_DATABASE.add(baru);
        LAST_CUSTOMER_ID = baru.getID();
        return true;
    }

    public static Customer getCustomer(int id)
    {
        for(Customer customer : CUSTOMER_DATABASE){
            if(customer.getID() == id){
                return customer;
            }
        }

        return null;
    }

    /**
    * ini merupakan method removeCustomer.

    * @return nama
    */
    public static boolean removeCustomer(int id)
    {

        for(Customer customer : CUSTOMER_DATABASE){
            if(customer.getID() == id){
                for(Pesanan pesanan : DatabasePesanan.getPesananDatabase()){
                    if(pesanan.getPelanggan() == customer){
                        DatabasePesanan.removePesanan(pesanan);
                    }
                }

                CUSTOMER_DATABASE.remove(customer);
                return true;
            }
        }

        return false;
    }

}
