/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23111_racheliaachmara_praktikum_tugasno2;

/**
 *
 * @author Lenovo
 */
public class Nilai {
   String npm;
   String nama;
   Double nAbsen;
   Double nTugas;
   Double nUTS;
   Double nUAS;
   
    void Nilai(){
        System.out.println("NPM         : "+ this.npm);
        System.out.println("Nama        : "+ this.nama);
        System.out.println("Nilai Absen : "+ this.nAbsen);
        System.out.println("Nilai Tugas : "+ this.nTugas);
        System.out.println("Nilai UTS   : "+ this.nUTS);
        System.out.println("Nilai UAS   : "+ this.nUAS);
    }
    
    Double hitungNilaiAkhir(){ 
        return (0.1 * nAbsen) + (0.2 * nTugas) + (0.3 * nUTS) + (0.4 * nUAS);
    }
    
    void cetakNilai(){
        System.out.println("Nilai akhir : " +this.hitungNilaiAkhir()+ "");
    }
}
