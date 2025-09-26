/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6_tugas;

/**
 *
 * @author Comp HP
 */
class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }
    @Override
    public double hitungDiskon() {
        return this.harga * 0.10;
    }
}
