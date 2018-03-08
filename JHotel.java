
/**
 * Ini merupakan class JHotel, terdapat fungsi main pada class ini.
 *  
 *
 * @author Mochamad Fahmi Fajrin
 * @version 01/03/2018
 */
public class JHotel
{

   /**
   * ini merupakan main method.
   * @param Nothing.
   * @return Nothing.
   */
    public static void main(String[] args) 
    { 
      Customer customer1= new Customer(13,"Fahmi");
      Lokasi lokasi1= new Lokasi(1,2,"ini deskripsi lokasi saya");
      Hotel hotel1= new Hotel("Alexis", lokasi1, 5);
      Pesanan pesanan1= new Pesanan(500000, customer1);
      
            
      customer1.printData();
      pesanan1.printData();
      hotel1.printData();
      
      customer1.setNama("Kiel");      
      customer1.printData();
      pesanan1.printData();
      hotel1.printData();

      
      
    } 

    /**
    * ini merupakan method Jhotel yang merupakan constructor.
    * @param Nothing.
    * @return Nothing.
    */
    public JHotel()
    {
       
    }
}
