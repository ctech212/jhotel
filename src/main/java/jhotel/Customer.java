package jhotel;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.*;
import java.util.Date;

/**
 * Ini merupakan class Customer, berisi method untuk mendapatkan informasi customer.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */
public class Customer {
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
    protected String password;
    SimpleDateFormat dmy = new SimpleDateFormat("dd MMMMMMMMM yyyy");

    /**
     * ini merupakan method Customer, yang merupakan Contructor.
     *
     * @param nama
     * @param bulan
     * @param email
     * @param password
     * @param tahun
     * @param tanggal
     */
    public Customer(String nama, int tanggal, int bulan, int tahun, String email, String password) {
        this.id = DatabaseCustomer.getLastCustomerID() + 1;
        this.nama = nama;
        this.dob = new GregorianCalendar(tahun, bulan - 1, tanggal).getTime();
        ;
        this.email = email;
        this.password = password;
    }

    /**
     * ini merupakan method Customer, yang merupakan Contructor.
     *
     * @param nama
     * @param email
     * @param password
     */
    public Customer(String nama, Date dob, String email, String password) {
        this.nama = nama;
        this.dob = dob;
        this.email = email;
        this.password = password;
    }

    /**
     * ini merupakan method getID, yang merupakan Accessor, method ini digunakan untuk mengambil informasi tentang ID customer.
     *
     * @return id
     */
    public int getID() {
        return id;
    }

    /**
     * ini merupakan method getNama, yang merupakan Accessor, method ini digunakan untuk mengambil informasi tentang nama customer.
     *
     * @return nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * ini merupakan method getPassword, yang merupakan Accessor, method ini digunakan untuk mengambil informasi tentang password customer.
     *
     * @return password
     */

    public String getPassword() {
        return password;
    }

    /**
     * ini merupakan method getEmail, yang merupakan Accessor, method ini digunakan untuk mengambil informasi tentang password customer.
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * ini merupakan method getDOB, yang merupakan Accessor, method ini digunakan untuk mengambil informasi tentang DOB customer.
     *
     * @return dob
     */
    public Date getDOB() {
        DateFormat formatter = new SimpleDateFormat("'DOB 'dd MMMM yyyy");
        String output = formatter.format(dob);
        //System.out.print(output);
        System.out.println(output);
        return dob;
    }

    /**
     * ini merupakan method setID, yang merupakan Mutator.
     *
     * @param id
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     * ini merupakan method setNama, yang merupakan Mutator.
     *
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * ini merupakan method setPassword, yang merupakan Mutator.
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * ini merupakan method setEmail, yang merupakan Mutator.
     *
     * @param email
     */
    public void setEmail(String email) {
        String polaregex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9][A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})";
        Pattern p = Pattern.compile(polaregex);
        Matcher cek = p.matcher(email);
        if (cek.matches()) {
            this.email = email;
        } else {
            this.email = null;
        }
    }


    /**
     * ini merupakan method setDOB, yang merupakan Mutator.
     *
     * @param dob
     */
    public void setDOB(Date dob) {
        this.dob = dob;
    }


    /**
     * ini merupakan method toString, yang akan memberikan method tentang informasi dari Customer.
     */
    public String toString() {
        if (DatabasePesanan.getPesananAktif(this) != null) {
            return "\nCustomer ID   : " + id +
                    "\nName          : " + nama +
                    "\nE-Mail        : " + email +
                    "\nDate of Birth : " + dob +
                    "\nBooking order is in progress";
        } else {
            return "\nCustomer ID   : " + id +
                    "\nName          : " + nama +
                    "\nE-Mail        : " + email +
                    "\nDate of Birth : " + dob;
        }
    }


}
