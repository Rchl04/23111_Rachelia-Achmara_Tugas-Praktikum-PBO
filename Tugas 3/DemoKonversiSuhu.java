/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan3_No2;

/**
 *
 * @author Lenovo
 */
public class DemoKonversiSuhu {
    public static void main(String[] args){
        KonversiSuhu2 konversi = new KonversiSuhu2();
        
        double celcius = 90;
        System.out.println(celcius + " Celcius = " + konversi.celciusToFahrenheit(celcius) + " Fahrenheit.");
        System.out.println(celcius + " Celcius = " + konversi.celciusToReamur(celcius) + " Reamur.");
        
        double fahrenheit = 194;
        System.out.println(fahrenheit + " Fahrenheit = " + konversi.fahrenheitToReamur(fahrenheit) + " Reamur.");
    }
}