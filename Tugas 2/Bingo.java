/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan2_No3;

/**
 *
 * @author Lenovo
 */
public class Bingo {
    public void laguBingo(int claps) {
        String[] huruf = {"B", "I", "N", "G", "O"};

        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < huruf.length; j++) {
                if (j < claps) {
                    System.out.print("(clap)"); 
                } else {
                    System.out.print(huruf[j] + ""); 
                }
                if (j < 4) {
                    System.out.print("-"); // Menyisipkan tanda "-" di antara huruf
                }
            }
            System.out.println();  
        }

        System.out.println("And Bingo was his name-o.");
    }

    public void tampilkanLirik() {
        for (int i = 0; i <= 5; i++) {
            laguBingo(i);
            System.out.println(); 
        }
    }
}

