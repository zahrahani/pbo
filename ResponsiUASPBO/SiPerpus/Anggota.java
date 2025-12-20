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
public class Anggota implements Serializable {
    private String id;
    private String nama;
    
    // Constructor
    public Anggota(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }
    
    // Getter
    public String getId() {
        return id;
    }
    
    public String getNama() {
        return nama;
    }
}
