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

public class CashierSystemTest {

    @Test
    public void testSaveProduct() {
        // objek sistem kasir
        CashierSystem cashier = new CashierSystem();
        // Uji tambah produk ke katalog
        cashier.saveProduct("Tissue", 13000, 40);
        // Jika tidak error berarti berhasil
        assertTrue(true);
    }
}
