/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KomposisiAgregasi;

/**
 *
 * @author Comp HP
 */
public class Musician {
    private String name;
    private String role;
    
    // Constructor
    public Musician(String name, String role) {
        this.name = name;
        this.role = role;
    }
    
    // Getter Name & Role
    public String getName() {
        return name;
    }
    public String getRole() {
        return role;
    }
}
