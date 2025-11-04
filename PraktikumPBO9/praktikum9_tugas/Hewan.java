/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9_tugas;

/**
 *
 * @author Comp HP
 */
// Superclass Abstrak: Hewan
abstract class Hewan {
    abstract void suara();
}

// Subclass: Kucing
class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Kucingku bersuara 'Miawww'");
    }
}

// Subclass: Anjing
class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("'Guk guk guk' itu suara Heli, anjingku");
    }
}