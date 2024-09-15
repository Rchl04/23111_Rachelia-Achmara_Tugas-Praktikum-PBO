/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan3_No1;

/**
 *
 * @author Lenovo
 */
public class MatematikaInheritance {
    public static void main(String[] args){
        Matematika2 mtk = new Matematika2();
        
        int hasilPertambahan = mtk.pertambahan(30, 12);
        System.out.println("Pertambahan : 30 + 12 = " +hasilPertambahan);
        
        int hasilPengurangan = mtk.pengurangan(30, 12);
        System.out.println("Pengurangan : 30 - 12 = " +hasilPengurangan);
        
        int hasilPerkalian = mtk.perkalian(30, 12);
        System.out.println("Perkalian : 30 * 12 = " +hasilPerkalian);
        
        float hasilPembagian = mtk.pembagian(30, 12);
        System.out.println("Pembagian : 30 / 12 = " +hasilPembagian);
        
        int hasilModulo = mtk.modulo(30, 12);
        System.out.println("Modulo : 30 mod 12 = " +hasilModulo);
    }
}
