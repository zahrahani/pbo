/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11_tugas;

/**
 *
 * @author Comp HP
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== SISTEM PERPUSTAKAAN =====");
        // Agregasi: Pengarang bisa tetap eksis tanpa Buku
        // Membuat objek Pengarang
        Pengarang p1 = new Pengarang("Andrea Hirata");
        Pengarang p2 = new Pengarang("Leila S. Chudori");
        Pengarang p3 = new Pengarang("Okky Madasari");
        
        // Membuat objek Buku dan Pengarang
        Buku b1 = new Buku("Laskar Pelangi", p1);
        Buku b2 = new Buku("Laut Bercerita", p2);
        Buku b3 = new Buku("Entrok", p3);
        Buku b4 = new Buku("Pulang", p2); // pengarang sama → bukti agregasi
        
        // Komposisi: Perpustakaan memiliki Buku
        // Membuat objek Perpustakaan
        Perpustakaan perpus = new Perpustakaan();
        
        // Menambahkan Buku ke Perpustakaan
        System.out.println("========= Tambah Buku =========");
        perpus.tambahBuku(b1);
        perpus.tambahBuku(b2);
        perpus.tambahBuku(b3);
        perpus.tambahBuku(b4);
        
        // Menampilkan semua Buku di Perpustakaan
        System.out.println("========= Daftar Buku =========");
        perpus.infoSemuaBuku();
        
        // Menampilkan info Pengarang
        System.out.println("==== Daftar Pengarang Buku ====");
        System.out.println("Agregasi: Pengarang tetap eksis tanpa bergantung pada Buku.");
        System.out.println("1. " + p1.getNamaPengarang());
        System.out.println("2. " + p2.getNamaPengarang());
        System.out.println("3. " + p3.getNamaPengarang());
        
        // Sesi Demo
        System.out.println("=== Demonstrasi ===============");
        // Menghapus Perpustakaan
        System.out.println("WARN: Menghapus Perpustakaan...");
        perpus = null;
        // Informasi semua buku
        System.out.println("Komposisi: Perpustakaan telah dihapus, daftar buku hilang.");
        System.out.println("Tapi, daftar Pengarang masih ada:");
        System.out.println("1. " + p1.getNamaPengarang());
        System.out.println("2. " + p2.getNamaPengarang());
        System.out.println("3. " + p3.getNamaPengarang());
    }
}