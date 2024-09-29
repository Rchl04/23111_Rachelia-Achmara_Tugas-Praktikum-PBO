/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan5_No2;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Diskon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input total pembelian: Rp ");
        double totalPembelian = input.nextDouble();
        
        double diskon = 0;
        
            if(totalPembelian < 50000){
                diskon = 0.05 * totalPembelian;
            }
            else if(totalPembelian >=50000){
                diskon = 0.2 * totalPembelian;
            }
        double totalBayar = totalPembelian - diskon;
        
        System.out.println("\n============================================");
        System.out.println("Total pembelian = Rp " +totalPembelian);
        System.out.println("Potongan harga (Diskon) = Rp " +diskon);
        System.out.println("Jumlah yang harus dibayarkan = Rp " +totalBayar);
            
    }
}
