/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Jonathan Tshat Joe
 */
public class DatabaseCon {
        public  static Connection connect(){
         Connection con = null;
        try {
           // DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Car","postgres","123");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;    
}
}
