
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) 
    {
        Pemain pemain1= new Pemain("Pogba",StatusPemain.FIT,"Gelandangan");
        pemain1.setStatusPemain(StatusPemain.DOUBT);
        pemain1.printData();
    }
}
