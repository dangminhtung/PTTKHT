/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author minhtung
 */
public class DBConnect {
     Connection conn;
     public static Connection getConnection() throws SQLException
     {
          Connection cons=null;
          try {
     
               String connectionUrl =
                                   "jdbc:sqlserver://localhost:1433;" +
                                    "databaseName=QuanLyHocPhi;integratedSecurity=true;" +
                                    "encrypt=true;trustServerCertificate=true";
               Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
               cons=DriverManager.getConnection(connectionUrl);
               return cons;
          } catch (ClassNotFoundException | SQLException e) {
               System.out.println(e.toString());
          }
          
          return null;
     }
        public ResultSet ExcuteQueryGetTable(String cauTruyVanSQL){
        try {
            Statement stmt = conn.createStatement();           
            ResultSet rs = stmt.executeQuery(cauTruyVanSQL);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
            
        return null;
    }
     public static void main(String[] args) throws SQLException {
          try (Connection c = getConnection()) {
               System.out.println(c.toString());
          }
     }
}
