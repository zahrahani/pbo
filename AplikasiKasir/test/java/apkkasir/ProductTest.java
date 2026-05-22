/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apkkasir;

/**
 *
 * @author Comp HP
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void testReduceStock() {
        // Data awal produk
        Product product = new Product("Tissue", 13000, 40);
        // Mengurangi stok sebanyak 7 pcs
        product.reduceStock(7);
        // Mengecek hasil stok akhir
        assertEquals(33, product.getStock());
    }
}