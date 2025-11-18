/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author Comp HP
 */
public class Member {
    private String name;
    private String role;
     
    // Connstructor
    public Member(String name, String role) {
        this.name = name;
        this.role = role;
    }
    
    // Method
    public void infoMember() {
        System.out.println("- " + name + "(" + role + ")");
    }
}