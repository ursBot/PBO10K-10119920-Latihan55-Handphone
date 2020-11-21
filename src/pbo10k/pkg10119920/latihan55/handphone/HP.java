/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan55.handphone;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

public class HP {

    public static void main(String[] args) {
        
        Android a = new Android("Samsung", "Android", "Grand", 3000000);
        BlackBerry b = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        WindowsPhone wp = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        
        a.setKeyStore("234ibfd3840fo");
        a.displayProduct();
        System.out.println("Android Key Store : " + a.getKeyStore());
        
        System.out.println();
        
        b.setPinBB("BHS249");
        b.displayProduct();
        System.out.println("PIN : " + b.getPinBB());
        
        System.out.println();
        
        wp.setWpKeyStore("UUUQIJWORJ");
        wp.displayProduct();
        System.out.println("Wp Key Store : " + wp.getWpKeyStore());
    }
}
