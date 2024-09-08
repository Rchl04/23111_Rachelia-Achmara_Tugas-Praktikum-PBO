/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan2_No1;

/**
 *
 * @author Lenovo
 */
public class Matematika implements InterfaceMatematika{
    public int pertambahan(int a, int b){
        return a+b;
    }
    
    public int pengurangan(int a, int b){
        return a-b;
    }
    
    public int perkalian(int a, int b){
        return a*b;
    }
    
    public float pembagian(int a, int b){
        return (float)a/b;
    }
}
