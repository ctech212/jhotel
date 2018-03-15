
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
        
           System.out.printf("Welcome to JHotel\n");
           Lokasi lokasihotel1= new Lokasi(38,13,"Lokasi Hotel");
           Customer customer1= new Customer(1506673813,"Fahmi");
           Hotel hotel1= new Hotel("Alexis",lokasihotel1,5);
           Room single= new SingleRoom(hotel1,"45",true,StatusKamar.BOOKED);
           Pesanan pesan1= new Pesanan(5,customer1,single);
        
           lokasihotel1.printData();
           customer1.printData();
           hotel1.printData();
        
           single.setDailyTariff(1000000);
           pesan1.setBiaya();
           Administrasi.pesananDitugaskan(pesan1,single);
           single.printData();
           pesan1.printData();
           
           if(single instanceof DoubleRoom)
            {
               System.out.printf("Benar Double Room\n");
            }
            else
            {
               System.out.printf("Salah, bukan Double Room\n");
            }
            
           Room doubleroom= new DoubleRoom(hotel1,"46",true,StatusKamar.VACANT);
           Pesanan pesan2= new Pesanan(4,customer1,doubleroom);
           doubleroom.setDailyTariff(1000000);
           pesan2.setBiaya();
           Administrasi.pesananDitugaskan(pesan2,doubleroom);
           doubleroom.printData();
           pesan2.printData();
           
           if(doubleroom instanceof DoubleRoom)
            {
               System.out.printf("Benar Double Room\n");
            }
            else
            {
               System.out.printf("Salah, bukan Double Room\n");
            }
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
