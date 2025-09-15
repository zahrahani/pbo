/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5_tugas;

/**
 *
 * @author Comp HP
 */
public class Kucing extends HewanDarat {
    String suara;
    
    // Method untuk Menampilkan Informasi Kucing
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara : " + suara);
    }
}
