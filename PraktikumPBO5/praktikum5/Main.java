/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Comp HP
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        System.out.println("=== Informasi Mobil ===");
        mobil.nama = "Honda Civic";
        mobil.kecepatan = 200;
        mobil.jumlahPintu = 4;
        mobil.tampilkanInfo();
        
        SepedaMotor motor = new SepedaMotor();
        System.out.println("=== Informasi Motor ===");
        motor.nama = "Vespa Sprint";
        motor.kecepatan = 98;
        motor.jenisMesin = "4-tak";
        motor.tampilkanInfo();
    }
}
