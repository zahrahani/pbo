    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4_tugas;

/**
 *
 * @author Comp HP
 */
public class Pekerja extends Manusia {
    private int gaji; // Atribut tambahan gaji untuk pekerja
    
    // Constructor
    public Pekerja(String nama, int umur, String pekerjaan, int gaji) {
        super(nama, umur, pekerjaan);
        this.gaji = gaji;
    }
    
    // Getter dan Setter untuk atribut gaji
    public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    // Method untuk menampilkan informasi ambil
    @Override
    public String toString() {
        return "Nama      : " + nama + "\n"
                + "Usia      : " + usia + " Tahun\n"
                + "Pekerjaan : " + pekerjaan + "\n"
                + "Gaji      : Rp" + gaji;
    }
}
