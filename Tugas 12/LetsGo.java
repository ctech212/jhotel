
/**
 * Berikut merupakan kelas LetsGo
 *
 * @author Mochamad Fahmi Fajrin
 * @version 21/04/2018
 */
public class LetsGo
{
    

   public static void main(String args[])
    {
       RunForYourLife Lionel = new RunForYourLife("Lionel");
       Lionel.start ();
       RunForYourLife Andreas = new RunForYourLife("Andreas");
       Andreas.start ();
       RunForYourLife Messi = new RunForYourLife("Messi");
       Messi.start ();
       try
       {
          while(Messi.thread.isAlive())
          {
            Thread.sleep(500);
          }
       }
       catch(InterruptedException e)
       {
          System.out.println("Lomba Interrupted!");
       }
       System.out.println("Lomba has Finished!" );
    }
}

    
