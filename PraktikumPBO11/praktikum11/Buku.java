/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author Comp HP
 */
public class Buku {
    private String judul;
    private String ISBN;
    
    // Constructor
    public Buku(String judul, String ISBN) {
        this.judul = judul;
        this.ISBN = ISBN;
    }
    
    // Method infoBuku() untuk menampilkan informasi buku
    public void infoBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("ISBN : " + ISBN + "\n");
    }
}
