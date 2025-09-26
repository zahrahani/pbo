/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author Comp HP
 */
public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Kucing();
        hewan.bersuara();
        
        Kucing kucing = new Kucing();
        kucing.makan("ikan");     // Panggil method makan() dari class Hewan
        kucing.makan("ikan", 2);  // Panggil method makan() yang di-overloading
        
        Anjing anjing = new Anjing();
        anjing.bersuara();
        anjing.makan("daging", 3); // Panggil method makan() yang di-overloading
    }
}