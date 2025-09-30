/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author Comp HP
 */
public class Makanan extends Produk {
    private String tanggalKadaluarsa;
    
    // Constructor
    public Makanan(String namaProduk, int harga, String tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    // Getter-Setter untuk Atribut garansi
    public String getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }
    public void setTanggalKadaluarsa(String tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    // Method untuk Menampilkan Informasi Produk Makanan
    @Override     // Override method tampilkanInfo()
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Exp         : " + tanggalKadaluarsa);
    }
}
