package if1.pkg10119030.latihan62.livingthing;
/**
* Nama              :Rendy Dermawan
* NIM               :10119030
* Kelas             :IF1
* Deskripsi Program :Program ini berisikan Class Human.
 */
public class Human extends LivingThing{
    private String nama;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    /*Override*/
    public  void walk(String nama){
        System.out.println(nama + " sedang berjalan");
    }
}