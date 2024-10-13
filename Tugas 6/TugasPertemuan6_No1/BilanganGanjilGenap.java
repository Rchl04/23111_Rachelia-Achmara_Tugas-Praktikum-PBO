/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan6_No1;

/**
 *
 * @author Lenovo
 */
public class BilanganGanjilGenap {
    public static void main (String[] args){
        int n = 20; //deklarasi batas deret bilangan
        
        //Output program untuk menegcek bilangan genap
        System.out.println("Bilangan Genap dari 0 - " +n+ ":");
        for (int i=0; i<=n; i++){
            if (i%2 == 0){
                System.out.print(i+" ");
            }
        }
        
        //Output program untuk menegcek bilangan ganjil
        System.out.println("\n\nBilangan Ganjil dari 0 - " +n+ ":");
        for (int i=0; i<=n; i++){
            if (i%2 != 0){
                System.out.print(i+" ");
            }
        }
    }
}