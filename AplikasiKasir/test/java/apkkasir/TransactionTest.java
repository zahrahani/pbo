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

public class TransactionTest {

    @Test
    public void testTransactionData() {
        // Data transaksi
        Transaction transaction = new Transaction("Tissue", 7, 91000);
        // Uji nama produk
        assertEquals("Tissue", transaction.getProductName());
        // Uji jumlah produk
        assertEquals(7, transaction.getQuantity());
        // Uji total harga transaksi
        assertEquals(91000, transaction.getTotalPrice());
    }
    
    @Test
    public void testSaveTransaction() {
        // Data transaksi
        Transaction transaction = new Transaction("Roti", 5, 40000);
        // Menguji nama produk
        assertEquals("Roti", transaction.getProductName());
        // Menguji jumlah produk
        assertEquals(5, transaction.getQuantity());
        // Menguji total harga transaksi
        assertEquals(40000, transaction.getTotalPrice());
    }
}