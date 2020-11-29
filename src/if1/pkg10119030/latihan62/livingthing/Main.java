package if1.pkg10119030.latihan62.livingthing;
/**
* Nama              :Rendy Dermawan
* NIM               :10119030
* Kelas             :IF1
* Deskripsi Program :Program ini merupakan Main Class.
*/
public class Main {

    public static void main(String[] args) {
    Human h = new Human();
        h.setNama("Rendy Dermawan");
        h.walk(h.getNama());
        h.breath(h.getNama());
        h.eat(h.getNama());
        
        System.out.println();
        System.out.println("by. Rendy Dermawan");   
    }
    
}
