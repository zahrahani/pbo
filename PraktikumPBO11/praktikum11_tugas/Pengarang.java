/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11_tugas;

/**
 *
 * @author Comp HP
 */
public class Pengarang {
    private String namaPengarang;
    
    // Constructor
    public Pengarang(String namaPengarang){
        this.namaPengarang = namaPengarang;
    }
    
    // Getter
    public String getNamaPengarang() {
        return namaPengarang;
    }
    
    // Method untuk menampilkan info pengarang
    public void infoPengarang() {
        System.out.println("Pengarang: " + namaPengarang);
    }
}