/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan6_No1;

/**
 *
 * @author Lenovo
 */
public class Lagu {
    public static void main(String[] args){
        int n = 10; //Jumlah Anak Ayam awal (bisa diubah sesuai keinginan)
        
        System.out.println("Lagu: Anak Ayam Turun " +n+ "");
        for (int i=n; i>0; i--){
            if (i==1){
                System.out.println("Anak ayam turun " +i+ ", mati satu tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " +i+ ", mati satu tinggal " +(i-1)+ ".");
            }
        }
    }
}