/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan4_Overloading;

/**
 *
 * @author Lenovo
 */
public class BangunRuangDemo {
    public static void main (String[] args){
        BangunRuang br = new BangunRuang();
        
        int pBalok = 14, lBalok = 9, tBalok = 11;
        System.out.println("Panjang Balok = " + pBalok + " cm");
        System.out.println("Lebar Balok = " + lBalok + " cm"); 
        System.out.println("Tinggi Balok = " + tBalok + " cm"); 
        System.out.println("Volume Balok = " + br.volume(pBalok, lBalok, tBalok) + " cm^3"); 
        System.out.println("Luas Permukaan Balok = " + br.luasPermukaan(pBalok, lBalok, tBalok)+ " cm^2" );
        
        System.out.println();
                
        int sKubus = 5;
        System.out.println("Panjang Sisi Kubus= " + sKubus + " cm");
        System.out.println("Volume Kubus= " + br.volume(sKubus) + " cm^3");
        System.out.println("Luas Permukaan Kubus= " + br.luasPermukaan(sKubus) + " cm^2");
    }
}