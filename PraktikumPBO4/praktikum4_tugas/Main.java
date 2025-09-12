/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4_tugas;

/**
 *
 * @author Comp HP
 */
public class Main {
    public static void main(String[] args) {
        Pekerja pekerja1 = new Pekerja("Bintang", 20, "Musisi", 50000000);
        
        // Menampilkan informasi pekerja
        System.out.println("-- Informasi Pekerja --");
        System.out.println(pekerja1);
        
        // Mengubah nama pekerja
        pekerja1.setNama("Bintang Saputra");
        
        // Menampilkan ulang informasi pekerja
        System.out.println("-- Update Informasi Pekerja --");
        System.out.println(pekerja1);
        
        // Coba akses langsung atribut nama, usia, dan gaji
        System.out.println("-- Coba Akses Langsung --");
        // a. nama
        System.out.println(pekerja1.nama);
        // b. usia
        System.out.println(pekerja1.usia);
        // c. gaji
        //System.out.println(pekerja1.gaji()); // akan muncul error karena atribut gaji bersifat private
    }
}
