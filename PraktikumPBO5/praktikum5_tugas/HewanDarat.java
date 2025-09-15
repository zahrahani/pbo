/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5_tugas;

/**
 *
 * @author Comp HP
 */
public class HewanDarat extends Hewan{
   String habitat;
   
   // Method untuk Menampilkan Informasi Habitat Hewan Darat
   @Override
   public void tampilkanInfo() {
       super.tampilkanInfo();
       System.out.println("Habitat : " + habitat);
   }
}
