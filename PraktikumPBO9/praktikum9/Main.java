/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author Comp HP
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Object 1 =============================");
        Kendaraan mobil = new Mobil();
        mobil.berjalan();
        mobil.info();
        
        System.out.println("Object 2 =============================");
        Kendaraan sepeda = new Sepeda();
        sepeda.berjalan();
        sepeda.info();
        
        System.out.println("Object 3 =============================");
        Kendaraan motor = new Sepeda();
        motor.berjalan();
        motor.info();
        
        System.out.println("Object 4 =============================");
        Kendaraan kereta = new Kereta();
        kereta.berjalan();
        kereta.info();
    } 
}