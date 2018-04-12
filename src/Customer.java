import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.*;
import java.util.Date;

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
    protected String email;
    protected Date dob;

    /**
    * ini merupakan method Customer, yang merupakan Contructor.
    * @param id
    * @param nama
    */
    public Customer(int id, String nama,int tanggal, int bulan, int tahun)
    {
        this.id=id;
        this.nama=nama;
        this.dob= new Date(tanggal,bulan,tahun);
        
    }
    
    public Customer(int id, String nama, Date dob)
    {
        this.id=id;
        this.nama=nama;
        this.dob=dob;
    }

    /**
    * ini merupakan method getID, yang merupakan Accessor, method ini digunakan untuk mengambil informasi tentang ID customer.

    * @return id
    */
    public int getID()
    {
        return id;
    }

    /**
    * ini merupakan method getNama, yang merupakan Accessor, method ini digunakan untuk mengambil informasi tentang nama customer.

    * @return nama
    */
    public String getNama()
    {
        return nama;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public Date getDOB()
    {
        DateFormat formatter = new SimpleDateFormat("'DOB 'dd MMMM yyyy");
        String output = formatter.format(dob);
        //System.out.print(output);
        System.out.println(output);
        return dob;
    }

    /**
    * ini merupakan method setID, yang merupakan Mutator.
    * @param id
    */
    public void setID(int id)
    {
        this.id=id;
    }

    /**
    * ini merupakan method setNama, yang merupakan Mutator.
    * @param nama
    */
    public void setNama(String nama)
    {
        this.nama=nama;
    }
    
    public void setEmail(String email)
    {
        String polaregex="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9][A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})";
        Pattern p = Pattern.compile(polaregex); 
        Matcher cek = p.matcher(email); 
        if (cek.matches())
        {
            this.email = email;
        }

        else
        {
            this.email = null;
        }
    }
    
    public void setDOB(Date dob)
    {
        this.dob=dob;
    }
    
//    public String toString()
//    {
//        if(DatabasePesanan.getPesanan(this)!=null){
//            return "\nCustomer ID   : " + id +
//                   "\nName          : " + nama +
//                   "\nE-Mail        : " + email +
//                   "\nDate of Birth : " + dob +
//                   "\nBooking order is in progress";
//        }
//
//        else{
//            return "\nCustomer ID   : " + id +
//                   "\nName          : " + nama +
//                   "\nE-Mail        : " + email +
//                   "\nDate of Birth : " + dob;
//        }
//    }
    
    

}
