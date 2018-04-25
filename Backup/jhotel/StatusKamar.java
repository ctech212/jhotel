package jhotel;

/**
 * Ini merupakan class Enum untuk StatusKamar.Class ini akan membatasi status kamar.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 10/03/2018
 */
public enum StatusKamar
{
    BOOKED("Booked"),
    PROCESSED("Processed"),
    VACANT("Vacant");
    
    public String toString;
    
    StatusKamar(String toString)
    {
        this.toString=toString;
    }
    public String toString()
    {
        return toString;
    }
}
