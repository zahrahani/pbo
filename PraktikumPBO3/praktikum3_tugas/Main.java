/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3_tugas;

/**
 *
 * @author Comp HP
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobilhani_1 = new Mobil("Nissan", "Skyline R34 GT-R", 2000, "Silver");
        Mobil mobilhani_2 = new Mobil("BMW", "323i E30 Coupe", 1983, "Putih");
        
        mobilhani_1.displayinfo();
        mobilhani_1.setWarna("Putih");
        mobilhani_1.displayinfo();
        
        mobilhani_2.displayinfo();
        mobilhani_2.setWarna("Hitam");
        mobilhani_2.displayinfo();
        
        mobilhani_1.startEngine();
        mobilhani_2.startEngine();
    }
}
