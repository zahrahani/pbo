/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author Comp HP
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Coki", 3);
        kucing.suara();
        kucing.info();
        Hewan anjing = new Hewan("Choco", 5);
        anjing.berlari();
    }
}
