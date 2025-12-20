/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SiPerpus;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Comp HP
 */
public class Perpustakaan implements Serializable {
    
    // Agregasi
    List<Buku> daftarBuku = new ArrayList<>();
    List<Anggota> daftarAnggota = new ArrayList<>();
    List<Peminjaman> daftarPeminjaman = new ArrayList<>();
    
    // Method untuk menambah anggota perpustakaan
    public void tambahAnggota(Anggota a) {
        daftarAnggota.add(a);
    }
    
    // Method untuk menyimpan data 
    public void simpanData(String file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(this);
        } 
        catch (IOException e) {
            System.out.println("Gagal menyimpan data: " + e.getMessage());
        }
    }
    
    // Method untuk membaca data
    public static Perpustakaan bacaData(String file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (Perpustakaan) ois.readObject();
        } 
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Gagal membaca data: " + e.getMessage());
            return new Perpustakaan();
        }
    }
}
