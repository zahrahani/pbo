/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11_tugas;

/**
 *
 * @author Comp HP
 */
public class Buku {
    private String judul;
    private Pengarang pengarang; // Agregasi: Buku memiliki Pengarang
    
    // Constructor
    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }
    
    // Getter
    public String getJudul() {
        return judul;
    }
    
    // Method untuk menampilkan informasi buku
    public void infoBuku() {
        System.out.println("Judul: " + judul);
        pengarang.infoPengarang();
        System.out.println("-------------------------------");
    }
}