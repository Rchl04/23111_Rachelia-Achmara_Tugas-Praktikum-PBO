/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan7;

/**
 *
 * @author Lenovo
 */
public class dataBarang {
    private String kodeBarang;
    private String namaBarang;
    private int hargaBarang;
    
    public dataBarang(String kodeBarang, String namaBarang, int hargaBarang){
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;   
    }
    
    public String getKode(){
        return kodeBarang;    
    }
    
    public String getNama(){
         return namaBarang;
    }
       
    public int getHarga(){
        return hargaBarang;
    }  
}

