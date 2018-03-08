
/**
 * Ini merupakan class Enum untuk TipeKamar
 *
 * @author Mochamad Fahmi Fajrin
 * @version 08-03-2018
 */
public enum TipeKamar
{
    SINGLE("Single"),
    DOUBLE("Double"),
    PREMIUM("Premium");
    
    public String toString;
    
    TipeKamar(String toString)
    {
        this.toString=toString;
    }
    
    public String toString()
    {
        return toString;
    }
        
       
}
