/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conn;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class koneksi {

    public static Connection databasekoneksi;
    public static Statement st;

    public static Connection koneksiDB() {
            try {
                String DB, username, password;

                DB = "jdbc:mysql://localhost:3306/jadwalsholat";
                username = "root";
                password = "";
                databasekoneksi = (Connection) DriverManager.getConnection(DB, username, password);
                st = databasekoneksi.createStatement();
//                System.out.println("koneksi berhasil");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal "+ e.getMessage());
            }

        return databasekoneksi;

    }

    public static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
