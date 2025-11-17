/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KomposisiAgregasi;

/**
 *
 * @author Comp HP
 */
public class Lyrics {
    private String text;
    
    // Constructor
    public Lyrics(String text) {
        this.text = text;
    }
    
    // Getter text
    public String getText() {
        return text;
    }
    
    // Method showLyrics()
    public void showLyrics() {
        System.out.print("Lyrics:\n" + text);
    }
}
