/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10_tugas;

/**
 *
 * @author Comp HP
 */
public class Main {
    public static void main(String[] args) {
        Elektronik laptop = new Elektronik();
        double hargaLaptop = 9000000;
        double pajakLaptop = laptop.hitungPajak(hargaLaptop);
        double subtotalLaptop = hargaLaptop + pajakLaptop;
        
        Makanan roti = new Makanan();
        double hargaRoti = 18000;
        double pajakRoti = roti.hitungPajak(hargaRoti);
        double subtotalRoti = hargaRoti + pajakRoti;
        
        double totalBayar = subtotalLaptop + subtotalRoti;
        
        System.out.println("==== SISTEM PEMBAYARAN ====");
        System.out.println("======== NOYA SHOP ========");
        System.out.println("Laptop");
        System.out.println("Harga       : Rp" + hargaLaptop);
        System.out.println("Pajak (10%) : Rp" + pajakLaptop);
        System.out.println("Subtotal    : Rp" + subtotalLaptop);
        System.out.println();
        System.out.println("Roti");
        System.out.println("Harga       : Rp" + hargaRoti);
        System.out.println("Pajak (5%)  : Rp" + pajakRoti);
        System.out.println("Subtotal    : Rp" + subtotalRoti);
        System.out.println();
        System.out.print("Total Bayar   : Rp" + totalBayar);
    }
}
