/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author Comp HP
 */
// Superclass Abstrak: Kendaraan
abstract class Kendaraan {
    abstract void berjalan();
    
    void info() {
        System.out.println("Ini adalah kendaraan mevvah");
    }    
}

// Subclass: Mobil
class Mobil extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Mobil melaju cepat di jalan raya");
    }
}

// Subclass: Sepeda
class Sepeda extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Sepeda berjalan pelan di jalan kota");
    }
}

// Subclass Tambahan: Kereta
class Kereta extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Kereta melaju super cepat di atas rel");
    }
}