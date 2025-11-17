/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KomposisiAgregasi;

/**
 *
 * @author Comp HP
 */
public class Main {
    public static void main(String[] args) {
        // Object musisi
        Musician m = new Musician("Green Day", "Band");
        
        // Object song
        Song s = new Song(
                "Last Night on Earth",
                3.56,
                "I'm here to honour you\nIf I lose everythings in the fire\nI'm sending all my love to you"
        );
        
        // Aggregation: menambahkan Musician(m)
        s.addMusician(m);
        
        // Menampilkan info
        System.out.println("========== Song Information ==========");
        s.showInfo();
        System.out.println();
        s.getLyrics().showLyrics();
    }
}
