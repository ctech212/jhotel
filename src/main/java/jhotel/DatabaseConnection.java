package jhotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Ini merupakan class DatabaseConnection, yang akan mengatur antara server dengan database.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */

public class DatabaseConnection {

    static public Connection connection(){
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jhotel", "postgres", "postgres");
            System.out.println("Opened database successfully");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return c;
    }
}
