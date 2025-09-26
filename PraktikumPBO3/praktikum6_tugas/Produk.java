/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6_tugas;

/**
 *
 * @author Comp HP
 */
abstract class Produk {
    protected String nama;
    protected double harga;
    
    // Constructor
    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    //  Getter untuk Atribut nama dan harga
    public String getNama() {
        return nama;
    }
    public double getHarga() {
        return harga;
    }
    // Method untuk menghitung diskon
    public abstract double hitungDiskon();
}
