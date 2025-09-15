/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5_tugas;

/**
 *
 * @author Comp HP
 */
public class Main {
    public static void main(String[] args) {
        Kucing kucingku = new Kucing();
        System.out.println("=== Informasi Kucing ===");
        kucingku.nama = "Cimi";
        kucingku.jenis = "DSH";
        kucingku.suara = "Miaw~";
        kucingku.habitat = "Rumah (Indoor/Outdoor)";
        kucingku.tampilkanInfo();
        
        Anjing anjingku = new Anjing();
        System.out.println("=== Informasi Anjing ===");
        anjingku.nama = "Bruno";
        anjingku.jenis = "Golden Retriever";
        anjingku.suara = "Woof woof";
        anjingku.habitat = "Halaman berumput";
        anjingku.tampilkanInfo();
    }
}
