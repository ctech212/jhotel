
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own

    public Test()
    {

    }
    
    public static void main(String[] args) 
    {
        Motor motor= new Motor();
        Motor motor2= new Honda();
        Honda motor3= new Honda();
        
        System.out.println(motor.harga);
        System.out.println(motor2.harga);
        System.out.println(motor3.harga);
        
        motor.speed();
        motor2.speed();
        motor3.speed();
        
        //motor.jenisMotor();
        //motor2.jenisMotor();
        motor3.jenisMotor();
        
        motor.jenisKendaraaan();
        motor2.jenisKendaraaan();
        motor3.jenisKendaraaan();
        
        
    }
}

   
