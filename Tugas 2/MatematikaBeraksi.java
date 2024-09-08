/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan2_No1;

/**
 *
 * @author Lenovo
 */
public class MatematikaBeraksi {
    public static void main(String[] args){
        Matematika matematika = new Matematika();
        
        int hasilPertambahan = matematika.pertambahan(20, 10);
        System.out.println("Pertambahan: 20 + 10 = "+ hasilPertambahan);
        
        int hasilPengurangan = matematika.pengurangan(10, 5);
        System.out.println("Pengurangan: 10 - 5 = "+ hasilPengurangan);
        
        int hasilPerkalian = matematika.perkalian(10, 3);
        System.out.println("Perkalian: 10 * 3 = "+ hasilPerkalian);
        
        float hasilPembagian = matematika.pembagian(21, 2);
        System.out.println("Pembagian: 21 / 2 = "+ hasilPembagian);
    }
}
