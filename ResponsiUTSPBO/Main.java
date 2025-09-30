/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author Comp HP
 */
public class Main {
    public static void main(String[] args) {
        // Membuat object Produk
        System.out.println("======= Daftar Produk =======");
        System.out.println("Produk 01 -------------------");
        Produk laptop = new Produk("Laptop", 15000000);
        laptop.tampilkanInfo();
        System.out.println("Produk 02 -------------------");
        Produk hp = new Produk("Smartphone", 7000000);
        hp.tampilkanInfo();
        
        // Membuat object Pegawai
        System.out.println("\n======= Data Pegawai =======");
        System.out.println("Pegawai 01 -----------------");
        Pegawai p1 = new Pegawai("Hani", 5000000);
        p1.tampilkanInfo();
        System.out.println("Pegawai 02 -----------------");
        Pegawai p2 = new Pegawai("Nibras", 7500000);
        p2.tampilkanInfo();
    }
}
