/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LPG
 */
public class Koneksi {
    public Connection connect(){
        Connection conn = null;
        try{
            String url = "jdbc:sqlite:C:/Users/Oktriana Sidik/Documents/GitHub/deltaMovie/MediaPlayerTest/Databse.db";
            //contoh : jdbc:sqlite:C:/Users/Oktriana Sidik/Documents/NetBeansProjects/deltaMovie/MediaPlayerTest/Databse.db
            //String url = "jdbc:sqlite:C:/Users/LPG/Documents/RPL/MediaPlayerTest/Databse.db";
            //String url = "jdbc:sqlite:C:/Users/A/Documents/GitHub/deltaMovie/MediaPlayerTest/Databse.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been success!!");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
