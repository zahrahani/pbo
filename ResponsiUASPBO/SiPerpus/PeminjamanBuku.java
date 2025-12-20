/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SiPerpus;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Comp HP
 */
public class PeminjamanBuku implements Serializable {
    private Anggota anggota;
    private List<Buku> daftarBuku;
        
    // Constructor
    public PeminjamanBuku(Anggota anggota, List<Buku> daftarBuku) {
        this.anggota = anggota;
        this.daftarBuku = daftarBuku;
    }
    
    public Anggota getAnggota() {
        return anggota;
    }

    public List<Buku> getDaftarBuku() {
        return daftarBuku;
    }
}