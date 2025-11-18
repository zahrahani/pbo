/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author Comp HP
 */
public class Main {
    public static void main(String[] args) {
        Perpustakaan p = new Perpustakaan();
        
        Buku b1 = new Buku("Laut Bercerita", "9786024246945");
        Buku b2 = new Buku("Laskar Pelangi", "9786022916628");
        Buku b3 = new Buku("Cinta Brontosaurus", "9789797808969");
        
        p.tambahBuku(b1);
        p.tambahBuku(b2);
        p.tambahBuku(b3);
        
        System.out.println("====== Studi Kasus: Komposisi ======");
        System.out.println("====== Informasi Perpustakaan ======");
        p.infoPerpustakaan();
   }
}