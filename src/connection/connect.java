/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class connect {
   public Statement conn()
   {
       Statement stmt=null;
       try
       {
    Class.forName("com.mysql.cj.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/profile","root","mysql");  
        stmt=con.createStatement();
     
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.println(e);
       }
          return stmt;
   } 
    
}

