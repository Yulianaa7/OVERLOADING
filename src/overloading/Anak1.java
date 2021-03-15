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
public class Anak1 extends Induk{ //menjadikan class Anak1 menjadi subclass dari class Induk
    
    //membuat method hitung yang digunakan untuk menghitung volume tabung dengan 2 variabel di dalam parameter
    public void hitung (double r, double t){
        //untuk menghitung volume tabung
        System.out.println("Volume Tabung adalah "+Math.PI*r*r*t);
    }
    
    //membuat method hitung yang digunakan untuk menghitung volume bola dengan 1 variabel di dalam parameter
    public void hitung(double r1){
        //untuk menghitung volume bola
        System.out.println("Volume Bola adalah "+(4*Math.PI*r1*r1*r1/3));
    }
}
