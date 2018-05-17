package jhotel.controller;

import jhotel.*;
import org.springframework.web.bind.annotation.*;


/**
 * Ini merupakan class PesananController, yang akan mengatur dari sisi server dan sisi client saat pengambilan data pesanan.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */
@RestController
public class PesananController {


    /**
     * ini merupakan method pesananaCust, yang mengatur sisi server untuk melihat detail  pesanan customer berdasarkan id dari customer.
     *
     * @param id_customer
     */
    @RequestMapping("/pesanancustomer/{id_customer}")
    public Pesanan pesananCust(@PathVariable int id_customer) {
        Pesanan pesanan = DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
        return pesanan;
    }


    /**
     * ini merupakan method getPesanan, yang mengatur sisi server untuk mengambil pesanan berdasarkan id pesanan.
     *
     * @param id_pesanan
     */
    @RequestMapping("/pesanan/{id_pesanan}")
    public Pesanan getPesanan(@PathVariable int id_pesanan) {
        Pesanan pesanan = DatabasePesanan.getPesanan(id_pesanan);

        return pesanan;
    }

    /**
     * ini merupakan method buatPesanan, yang mengatur sisi server untuk melakukan pesanan oleh customer.
     *
     * @param jumlah_hari
     * @param id_customer
     * @param id_hotel
     * @param nomor_kamar
     */
    @RequestMapping(value = "/bookpesanan", method = RequestMethod.POST)
    public Pesanan buatPesanan(@RequestParam(value = "jumlah_hari") double jumlah_hari,
                               @RequestParam(value = "id_customer") int id_customer,
                               @RequestParam(value = "id_hotel") int id_hotel,
                               @RequestParam(value = "nomor_kamar") String nomor_kamar) {
        Pesanan pesanan = new Pesanan(jumlah_hari, id_hotel, nomor_kamar, DatabaseCustomer.getCustomer(id_customer));
        try {
            DatabasePesanan.addPesanan(new Pesanan(jumlah_hari, id_hotel, nomor_kamar, DatabaseCustomer.getCustomer(id_customer)));
            Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer)),
                    DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), nomor_kamar));

            return DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    /**
     * ini merupakan method cancelPesanan, yang mengatur sisi server untuk melakukan cancel pesanan berdasarkan id pesanan.
     *
     * @param id_pesanan
     */
    @RequestMapping(value = "/cancelpesanan", method = RequestMethod.POST)
    public Pesanan cancelPesanan(@RequestParam(value = "id_pesanan") int id_pesanan) {
        Administrasi.pesananDibatalkan(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }

    /**
     * ini merupakan method finishPesanan, yang mengatur sisi server untuk menyelesaikan pesanan berdasarkan id pesanan.
     *
     * @param id_pesanan
     */
    @RequestMapping(value = "/finishpesanan", method = RequestMethod.POST)
    public Pesanan finishPesanan(@RequestParam(value = "id_pesanan") int id_pesanan) {
        Administrasi.pesananSelesai(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }


}
