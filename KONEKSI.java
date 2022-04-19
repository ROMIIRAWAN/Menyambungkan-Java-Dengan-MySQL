/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

import java.sql.*;
import java.sql.DriverManager;
public class KONEKSI {
    static final String driver = "Com.MySQL.jdbl.aDriver";
    static final String url = "jdbl:MySQL://localhost/penjualan";
    static final String user = "root";
    static final String upass = "";
    static Connection conn;
    static Statement stat;
    
        public static void konek (){
            try{
                Class.forName(driver);
                conn=DriverManager.getConnection(url, user,upass);
                System.out.println("latihan 1, KONEKSI,konek()");
            }catch(Exception e){
                System.out.println("koneksi gagal");
            }
        }
        public static void main(String[] args) {
        konek();
    }
    
}
