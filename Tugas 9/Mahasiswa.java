/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan9;

/**
 *
 * @author Lenovo
 */
public class Mahasiswa {
    private String NIM, Nama, Alamat, mataKuliah;
    private double nilai1, nilai2, nilai3, nilai4, nilai5;
    private double nilaiAkhir;
    
    public Mahasiswa(String NIM, String Nama, String Alamat, String mataKuliah, double nilai1, double nilai2, double nilai3, double nilai4, double nilai5){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.mataKuliah = mataKuliah;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        this.nilai5 = nilai5;
        hitungNilaiAkhir();
    }

    void hitungNilaiAkhir(){
        this.nilaiAkhir = (0.1 * nilai1) + (0.15 * nilai2) + (0.25 * nilai3) + (0.15 * nilai4) + (0.35 * nilai5);
    }

    public String getNIM(){
        return NIM;
    }

    public String getNama(){
        return Nama;
    }

    public String getAlamat(){
        return Alamat;
    }

    public String getMataKuliah(){
        return mataKuliah;
    }

    public double getNilaiAkhir(){
        return nilaiAkhir;
    }

}
