import java.util.Random;
/**
 * Berikut merupakan class RunForYourLife.
 *
 * @author Mochamad Fahmi Fajrin
 * @version 21/04/2018
 */
public class RunForYourLife implements Runnable
{
    public Thread thread;
    private String tName;
    private int time;
    
    
    /**
     * Constructor for objects of class RunForYourLife
     */
    public RunForYourLife(String nama)
    {
        tName = nama;
        System.out.println(tName + " Ready");
    }

    public void run(){
      System.out.println(tName + " Go");
      
        try
      {
        for (int i=1 ;i<21;i++)
        {
            System.out.println( tName + " has passed checkpoint (" + i+")");
            thread.sleep(time);           
        }
     }
     catch(InterruptedException e)
     {
        System.out.println( tName + " was interrupted");
     }
     System.out.println(  tName + " has finished!" );
    }
    
   public void main (){
       if (tName.equals("Andreas")){
           time = random();
       }
       else if(tName.equals("Messi")){
           time = random() + 150;
       }else{
           time = random() + 240;
        }
    }
    public void start ()
   {
      System.out.println(tName + " Set...");
      if (thread == null)
      {
         thread = new Thread (this, tName);
         thread.start ();
      }
   }  
   
   public int random (){
       Random rand = new Random();
       Integer random = rand.nextInt(500)+1;
       return random;
    }
}
