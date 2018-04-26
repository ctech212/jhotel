package jhotel.controller;

import jhotel.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class PesananController {

    @RequestMapping("/pesanancustomer/{id_customer}")
    public Pesanan pesananCust(@PathVariable int id_customer) {
        Pesanan pesanan = DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
        return pesanan;
    }

    @RequestMapping("/pesanan/{id_pesanan}")
    public Pesanan getPesanan(@PathVariable int id_pesanan) {
        Pesanan pesanan = DatabasePesanan.getPesanan(id_pesanan);
        return pesanan;
    }

    @RequestMapping(value = "/bookpesanan", method = RequestMethod.POST)
    public Pesanan buatPesanan(@RequestParam(value = "jumlah_hari") double jumlah_hari,
                               @RequestParam(value = "id_customer") int id_customer,
                               @RequestParam(value = "id_hotel") int id_hotel,
                               @RequestParam(value = "nomor_kamar") String nomor_kamar) {
        Pesanan pesanan = new Pesanan(jumlah_hari, DatabaseCustomer.getCustomer(id_customer));
        try {
            DatabasePesanan.addPesanan(pesanan);
            Administrasi.pesananDitugaskan(
                    DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer)),
                    DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), nomor_kamar));

            Pesanan aktif = DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
            return aktif;
        } catch (PesananSudahAdaException exception) {
            exception.getMessage();
            return null;
        }
    }

    @RequestMapping(value = "/cancelpesanan", method = RequestMethod.POST)
    public Pesanan cancelPesanan(@RequestParam(value = "id_pesanan") int id_pesanan) {
        Administrasi.pesananDibatalkan(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }

    @RequestMapping(value = "/finishpesanan", method = RequestMethod.POST)
    public Pesanan finishPesanan(@RequestParam(value = "id_pesanan") int id_pesanan) {
        Administrasi.pesananSelesai(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }


}
