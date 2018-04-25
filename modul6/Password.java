import java.util.*;

public class Password
{
    private String input;
    Scanner scan= new Scanner(System.in);


    public Password()
    {
        System.out.print("Password:\n");
        input= scan.nextLine();
    }
    
    public void cek()
    {
        if(this.input.matches("((?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[\\W]).{8,})"))
        {
            System.out.print("Cocok");
        }else
        {
            System.out.print("Tidak Cocok");
        }
    
    }
}
