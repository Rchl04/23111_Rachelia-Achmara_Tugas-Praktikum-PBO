/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan4_Overriding;

/**
 *
 * @author Lenovo
 */
public class Kubus extends BangunRuang {
    private int sisi;
    
    public Kubus(int sisi){
        this.sisi = sisi;
    }
    
    @Override
    public int volume(){
        return sisi * sisi * sisi;
    }
    
    @Override
    public int luasPermukaan(){
        return 6 * sisi * sisi;
    }
}