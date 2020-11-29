package if1.pkg10119030.latihan62.livingthing;
/**
* Nama              :Rendy Dermawan
* NIM               :10119030
* Kelas             :IF1
* Deskripsi Program :Program ini berisikan class LivingThing.
 */
public abstract class LivingThing {
        public abstract void walk(String nama);
    
    public void breath(String nama){
        System.out.println(nama + " bernafas");
    }
    
    public void eat(String nama){
        System.out.println(nama + " makan");
    }
}
