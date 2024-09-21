/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan4_Overloading;

/**
 *
 * @author Lenovo
 */
public class BangunRuang {
    
    public int volume(int panjang, int lebar, int tinggi){
        return panjang * lebar * tinggi;
    }
    
    public int volume(int sisi){
        return sisi * sisi * sisi;
    }
    
    public int luasPermukaan(int panjang, int lebar, int tinggi){
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
    
    public int luasPermukaan(int sisi){
        return 6 * sisi * sisi;
    }
}
