/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan9;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class ArrayListMahasiswa {
    ArrayList<Mahasiswa> listmahasiswa;
    public ArrayListMahasiswa(){
        listmahasiswa = new ArrayList();
    }
    public void insertData(String NIM, String Nama, String Alamat, String mataKuliah, double nilai1, double nilai2, double nilai3, double nilai4, double nilai5){
        Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat, mataKuliah, nilai1, nilai2, nilai3, nilai4, nilai5);
        mhs.hitungNilaiAkhir();
        listmahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa> getAll(){
        return listmahasiswa;
    }
    
    public void deleteData(int index){
        listmahasiswa.remove(index);
    }
}
