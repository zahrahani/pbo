/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6_tugas;

/**
 *
 * @author Comp HP
 */
import java.util.ArrayList;
import java.util.List;

class KeranjangBelanja {
    private List<Produk> ListProduk;    // untuk menyimpan kumpulan objek Produk
    
    // Constructor
    public KeranjangBelanja () {
        ListProduk = new ArrayList<>();
    }
    // Method untuk Menambahkan Produk ke Dalam ListProduk
    public void tambahProduk(Produk produk) {
        ListProduk.add(produk);
    }
    // Method untuk Menampilkan Detail Pembelian Produk beserta Diskonnya
    public void tampilkanDetailPembelian() {
        double totalHargaSebelumDiskon = 0;
        double totalHargaSesudahDiskon = 0;
        System.out.println("===== Detail Pembelian Produk =====");
        
        for (Produk produk : ListProduk) {
            double diskon = produk.hitungDiskon();
            double hargaSesudahDiskon = produk.getHarga() - diskon;
            
            System.out.println("Nama Produk  : " + produk.getNama());
            System.out.println("Harga        : Rp" + produk.getHarga());
            System.out.println("Diskon       : Rp" + diskon);
            System.out.println("Harga Diskon : Rp" + hargaSesudahDiskon);
            System.out.println("-----------------------------------");
            
            totalHargaSebelumDiskon += produk.getHarga();
            totalHargaSesudahDiskon += hargaSesudahDiskon;
        }
        System.out.println("----------- Total Harga -----------");
        System.out.println("Sebelum Diskon : Rp" + totalHargaSebelumDiskon);
        System.out.println("Sesudah Diskon : Rp" + totalHargaSesudahDiskon);
    }
}
