/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author Comp HP
 */
public class Elektronik extends Produk{
    private int garansi;
    
    // Constructor
    public Elektronik(String namaProduk, double harga, int garansi) {
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    
    // Getter-Setter untuk Atribut garansi
    public int getGaransi() {
        return garansi;
    }
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }
    
    // Method untuk Menampilkan Informasi Produk Elektronik
    @Override     // Override method tampilkanInfo()
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi     : " + garansi + " tahun");
    }
}
