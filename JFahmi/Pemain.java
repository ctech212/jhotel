
/**
 * Write a description of class Pemain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pemain
{
    private String nama;
    private StatusPemain status;
    private String posisi;
    
    public Pemain(String nama, StatusPemain status, String posisi)
    {
        this.nama=nama;
        this.status=status;
        this.posisi=posisi;
    }
    
    public String getnama()
    {
     return nama;   
    }
    public StatusPemain getStatusPemain()
    {
     return status;   
    }
    public String getPosisi()
    {
     return posisi;
    }

    
    public void setStatusPemain(StatusPemain status)
    {
     this.status=status;   
    }
    public void setPosisi(String posisi)
    {
     this.posisi=posisi;
    }
    public void setNama(String nama)
    {
    this.nama=nama;
    }
    
    public void printData()
    {
        System.out.printf("Nama Pemain adalah %s\n", nama);
        System.out.printf("Status Pemain adalah %s\n", status);
        System.out.printf("Posisi adalah %s\n",posisi);
    }
    
    
        
    
    
}
