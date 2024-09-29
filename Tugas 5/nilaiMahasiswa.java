/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan5_No1;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class nilaiMahasiswa {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("\n=== Input Data Mahasiswa ===\n");
    
    System.out.print("NPM : ");
    String npm = input.nextLine();
    
    System.out.print("Nama Mahasiswa : ");
    String nama = input.nextLine();
    
    System.out.print("NilaiKehadiran : ");
    double nKehadiran = input.nextDouble();
    
    System.out.print("Nilai Tugas : ");
    double nTugas = input.nextDouble();
    
    System.out.print("Nilai UTS : ");
    double nUTS = input.nextDouble();
    
    System.out.print("Nilai UAS : ");
    double nUAS = input.nextDouble();
    
    double nAkhir = (0.1 * nKehadiran)+(0.2 * nTugas)+(0.3 * nUTS)+(0.4 *nUAS);
    
    String predikat = " ";
    String keterangan = " ";
    
        if(nAkhir >=76 && nAkhir <=100){
            predikat = "A";
            keterangan = "ISTIMEWA";
        }
        else if(nAkhir >=66 && nAkhir <=75){
            predikat = "B";
            keterangan = "BAIK";
        }
        else if(nAkhir >=56 && nAkhir <=65){
            predikat = "C";
            keterangan = "CUKUP";
        }
        else if(nAkhir >=46 && nAkhir <=55){
            predikat = "D";
            keterangan = "KURANG";
        }
        else if(nAkhir >=0 && nAkhir <=45){
            predikat = "D";
            keterangan = "KURANG SEKALI";
        }
 
    System.out.println();
    System.out.println("\n=== Data Mahasiswa ===");
    System.out.println("NPM : " +npm);
    System.out.println("Nama Mahasiswa : " +nama);
    System.out.println("Nilai Akhir : " +nAkhir);
    System.out.println("Predikat : " + predikat);
    System.out.println("Keterangan : " + keterangan);
    
    } 
}