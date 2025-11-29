/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12_tugas;

import java.io.Serializable;

/**
 *
 * @author Comp HP
 */
public class Buku implements Serializable {
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    
    // Constructor
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
    
    // Method untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("Judul     : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Tahun Terbit : " + tahunTerbit);
    }
}