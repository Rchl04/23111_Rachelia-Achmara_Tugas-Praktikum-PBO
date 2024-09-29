/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan5_No3;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class IMT {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Silahkan Input Data Berikut: \n");
        System.out.print("Berat badan(kg) : ");
        double beratBadan = input.nextDouble();
        
        System.out.print("Tinggi Badan(m) : ");
        double tinggiBadan = input.nextDouble();
        
        double nilaiIMT = beratBadan / (tinggiBadan * tinggiBadan);
        
        System.out.println("\n====================================================");
        System.out.println("Hasil Indeks Masa Tubuh (IMT) Anda adalah : " +nilaiIMT);
        
        String kategori = " ";
            if(nilaiIMT <= 18.4){
                kategori = "Berat Badan Kurang";
            }
            else if(nilaiIMT >= 18.5 && nilaiIMT <= 24.9){
                kategori = "Berat Badan Ideal";    
            }
            else if(nilaiIMT >= 25 && nilaiIMT <= 29.9){
                kategori = "Berat Badan Lebih";
            }
            else if(nilaiIMT >=30 && nilaiIMT <= 39.9){
                kategori = "Gemuk";
            }
            else if(nilaiIMT >=40){
                kategori = "Sangat gemuk";
            }
            else{
                kategori = "Berat Badan Tidak Normal";
            }
            
        System.out.println("Kategori : " +kategori);
        
    } 
}
