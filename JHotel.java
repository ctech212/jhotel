
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

        Room kamar1=new Room(hotel1,"13",true, customer1, 3813, StatusKamar.VACANT);
        Pesanan pesan1= new Pesanan(543534,customer1);
        
        lokasihotel1.printData();
        customer1.printData();
        hotel1.printData();
        
        pesan1.setTipeKamar(TipeKamar.SINGLE);
        
	System.out.println("\n\n====================Method 1:pesananDitugaskan(Pesanan pesan, Room kamar)====================\n\n");
        Administrasi.pesananDitugaskan(pesan1,kamar1);
        kamar1.printData();
        pesan1.printData();
        
        System.out.println("\n\n====================Method 2:pesananDibatalkan(Room kamar)====================\n\n");
        Administrasi.pesananDibatalkan(kamar1);
        kamar1.printData();
        
        System.out.println("\n\n====================Method 3:pesananDibatalkan(Pesanan pesan))====================\n\n");
        Administrasi.pesananDibatalkan(pesan1);
        pesan1.printData();
        
       
        Administrasi.pesananDitugaskan(pesan1, kamar1);
        System.out.println("\n\n====================Method 4:pesananSelesai(Pesanan pesan)====================\n\n");
        Administrasi.pesananSelesai(pesan1);
        pesan1.printData();
        
        Administrasi.pesananDitugaskan(pesan1, kamar1);
        System.out.println("\n\n====================Method 5:pesananSelesai(Room kamar)====================\n\n");
        Administrasi.pesananSelesai(kamar1);
        kamar1.printData();
          
      
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
