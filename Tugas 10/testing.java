package javadb;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadb;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;

import java.util.Scanner;

import javadb.Koneksi;

/**
 *
 * @author Lenovo
 */
public class testing {
    
}
public static void main (String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan username: ");
    String uname = input.nextLine();
    System.out.print("Masukkan password: ");
    String passwd = input.next();
    try{
        Connection connection = Koneksi.konek();
        System.out.println("Koneksi berhasil!");

        Statement statement = connection.createStatement();

        String query = "SELECT * FROM user WHERE username = '" + uname + "' AND password = '" + passwd + "'";
        System.out.println(query);
        ResultSet resultSet = statement.executeQuery(query);

        if(resultSet.next()){
            System.out.println("Login berhasil");
        }else{
            System.out.println("Username atau password salah");
        }
        
        resultSet.close();
        statement.close();
        connection.close();

    } catch (SQLException | ClassNotFoundException ex){
        Logger.getLogger(testing.class.getName()).log(Level.SEVERE, null, ex);
}
}
