package jhotel;

import java.util.*;
import java.text.*;

/**
 * Ini merupakan class Pesanan, terdapat beberapa method untuk kepetingan pesanan.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */
public class Pesanan {
    private double biaya;
    private int id;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isAktif;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;


    /**
     * ini merupakan method Pesanan, yang merupakan Contructor.
     *
     * @param idHotel
     * @param jumlahHari
     * @param noKamar
     * @param pelanggan
     */
    public Pesanan(double jumlahHari, int idHotel, String noKamar, Customer pelanggan) {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.isAktif = true;
        this.kamar = DatabaseRoom.getRoom(DatabaseHotel.getHotel(idHotel), noKamar);
        try {
            this.biaya = jumlahHari * kamar.getDailyTariff();
        } catch (Exception e) {
            System.out.println("" + e);
        }
        this.tanggalPesan = new Date();
        this.id = DatabasePesanan.getLastPesananID() + 1;
    }

    /**
     * ini merupakan method setBiaya, yang merupakan Mutator untuk mengatur biaya.
     */
    public void setBiaya() {
        biaya = kamar.getDailyTariff() * jumlahHari;
    }

    /**
     * ini merupakan method getBiaya, yang merupakan Accessor untuk mendapatkan biaya pesanan.
     *
     * @return biaya.
     */
    public double getBiaya() {
        return biaya;
    }

    /**
     * ini merupakan method setID, yang merupakan Mutator untuk mengatur ID pesanan.
     *
     * @param id
     */
    public void setID(int id) {
        this.id = id;
    }


    /**
     * ini merupakan method getID, yang merupakan Accessor untuk mendapatkan id pesanan.
     *
     * @return id.
     */
    public int getID() {
        return id;
    }


    /**
     * ini merupakan method setTanggalPesan, yang merupakan Mutator untuk mengatur tanggal pesanan.
     *
     * @param tanggalPesan
     * @return tanggalPesan
     */
    public Date setTanggalPesan(Date tanggalPesan) {
        this.tanggalPesan = tanggalPesan;
        return tanggalPesan;

    }

    /**
     * ini merupakan method getJumlahHari, yang merupakan Accessor untuk mendapatkan jumlah hari pesanan.
     *
     * @return jumlahHari
     */
    public double getJumlahHari() {
        return jumlahHari;
    }


    /**
     * ini merupakan method setPelanggan, yang merupakan Mutator untuk mengatur pelanggan yang melakukan pesanan.
     *
     * @param pelanggan
     */
    public void setPelanggan(Customer pelanggan) {
        this.pelanggan = pelanggan;
    }

    /**
     * ini merupakan method getPelanggan, yang merupakan Accessor untuk mendapatkan pelanggan yang melakukan pesanan.
     *
     * @return pelanggan
     */

    public Customer getPelanggan() {
        return pelanggan;
    }

    /**
     * ini merupakan method setStatusAktif, yang merupakan Mutator untuk mengatur status aktif pesanan.
     *
     * @param aktif
     */
    public void setStatusAktif(boolean aktif) {
        isAktif = aktif;
    }

    /**
     * ini merupakan method getStatusAktif, yang merupakan Accessor untuk mendapatkan status aktif pesanan.
     *
     * @return isAktif
     */
    public boolean getStatusAktif() {
        return isAktif;
    }

    /**
     * ini merupakan method setStatusDiproses, yang merupakan Mutator untuk mengatur status diproses pesanan.
     */
    public void setStatusDiproses(boolean diproses) {
        isDiproses = diproses;
    }

    /**
     * ini merupakan method getStatusDiproses, yang merupakan Accessor untuk mendapatkan  status diproses pesanan.
     *
     * @return isDiproses
     */

    public boolean getStatusDiproses() {
        return isDiproses;
    }

    /**
     * ini merupakan method setStatusSelesai, yang merupakan Mutator untuk mengatur status selesai pesanan.
     */
    public void setStatusSelesai(boolean selesai) {
        isSelesai = selesai;
    }

    /**
     * ini merupakan method getStatusSelesai, yang merupakan Accessor untuk mendapatkan  status selesai pesanan.
     *
     * @return isSelesai
     */
    public boolean getStatusSelesai() {
        return isSelesai;
    }

    /**
     * ini merupakan method setRoom, yang merupakan Mutator untuk mengatur kamar pesanan.
     */
    public void setRoom(Room kamar) {
        this.kamar = kamar;
    }

    /**
     * ini merupakan method getRoom, yang merupakan Accessor untuk mendapatkan  kamar dari pesanan yang dibuat.
     *
     * @return kamar
     */
    public Room getRoom() {
        return kamar;
    }

    /**
     * ini merupakan method gettanggalPesan, yang merupakan Accessor untuk mendapatkan  tanggal pesan dari pesanan yang dibuat.
     *
     * @return tanggalPesan
     */
    public Date getTanggalPesan() {
        DateFormat formatter = new SimpleDateFormat("'DOB 'dd MMMM yyyy");
        String output = formatter.format(tanggalPesan);
        //System.out.print(output);
        System.out.println(output);
        return tanggalPesan;
    }

    /**
     * ini merupakan method toString, untuk menghasilkan output dari pesanan.
     */
    public String toString() {
        String final_status = "KOSONG";

        if (isDiproses == true && isSelesai == false) {
            final_status = "DIPROSES";
        } else if (isDiproses == false && isSelesai == false) {
            final_status = "KOSONG";
        } else if (isDiproses == false && isSelesai == true) {
            final_status = "SELESAI";
        }


        if (kamar != null) {
            return "Dibuat oleh " + getPelanggan().getNama()
                    + ". Proses booking untuk " + getRoom().getHotel().getNama()
                    + "kamar nomor " + getRoom().getNomorKamar()
                    + "dengan tipe kamar yang diinginkan " + getRoom().getTipeKamar().toString()
                    + ". Status: " + final_status + ".";
        } else {
            return "Dibuat oleh " + getPelanggan().getNama()
                    + ". Proses booking null"
                    + "kamar nomor null"
                    + "dengan tipe kamar yang diinginkan null"
                    + ". Status: " + final_status + ".";
        }
    }


}
