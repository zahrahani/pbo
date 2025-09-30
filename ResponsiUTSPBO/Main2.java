/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author Comp HP
 */
public class Main2 {
    public static void main(String[] args) {
        // Polimorfisme untuk Produk
        // Membuat Objek untuk Masing-masing Subclass dari Class Produk
        System.out.println("======= Daftar Produk =======");
        // Membuat Objek Subclass Produk: Elektronik
        System.out.println("Produk 01 -------------------");
        Produk produk1 = new Elektronik("Smart TV", 2500000, 2);
        produk1.tampilkanInfo();
        // Membuat Objek Subclass Produk: Makanan
        System.out.println("Produk 02 -------------------");
        Produk produk2 = new Makanan("Cokelat", 55000, "2026/10/30");
        produk2.tampilkanInfo();
        
        // Polimorfisme untuk Pegawai
        // Membuat Objek untuk Masing-masing Subclass dari Class Pegawai
        System.out.println("\n======= Data Pegawai =======");
        // Membuat Objek Subclass Pegawai: PegawaiTetap
        System.out.println("Pegawai 01 -----------------");
        Pegawai p1 = new PegawaiTetap("Nibras", 7500000, 3000000);
        p1.tampilkanInfo();
        // Membuat Objek Subclass Pegawai: PegawaiKontrak
        System.out.println("Pegawai 02 -----------------");
        Pegawai p2 = new PegawaiKontrak("Siti", 4000000, 12);
        p2.tampilkanInfo();
    }
}
