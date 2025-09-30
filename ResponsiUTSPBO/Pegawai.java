/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author Comp HP
 */
public class Pegawai {
    private String namaPegawai;
    private double gaji;
    
    // Constructor
    public Pegawai(String namaPegawai, double gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    //Getter-Setter untuk Atribut namaPegawai dan gaji
    public String getNamaPegawai() {
        return namaPegawai;
    }
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    // Method untuk menampilkan informasi pegawai
    public void tampilkanInfo() {        
        System.out.println("Nama Pegawai : " + namaPegawai);
        System.out.println("Gaji         : Rp" + gaji);
    }
}
