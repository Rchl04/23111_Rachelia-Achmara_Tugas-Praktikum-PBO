/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan4_Overriding;

/**
 *
 * @author Lenovo
 */
public class Balok extends BangunRuang {
    private int panjang, lebar, tinggi;
    
    public Balok(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    @Override
    public int volume(){
      return panjang * lebar * tinggi;  
    }
    
    @Override
    public int luasPermukaan(){
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}
