
/**
 * Ini merupakan class Enum untuk StatusKamar.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 08-03-2018
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
