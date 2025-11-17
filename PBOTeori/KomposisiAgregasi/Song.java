/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KomposisiAgregasi;

/**
 *
 * @author Comp HP
 */
public class Song {
    private String title;
    private double duration;
    private Musician musician;  // aggregation
    private Lyrics lyrics;      // composition
    
    // Constructor
    public Song(String title, double duration, String lyricsText) {
        this.title = title;
        this.duration = duration;
        // Composition: Song membuat object lyrics-nya sendiri
        this.lyrics = new Lyrics(lyricsText);
    }
    
    // Getter Title, Duration, Lyrics, Musician
    public String getTitle() {
        return title;
    }
    public double getDuration() {
        return duration;
    }
    public Musician getMusician() {
        return musician;
    }
    public Lyrics getLyrics() {
        return lyrics;
    }
    
    // Aggregation: Song dibuat oleh musician
    // note: musician indepently (berdiri sendiri)
    // Method addMusician()
    public void addMusician(Musician musician) {
        this.musician = musician;
    }
    
    // Method Info()
    public void showInfo() {
        System.out.println("Title    : " + title);
        System.out.println("Duration : " + duration);
        if (musician != null) {
            System.out.println("Musician : " + musician.getName() + " (" + musician.getRole() + ")");
        } else {
            System.out.println("Musician : None");
        }
    }
}
