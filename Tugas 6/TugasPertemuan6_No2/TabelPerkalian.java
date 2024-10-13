/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan6_No2;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class TabelPerkalian {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan nilai n (maksimum 10): ");
        int n = input.nextInt(); // Membaca input n dari pengguna

        // Mengecek apakah n <= 10
        if (n > 10 || n < 1) {
            System.out.println("Nilai n harus antara 1 dan 10.");
        } else {
            System.out.println("Tabel Perkalian " + n + "x" + n + ":");
            
            // Loop untuk mencetak tabel perkalian
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(i * j + "\t"); // Mencetak hasil perkalian dengan tab
                }
                System.out.println(); // Ganti baris setelah selesai satu baris tabel
            }
        }
        input.close();
    }
}