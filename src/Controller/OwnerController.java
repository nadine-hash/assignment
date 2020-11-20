/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.DatabaseCon;
import Model.OwnerModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan Tshat Joe
 */
public class OwnerController {
    
    public void OControl(OwnerModel om){
          
          try {
              Connection con = DatabaseCon.connect();
              PreparedStatement prst = con.prepareStatement("insert into owner values (?,?,?,?)");
              
              prst.setInt(1, om.getIdNumber());
              prst.setString(2, om.getFirstName());
              prst.setString(3, om.getLastName());
              prst.setString(4, om.getPhoneNumber());
              
              prst.executeUpdate();
              con.close();
              
              JOptionPane.showMessageDialog(null, "inserted");
          } catch (Exception e) {
              System.out.println(e);
          }
}
      
      public void delete(OwnerModel del){
      
          try {
              Connection con = DatabaseCon.connect();
              PreparedStatement prt = con.prepareStatement("delete from owner where idNumber= ? ");
              
              prt.setInt(1, del.getIdNumber());
              prt.executeUpdate();
              con.close();
          } catch (Exception e) {
              System.out.println(e);
          }
      }
}
