/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6_tugas;

/**
 *
 * @author Comp HP
 */
public class Main {
    public static void main(String[] args) {
        // Membuat Objek untuk Masing-masing Subclass
        Buku novel = new Buku("Laut Bercerita", 125000);
        Elektronik speaker = new Elektronik("Speaker", 500000);
        Pakaian dress = new Pakaian("Long Dress", 850000);
        
        // Tambah Produk ke KeranjangBelanja
        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(novel);
        keranjang.tambahProduk(speaker);
        keranjang.tambahProduk(dress);
        
        // Menampilkan Informasi Detail Produk yang Dibeli
        keranjang.tampilkanDetailPembelian();
    }
}
