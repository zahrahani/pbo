/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author Comp HP
 */
public class PegawaiKontrak extends Pegawai{
    private int lamaKontrak;
    
    // Constructor
    public PegawaiKontrak(String namaPegawai, double gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    
    // Getter-Setter untuk Atribut tunjangan
    public int getLamaKontrak() {
        return lamaKontrak;
    }
    public void setLamaKontrak(int lamaKontrak) {
        this.lamaKontrak = lamaKontrak;
    }
    
    // Method untuk Menampilkan Informasi Pegawai Tetap
    @Override // Override method tampilkanInfo()
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama Kontrak : " + lamaKontrak + " bulan");
    }
}
