import java.util.GregorianCalendar;

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

   * @return Nothing.
   */
    public static void main(String[] args) 
    { 
        
           System.out.printf("Welcome to JHotel\n");
           Lokasi lokasihotel1= new Lokasi(38,13,"Lokasi Hotel");
           //Customer customer1= new Customer(1506673813,"Fahmi");
           Hotel hotel1= new Hotel("Alexis",lokasihotel1,5);
           Room single= new SingleRoom(hotel1,"45",true,StatusKamar.BOOKED);
           //Pesanan pesan1= new Pesanan(5,customer1,single);
           Customer cust1 = new Customer(34, "Mochamad Fahmi", new GregorianCalendar(2018,03,22).getTime());
           cust1.getDOB();
           
         //Pesanan pesanan = new Pesanan();

        //DatabasePesanan.addPesanan(pesanan);
        
        System.out.println("\n\ntoString kelas Customer untuk kondisi pertama : \n\n");
        System.out.println(cust1.toString());
        DatabasePesanan.removePesanan();
        System.out.println("\n\ntoString kelas Customer untuk kondisi kedua   : \n\n");
        System.out.println(cust1.toString());
        
        Lokasi lokasi = new Lokasi(99, 999, "asdasd");
        Hotel hotel = new Hotel("Melsadasdsaati", lokasi, 7);
        Room kamar = new SingleRoom(hotel, "GK2asd10", true, StatusKamar.VACANT);
        Pesanan pesan = new Pesanan(10, cust1, kamar, new GregorianCalendar(2018,2,22).getTime());

        kamar.setPesanan(pesan); 
        
        System.out.println("\n\ntoString kelas Room untuk kondisi pertama : \n\n");
        System.out.println(kamar.toString());
        kamar.setStatusAvailable(false);
        System.out.println("\n\ntoString kelas Room untuk kondisi kedua   : \n\n");
        System.out.println(kamar.toString());
        
        pesan.setStatusDiproses(true);
        pesan.setStatusSelesai(false);
        
        System.out.println("\n\ntoString kelas Pesanan untuk kondisi pertama : \n\n");
        System.out.println(pesan.toString());

        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(false);

        System.out.println("\n\ntoString kelas Pesanan untuk kondisi kedua   : \n\n");
        System.out.println(pesan.toString());
        
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(true);

        System.out.println("\n\ntoString kelas Pesanan untuk kondisi ketiga   : \n\n");
        System.out.println(pesan.toString());
           
           //customer1.setEmail("mochfahmi.modul5@netlab.com");
           //System.out.printf("Email "+ customer1.getEmail());
        
    //        lokasihotel1.printData();
    //        customer1.printData();
    //        hotel1.printData();
        
    //        single.setDailyTariff(1000000);
    //        pesan1.setBiaya();
    //        Administrasi.pesananDitugaskan(pesan1,single);
    //        single.printData();
    //        pesan1.printData();
           
    //        if(single instanceof DoubleRoom)
    //         {
    //            System.out.printf("Benar Double Room\n");
    //         }
    //         else
    //         {
    //            System.out.printf("Salah, bukan Double Room\n");
    //         }
            
    //        Room doubleroom= new DoubleRoom(hotel1,"46",true,StatusKamar.VACANT);
    //        Pesanan pesan2= new Pesanan(4,customer1,doubleroom);
    //        doubleroom.setDailyTariff(1000000);
    //        pesan2.setBiaya();
    //        Administrasi.pesananDitugaskan(pesan2,doubleroom);
    //        doubleroom.printData();
    //        pesan2.printData();
           
    //        if(doubleroom instanceof DoubleRoom)
    //         {
    //            System.out.printf("Benar Double Room\n");
    //         }
    //         else
    //         {
    //            System.out.printf("Salah, bukan Double Room\n");
    //         }
    } 

    /**
    * ini merupakan method Jhotel yang merupakan constructor.

    * @return Nothing.
    */
    public JHotel()
    {
       
    }
}
