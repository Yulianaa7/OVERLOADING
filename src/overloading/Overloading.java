package overloading;

/**
 *
 * @author Yuliana
 */
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat objek Induk
        Induk awal = new Induk();
        //memanggil method volume
        awal.volume();
        
        System.out.println(""); //spasi
        
        //membuat objek Anak1
        Anak1 a = new Anak1();
        a.hitung(7, 10); //mengisi nilai r dan t untuk menghitung volume tabung
        System.out.println("");
        a.hitung(14); //mengisi nilai r1 untuk menghitung volume Bola
        System.out.println("");
        
        //membuat objek Anak2
        Anak2 b = new Anak2();
        b.menghitung(9); //mengisi nilai s untuk menghitung volume Kubus
        System.out.println("");
        b.menghitung(8, 10, 12); //mengisi nilai p, l, dan t untuk menghitung volume Balok
    }
    
}
