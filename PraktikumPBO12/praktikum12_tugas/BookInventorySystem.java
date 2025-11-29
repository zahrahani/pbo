/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12_tugas;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Comp HP
 */
public class BookInventorySystem {
    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    private static List<Buku> bukuList = new ArrayList<>();
    
    public static void main(String[] args) {
        // Membuat objek Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Loop Alur Program
        while (true) {
            System.out.println("================ Menu ================");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Simpan ke File Teks buku.txt");
            System.out.println("3. Simpan Objek ke File buku.ser");
            System.out.println("4. Tampilkan Daftar Buku");
            System.out.println("5. Keluar");
            System.out.println("Pilihan: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline
            
            switch (pilihan) {
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanKeFileTeks();
                case 3 -> simpanKeFileSerial();
                case 4 -> tampilkanBuku();
                case 5 -> {
                    System.out.println("--------- Keluar dari sistem ---------");
                    scanner.close();
                    return;
                }
                default -> {
                    System.out.println("Pilihan tidak valid!");
                    System.out.println("Pilih antara 1 sampai 5!");
                }
            }
        }
    }
    
    private static void tambahBuku(Scanner scanner) {
        System.out.println("Masukkan judul buku : ");
        String judul = scanner.nextLine();
        System.out.println("Masukkan pengarang : ");
        String pengarang = scanner.nextLine();
        System.out.println("Masukkan tahun terbit : ");
        int tahunTerbit = scanner.nextInt();
        
        bukuList.add(new Buku(judul, pengarang, tahunTerbit));
        System.out.println("Buku berhasil ditambahkan!");
    }
    
    private static void simpanKeFileTeks() {
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            for (Buku buku : bukuList) {
                writer.write(buku.toString() + "\n");
            }
            System.out.println("Data buku berhasil disimpan ke file buku.txt!");
        }
        catch (IOException e){
            System.out.println("Terjadi kesalahan saat menyimpan data ke file buku.txt!");
            e.printStackTrace();
        }
    }
    
    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(bukuList);
            System.out.println("Objek buku berhasil disimpan ke file serial buku.ser!");
        }
        catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan objek ke file serial buku.ser!");
            e.printStackTrace();
        }
    }
    
    private static void tampilkanBuku() {
        System.out.println("------------ Daftar Buku: ------------");
        for (Buku buku : bukuList) {
            buku.tampilkanInfo();
        }
    }
}