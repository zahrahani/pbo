/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Comp HP
 */
public class Mobil extends Kendaraan1 {
    private int jumlahPintu; // Atribut tambahan khusus untuk mobil
    
    // Constructor
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin); // Panggil constructor dari class induk
        this.jumlahPintu = jumlahPintu;
    }
    
    // Method untuk memanmpilkan informasi mobil
    public void tampilkanInfoMobil() {
        // Dapat mengakses kecepatanMkas karena protected
        System.out.println("Kecepatan Max. Mobil : " + kecepatanMaks + " km/h");
        System.out.println("Jumlah Pintu         : " + jumlahPintu);
    }
    // Method untuk menampilkan informasi mobil lengkap
    public void tampilkanInfoMobilLengkap() {
        super.tampilkanInfoKendaraan1();     // Panggil method dari class induk
        System.out.println("Jumlah Pintu        : " + jumlahPintu);
    }
}
