/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SiPerpus;

/**
 *
 * @author Comp HP
 */
public class Buku extends KoleksiBuku {
    private String penulis;
    private Anggota peminjam;
    
    // Constructor
    public Buku (String id, String judul, String penulis) {
        super(id, judul);
        this.penulis = penulis;
    }
    
    // Method untuk mengecek status buku (dipinjam/tersedia)
    public boolean isDipinjam() {
        return peminjam != null;
    }
    
    // Getter Setter peminjam buku
    public void setPeminjam(Anggota peminjam) {
        this.peminjam = peminjam;
    }
    
    public Anggota getPeminjam() {
        return peminjam;
    }
    
    @Override
    public String getInfo() {
        if (isDipinjam()) {
            return id + " | " + judul + " | " + penulis + " | Dipinjam oleh: " + peminjam.getNama();
        }
        return id + " | " + judul + " | " + penulis + " | Tersedia";
    }
}
