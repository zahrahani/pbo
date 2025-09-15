/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Comp HP
 */
public class Mobil extends Kendaraan {
    int jumlahPintu;
    
    // Method untuk Menampilkan Informasi Mobil 
    @Override       // Override Method tampilkanInfo()
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu : " + jumlahPintu);
    }
}
