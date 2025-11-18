/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author Comp HP
 */
import java.util.List;
import java.util.ArrayList;

public class Perpustakaan {
    private List<Buku> bukuList;
    
    // Constructor
    public Perpustakaan() {
        this.bukuList = new ArrayList<>();
    }

    // Method untuk menambah buku
    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }
    // Method untuk mengelola daftar buku dan menampilkan informasi perpustakan
    public void infoPerpustakaan() {
        for (Buku buku : bukuList) {
            buku.infoBuku();
        }
    }
}