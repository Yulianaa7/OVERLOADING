/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author Yuliana
 */
public class Anak2 extends Induk{ //menjadikan class Anak2 menjadi subclass dari class Induk
    //membuat method hitung yang digunakan untuk menghitung volume Balok dengan 3 variabel di dalam parameter
    public void menghitung (int p, int l, int t){
        //untuk menghitung volume balok
        System.out.println("Volume Balok adalah "+p*l*t);
    }
    //membuat method hitung yang digunakan untuk menghitung volume Kubus dengan 1 variabel di dalam parameter
    public void menghitung (int s){
        //untuk menghitung volume kubus
        System.out.println("Volume Kubus adalah "+s*s*s);
    }
}
