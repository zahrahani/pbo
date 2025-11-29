/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12;

import java.io.Serializable;

/**
 *
 * @author Comp HP
 */
public class Produk implements Serializable {
    private String namaProduk;
    private double harga;
    private int stok;
    
    // Constructor
    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }
    
    // Method untuk menampilkan informasi produk
    public void tampilkanInfo() {
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga : Rp" + harga);
        System.out.println("Stok  : " + stok);
    }
}
