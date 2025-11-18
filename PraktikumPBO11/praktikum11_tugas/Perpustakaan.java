/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11_tugas;

/**
 *
 * @author Comp HP
 */
import java.util.List;
import java.util.ArrayList;

public class Perpustakaan {
    private List<Buku> daftarBuku;
    
    // Constructor
    public Perpustakaan() {
        this.daftarBuku = new ArrayList<>();
    }

    // Komposisi: Perpustakaan memiliki Buku
    // Method untuk menambah buku
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("Buku " + buku.getJudul() + " berhasil ditambahkan.");
    }
    // Method untuk mengelola daftar buku dan menampilkan semua buku
    public void infoSemuaBuku() {
        for (Buku buku : daftarBuku) {
            buku.infoBuku();
        }
    }
}