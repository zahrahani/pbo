/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SiPerpus;

import java.io.Serializable;

/**
 *
 * @author Comp HP
 */
public abstract class KoleksiBuku implements Serializable {
    protected String id;
    protected String judul;
    protected boolean dipinjam = false;
    
    // Constructor
    public KoleksiBuku(String id, String judul) {
        this.id = id;
        this.judul = judul;
    }
    
    // Method Abstract getInfo()
    public abstract String getInfo();
    
    // Method-method
    public String getId() {
        return id;
    }
    
    public boolean isDipinjam() {
        return dipinjam;
    }
    
    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }
}
