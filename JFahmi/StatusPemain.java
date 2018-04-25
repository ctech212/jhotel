
public enum StatusPemain
{
    IJNJURY("Cedera"),
    FIT("Siap Main"),
    DOUBT("Diragukan");
    
    public String toString;
    
    StatusPemain(String toString)
    {
        this.toString=toString;
    }
    
    public String toString()
    {
        return toString;
    }
}
