package jhotel;
/**
 * Ini merupakan class Enum untuk StatusKamar.Class ini akan membatasi status kamar.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 15/05/2018
 */
public enum StatusKamar
{
    BOOKED("Booked"),
    PROCESSED("Processed"),
    VACANT("Vacant");
    
    private final String toString;
    
    private StatusKamar(String toString)
    {
        this.toString=toString;
    }
    public String toString()
    {
        return this.toString;
    }
}
