/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan7;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class TokoSerbaAda {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        //mendefinisikan array daftarBarang yang berisi data barang
        dataBarang[] daftarBarang = {
            new dataBarang ("a001", "Buku", 3000),
            new dataBarang ("a002", "Pensil", 4000),
            new dataBarang ("a003", "Pulpen", 5000)
        };
        
        //Output yang muncul pertama kali
        System.out.println("****************");
        System.out.println("TOKO SERBA ADA");
        System.out.println("****************");
        System.out.print("Masukkan Jumlah Item Barang: ");
        int jumlahItem = input.nextInt();
        
        //Array untuk menyimpan jumlah barang yg dibeli, total harga setiap barang, dan barang yg dipilih berdasarkan kode
        int[] jumlahBeli = new int[jumlahItem];
        int[] totalBayarPerBarang = new int[jumlahItem];
        dataBarang [] barangTerpilihArr = new dataBarang[jumlahItem];
        
        //menampilkan data ke-i & meminta input kode barang
        for (int i=0; i < jumlahItem; i++){
            System.out.println("Data ke " + (i+1));
            System.out.print("Masukkan Kode Barang : ");
            String kode = input.next();
           
        //Mengecek data barang
            dataBarang barangTerpilih = null;
            for (dataBarang barang : daftarBarang){
                if(barang.getKode().equals(kode)){
                    barangTerpilih = barang;
                    break;   
                }
            }
            
        //jika barang ditemukan
            if(barangTerpilih !=null){
                System.out.print("Masukkan jumlah beli : ");
                jumlahBeli[i]= input.nextInt();
                
                totalBayarPerBarang[i] = jumlahBeli[i] * barangTerpilih.getHarga();
                barangTerpilihArr[i] = barangTerpilih;
                //Jika barang tidak ditemukan
            } else {
                System.out.println ("Kode barang tidak ditemukan!");
                i--;    
            }
        }
        
        //Tampilan Output Hasil Transaksi
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*******************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("--------------------------------------------------------------");
        
        int totalBayar = 0;
        for (int i=0; i < jumlahItem; i++){
          dataBarang barangTerpilih = barangTerpilihArr[i];
          System.out.printf("%-4d %-12s %-12s %-7d %-11d %-12d\n", 
                              (i + 1), barangTerpilih.getKode(),
                              barangTerpilih.getNama(), barangTerpilih.getHarga(), 
                              jumlahBeli[i], totalBayarPerBarang[i]);
            totalBayar += totalBayarPerBarang[i];
        }
        
        System.out.println("-------------------------------------------------------------");
        System.out.println("Total Bayar\t\t\t\t\t\t" + totalBayar);
        
        input.close();
    }
} 