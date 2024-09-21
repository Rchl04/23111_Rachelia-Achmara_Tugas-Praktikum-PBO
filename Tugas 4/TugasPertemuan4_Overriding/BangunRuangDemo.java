/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan4_Overriding;

/**
 *
 * @author Lenovo
 */
public class BangunRuangDemo {
   public static void main(String[] args){
       
       Balok balok = new Balok(14, 9, 11);
       System.out.println("Volume Kubus= " + balok.volume() + " cm^3");
       System.out.println("Luas Permukaan Kubus= " + balok.luasPermukaan() + " cm^2");
       
       System.out.println();
       
       Kubus kubus = new Kubus(5);
       System.out.println("Volume Kubus= " + kubus.volume() + " cm^3");
       System.out.println("Luas Permukaan Kubus= " + kubus.luasPermukaan() + " cm^2");
   } 
}
