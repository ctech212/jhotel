package jhotel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Ini merupakan class DBCustomer, yang akan mengatur logika database untuk customer.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */
public class DBCustomer {
    public static int LAST_CUSTOMER_ID;

    static public boolean insertCustomer(String name, String email, String password) {
        try {
            PreparedStatement stm = DatabaseConnection.connection().prepareStatement("select max(id) from customer");
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                LAST_CUSTOMER_ID = rs.getInt("max");
                System.out.println("Last Hotel Id = " + LAST_CUSTOMER_ID);
            }
            Customer pelanggan = new Customer(name, 1, 1, 1990, email, password);
            PreparedStatement stmt = DatabaseConnection.connection().prepareStatement("select * from customer where email = (?)");
            stmt.setString(1, email);
            ResultSet rs2 = stmt.executeQuery();
            if (rs2.next()) {
                throw new PelangganSudahAdaException(pelanggan);
            }
            PreparedStatement pstmt = DatabaseConnection.connection().prepareStatement("INSERT INTO customer VALUES (?, ?, ?, ?)");
            pstmt.setInt(1, LAST_CUSTOMER_ID + 1);
            pstmt.setString(2, name);
            pstmt.setString(3, email);
            pstmt.setString(4, password);
            //pstmt.addBatch();
            pstmt.executeUpdate();
            pstmt.close();
            System.out.println("Customer succesfully inserted");
            LAST_CUSTOMER_ID = pelanggan.getID();
            System.out.println("Last Customer Id = " + LAST_CUSTOMER_ID);
            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (PelangganSudahAdaException e) {
            System.out.println(e.getPesan());
            return false;
        }
    }

    public static int getLastCustomerId() {
        try {
            PreparedStatement stm = DatabaseConnection.connection().prepareStatement("select max(id) from customer");
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                LAST_CUSTOMER_ID = rs.getInt("max");
                return LAST_CUSTOMER_ID;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    static public Customer getCustomer(int id) {
        try {
            Customer pelanggan = null;
            Statement stmnt = null;
            PreparedStatement pstmt = DatabaseConnection.connection().prepareStatement("select * from customer where id = (?)");
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            System.out.println("Customer succesfully selected");
            if (rs.next()) {
                pelanggan = new Customer(rs.getString("name"), 1, 1, 1990, rs.getString("email"), rs.getString("password"));
                pelanggan.setID(rs.getInt("id"));
            }
            System.out.println(pelanggan);
            return pelanggan;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    static public boolean removeCustomer(int id) {
        try {
            Customer pelanggan = null;
            Statement stmnt = null;
            PreparedStatement pstmt = DatabaseConnection.connection().prepareStatement("delete from customer where id = (?)");
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            System.out.println("Customer berhasil dihapus");
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
