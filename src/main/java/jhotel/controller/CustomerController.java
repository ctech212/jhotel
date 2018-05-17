package jhotel.controller;

import jhotel.*;
import org.springframework.web.bind.annotation.*;


/**
 * Ini merupakan class CustomerController, yang akan mengatur dari sisi server dan sisi client saat pengambilan data customer.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */

@RestController
public class CustomerController {

    /**
     * ini merupakan method indexPage, yang mengatur halaman index pertama dari server.
     *
     * @param name
     */
    @RequestMapping("/")
    public String indexPage(@RequestParam(value = "name", defaultValue = "world") String name) {
        return "Hello " + name;
    }

    /**
     * ini merupakan method newCust, yang mengatur pengambilan data dari server untuk pembuatan customer baru.
     *
     * @param name
     * @param email
     * @param tahun
     * @param password
     */
    @RequestMapping(value = "/newcustomer", method = RequestMethod.POST)
    public Customer newCust(@RequestParam(value = "name") String name,
                            @RequestParam(value = "email") String email,
                            @RequestParam(value = "tahun", required = false, defaultValue = "2000") int tahun,
                            @RequestParam(value = "password") String password) {

        Customer customer = new Customer(name, 1, 1, tahun, email, password);
        try {
            DBCustomer.insertCustomer(name, email, password);
           // DatabaseCustomer.addCustomer(customer);
        } catch (Exception ex) {
            ex.getMessage();
            return null;
        }

        return customer;
    }


    /**
     * ini merupakan method loginCust, yang mengatur login customer.
     *
     * @param email
     * @param password
     */
    @RequestMapping(value = "/logincust", method = RequestMethod.POST)
    public Customer loginCust(@RequestParam(value = "email") String email,
                              @RequestParam(value = "password") String password) {
        for(int i=1; i<=DBCustomer.getLastCustomerId(); i++) {
            Customer pelanggan = DBCustomer.getCustomer(i);
            Customer customer = new Customer(pelanggan.getNama(), 1, 1, 1990, pelanggan.getEmail(), pelanggan.getPassword());
            try {
                DatabaseCustomer.addCustomer(customer);
            }
            catch(Exception ex) {
                ex.getMessage();
            }
        }

        Customer customer = DatabaseCustomer.getCustomerLogin(email, password);
        return customer;
    }



    /**
     * ini merupakan method getCust, yang mengatur sisi server untuk pengambilan customer berdasarkan id.
     *
     * @param id
     */
    @RequestMapping("/getcustomer/{id}")
    public Customer getCust(@PathVariable int id) {
        Customer customer = DatabaseCustomer.getCustomer(id);
        return customer;
    }


}