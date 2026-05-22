/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apkkasir;

/**
 *
 * @author Comp HP
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// Class untuk mengatur seluruh fitur aplikasi kasir
class CashierSystem {
    // Menyimpan katalog produk
    private HashMap<String, Product> productCatalog = new HashMap<>();
    
    // Menyimpan history transaksi
    private ArrayList<Transaction> salesHistory = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    
    // Fungsi untuk menambahkan produk baru
    public void addProduct() {
        System.out.println("\n======== TAMBAH PRODUK =======");
        
        System.out.print("Nama produk : ");
        String productName = input.nextLine();

        if (productCatalog.containsKey(productName)) {
            System.out.println("Produk sudah tersedia.");
            return;
        }

        try {
            System.out.print("Harga produk : ");
            int productPrice = Integer.parseInt(input.nextLine());

            System.out.print("Jumlah stok : ");
            int productStock = Integer.parseInt(input.nextLine());

            if (productPrice < 0 || productStock < 0) {
                System.out.println("Harga dan stok tidak boleh negatif.");
                return;
            }

            saveProduct(productName, productPrice, productStock);
            
            System.out.println("Produk berhasil ditambahkan.");

        } catch (NumberFormatException error) {
            System.out.println("Input harus berupa angka.");
        }
    }
    
    // Fungsi Catalog untuk menyimpan daftar produk beserta harga dan stok
    public void saveProduct(String productName, int productPrice, int productStock) {
        Product newProduct = new Product(productName, productPrice, productStock);
        productCatalog.put(productName, newProduct);
    }
    
    // Menampilkan seluruh produk
    public void showProducts() {
        System.out.println("\n======== DAFTAR PRODUK =======");

        if (productCatalog.isEmpty()) {
            System.out.println("Belum ada produk.");
            return;
        }
    
        System.out.println("==============================");
        System.out.printf("%-12s %-10s %-5s\n", "Produk", "Harga", "Stok");
        System.out.println("==============================");

        for (Product product : productCatalog.values()) {
            System.out.printf("%-12s Rp%-8d %-5d\n", product.getName(), product.getPrice(), product.getStock());
        }

        System.out.println("==============================");
    }
    
    // Fungsi transaksi penjualan
    public void processSale() {
        System.out.println("\n==== TRANSAKSI PENJUALAN =====");
        showProducts();

        if (productCatalog.isEmpty()) {
            return;
        }

        System.out.print("Nama produk yang dibeli : ");
        String productName = input.nextLine();

        // Validasi produk
        if (!productCatalog.containsKey(productName)) {
            System.out.println("Produk tidak ditemukan.");
            return;
        }
        
        try {
            System.out.print("Jumlah beli : ");
            int quantitySold = Integer.parseInt(input.nextLine());

            if (quantitySold <= 0) {
                System.out.println("Jumlah beli harus lebih dari 0.");
                return;
            }

            Product selectedProduct = productCatalog.get(productName);

            // Validasi stok
            if (quantitySold > selectedProduct.getStock()) {
                System.out.println("Stok tidak mencukupi.");
                return;
            }
            
            int totalPrice = selectedProduct.getPrice() * quantitySold;

            // Mengurangi stok
            selectedProduct.reduceStock(quantitySold);

            // Menyimpan histori transaksi
            saveTransaction(productName, quantitySold, totalPrice);

            System.out.println("Transaksi berhasil.");
            System.out.println("Total bayar : Rp" + totalPrice);

        } catch (NumberFormatException error) {
            System.out.println("Input harus berupa angka.");
        }
    }
    
    // Fungsi untuk menyimpan history transaksi
    public void saveTransaction(String productName, int quantitySold, int totalPrice) {
        Transaction transaction = new Transaction(productName, quantitySold, totalPrice);
        salesHistory.add(transaction);
    }
    
    // Fungsi untuk menampilkan laporan penjualan harian
    public void showDailyReport() {
        System.out.println("\n===== LAPORAN PENJUALAN HARIAN =====");

        if (salesHistory.isEmpty()) {
            System.out.println("Belum ada transaksi hari ini.");
            return;
        }

        int totalIncome = 0;
        
        System.out.println("====================================");
        System.out.printf("%-12s %-8s %-10s\n", "Produk", "Jumlah", "Total");
        System.out.println("====================================");
        
        for (Transaction transaction : salesHistory) {
            System.out.printf("%-12s %-8d Rp%-7d\n", transaction.getProductName(), transaction.getQuantity(), transaction.getTotalPrice());
            totalIncome += transaction.getTotalPrice();
        }

        System.out.println("\n========= SISA STOK ==========");

        System.out.println("==============================");
        System.out.printf("%-15s %-10s\n", "Nama", "Stok");
        System.out.println("==============================");

        for (Product product : productCatalog.values()) {
            System.out.printf("%-15s %-10d\n", product.getName(), product.getStock());
        }

        System.out.println("==============================");

        System.out.println("\nTOTAL PEMASUKAN : Rp" + totalIncome);
    }
    
    // Fungsi untuk menampilkan menu utama
    public void showMenu() {
        System.out.println("\n==============================");
        System.out.println("APLIKASI KASIR RITEL SEDERHANA");
        System.out.println("==============================");
        System.out.println("1. Tambah Produk");
        System.out.println("2. Lihat Produk");
        System.out.println("3. Transaksi Penjualan");
        System.out.println("4. Laporan Penjualan Harian");
        System.out.println("5. Keluar");

        System.out.print("Pilih menu : ");
        String choice = input.nextLine();

        switch (choice) {
            case "1":
                addProduct();
                break;
            case "2":
                showProducts();
                break;
            case "3":
                processSale();
                break;
            case "4":
                showDailyReport();
                break;
            case "5":  
                System.out.println("Program selesai.");
                System.exit(0);
                break;
            default:
                System.out.println("Menu tidak tersedia.");
        }
    }
}