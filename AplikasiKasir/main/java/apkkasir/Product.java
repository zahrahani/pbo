/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apkkasir;

/**
 *
 * @author Comp HP
 */
// Class untuk menyimpan data product
class Product {
    private String name;
    private int price;
    private int stock;
    
    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
    
    // Fungsi untuk mengurangi jumlah stok barang yang ada
    // sebanyak jumlah barang yang dibeli (quantity)
    public void reduceStock(int quantity) {
        stock -= quantity;
    }
}
