/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author Comp HP
 */
public class Main2 {
    public static void main(String[] args) {
        // Objek bagian: member 
        Member m1 = new Member("Bintang", "Striker");
        Member m2 = new Member("Cimi", "Smasher");
        Member m3 = new Member("Jean", "Libero");
        Member m4 = new Member("Jack", "Goalkeeper");
        Member m5 = new Member("Jojo", "Anchor/Bek");
        
        // Objek induk: club
        Club fc = new Club("Football Club");
        Club futsal = new Club("Futsal Club");
        Club voli = new Club("Volleyball Club");
        
        // Tambah member ke club
        fc.addMember(m1);
        fc.addMember(m4);
        futsal.addMember(m1); // member 1 bisa gabung 2 club
        futsal.addMember(m5);
        voli.addMember(m2);
        voli.addMember(m3);
        
        // Menampilkan informasi club
        System.out.println("=== Studi Kasus Agregasi ===");
        System.out.println("====== Informasi Club ======");
        fc.infoClub();
        System.out.println();
        futsal.infoClub();
        System.out.println();
        voli.infoClub();
    }
}