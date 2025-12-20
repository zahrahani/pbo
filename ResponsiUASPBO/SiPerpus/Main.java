/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SiPerpus;

import java.util.*;

/**
 *
 * @author Comp HP
 */
public class Main {
    static Scanner input = new Scanner(System.in);
    static Perpustakaan perpus = Perpustakaan.bacaData("data.dat");
    
    public static void main(String[] args) {
        int pilihan;
        
        do {
            System.out.println("\n===== PERPUSTAKAAN DIGITAL =====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Daftar Buku");
            System.out.println("3. Tambah Anggota");
            System.out.println("4. Lihat Daftar Anggota");
            System.out.println("5. Pinjam Buku");
            System.out.println("6. Kembalikan Buku");
            System.out.println("7. Simpan");
            System.out.println("8. Keluar");
            System.out.println("--------------------------------");
            System.out.print("Pilih: ");

            try {
                pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {
                    case 1 -> tambahBuku();
                    case 2 -> lihatDaftarBuku();
                    case 3 -> tambahAnggota();
                    case 4 -> lihatDaftarAnggota();
                    case 5 -> pinjamBuku();
                    case 6 -> kembalikanBuku();
                    case 7 -> simpanData();
                    case 8 -> keluarProgram();
                    default -> System.out.println("ERROR: Pilihan tidak valid!\nPilih angka dalam rentang 1-8");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Input harus angka!");
                input.nextLine();
                pilihan = 0;
            }
        } while (pilihan != 8);
    }

    static void tambahBuku() {
        System.out.println("-------- Input Data Buku -------");
        System.out.print("ID      : ");
        String id = input.nextLine();
        System.out.print("Judul   : ");
        String judul = input.nextLine();
        System.out.print("Penulis : ");
        String penulis = input.nextLine();
        
        perpus.daftarBuku.add(new Buku(id, judul, penulis));
        
        System.out.println("   Buku berhasil ditambahkan!   ");
        System.out.println("================================");
    }
    
    static void lihatDaftarBuku() {
        System.out.println("--------- Daftar Buku: ---------");
        System.out.println("(ID | Judul | Penulis | Status)");
        if (perpus.daftarBuku.isEmpty()) {
            System.out.println("         Belum ada buku         ");
            System.out.println("================================");
            return;
        } 
        for (Buku b : perpus.daftarBuku) {
            System.out.println(b.getInfo());
        }
    }

    static void tambahAnggota() {
        System.out.print("ID Anggota : ");
        String id = input.nextLine();
        System.out.print("Nama       : ");
        String nama = input.nextLine();

        perpus.daftarAnggota.add(new Anggota(id, nama));
        
        System.out.println("  Anggota berhasil ditambahkan  ");
        System.out.println("================================");
    }
    
    static void lihatDaftarAnggota() {
        System.out.println("-------- Daftar Anggota --------");
        if (perpus.daftarAnggota.isEmpty()) {
            System.out.println("Belum ada anggota yang terdaftar");
            System.out.println("================================");
            return;
        }
        for (Anggota a : perpus.daftarAnggota) {
            System.out.println(a.getId() + " - " + a.getNama());
        }
    }


    static void pinjamBuku() {
        System.out.println("--------------------------------");
        System.out.print("ID Anggota : ");
        String idAnggota = input.nextLine();

        Anggota peminjam = null;
        for (Anggota a : perpus.daftarAnggota) {
            if (a.getId().equals(idAnggota)) {
                peminjam = a;
                break;
            }
        }

        if (peminjam == null) {
            System.out.println("    Anggota tidak ditemukan    ");
            return;
        }
        
        System.out.print("ID Buku : ");
        String idBuku = input.nextLine();

        for (Buku b : perpus.daftarBuku) {
            if (b.getId().equals(idBuku) && !b.isDipinjam()) {
                b.setPeminjam(peminjam);
                System.out.println("     Buku berhasil dipinjam     ");
                System.out.println("================================");
                return;
            }
        }
        System.out.println("      Buku tidak tersedia!      ");
        System.out.println("================================");
    }

    static void kembalikanBuku() {
        System.out.println("--------------------------------");
        System.out.print("ID Buku : ");
        String idBuku = input.nextLine();

        for (Buku b : perpus.daftarBuku) {
            if (b.getId().equals(idBuku) && b.isDipinjam()) {
                b.setPeminjam(null);
                System.out.println("   Buku berhasil dikembalikan   ");
                System.out.println("================================");
                return;
            }
        }
        System.out.println("       Pengembalian Gagal       ");
        System.out.println("================================");
    }
    
    static void simpanData() {
        System.out.println("--------------------------------");
        perpus.simpanData("data.dat");
        System.out.println("     Data berhasil disimpan     ");
        System.out.println("================================");
    }

    static void keluarProgram() {
        System.out.println("--------------------------------");
        System.out.println("Keluar tanpa menyimpan data?");
        System.out.print("(y/n): ");
        String jawab = input.nextLine();

        if (jawab.equalsIgnoreCase("n")) {
            perpus.simpanData("data.dat");
            System.out.println("     Data berhasil disimpan     ");
            System.out.println("    Anda keluar dari program    ");
            System.out.println("================================");
        } else {
            System.out.println("    Anda keluar dari program    ");
            System.out.println("      tanpa menyimpan data      ");
            System.out.println("================================");
        } 
    }
}
