/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
/**
 *
 * @author Jagdish chandra bhat
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/entry?useSSL=false","root","@Manshi22"); 
    //    jdbc:mysql://your_host:your_port/your_database?useSSL=false

        return con;
        } 
        catch(Exception e){
            return null; 
        }
    }
}
