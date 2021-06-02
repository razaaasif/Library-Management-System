/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;

/**
 *
 * @author aasif
 */
public class ConnectionProvider {
    public  static Connection getCon() throws ClassNotFoundException {
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/libman","root","root");
             System.out.println("connection is succesfull");
             return con;
        }
        catch( SQLException e){
            System.out.println(e);
            return null;
        }
    }
}
