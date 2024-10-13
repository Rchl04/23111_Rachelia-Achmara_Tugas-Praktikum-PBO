/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan6_No1;

/**
 *
 * @author Lenovo
 */
public class BilanganPrimaNonPrima {
    public static void main (String[] args){
        int n = 20; //deklarasi batas deret bilangan

        //Output program
        System.out.println("Bilangan Prima dari 0 - " +n+ ":");
        for (int i=0; i<=n; i++){
            if(Prima(i)){
                System.out.print(i+" ");
            }
        }
        
        System.out.println("\n\nBilangan Non Prima dari 0 - " +n+ ":");
        for (int i=0; i<=n; i++){
            if(!Prima(i)){
                System.out.print(i+" ");
            }
        }
    }
    
    //Mnegecek Bilangan Prima
    public static boolean Prima(int bil){
        if(bil <=1){
            return false;
            //jika bil<=1 maka bukan prima
        }
        for (int j=2; j*j<=bil; j++){
        //deklarasi j sebagai angka untuk mengecek faktor dari 2 hingga kuadrat dari i
            if(bil%j ==0){
                return false;
                //jika bilangan dapat dibagi j maka bukan prima
            }
        }
        return true;
        //jika tidak ada faktor pembagi, maka bilangan adalah prima
    }
}
