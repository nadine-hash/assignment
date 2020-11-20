/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.DatabaseCon;
import Model.CarModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan Tshat Joe
 */
public class CarController {
    public void CControl(CarModel cm){
          
          try {
              Connection con = DatabaseCon.connect();
              PreparedStatement prst = con.prepareStatement("insert into car values (?,?,?,?)");
              
              prst.setString(1, cm.getPlateNo());
              prst.setString(2, cm.getModel());
              prst.setString(3, cm.getType() );
              prst.setDouble(4, cm.getPrice() );
              
              prst.executeUpdate();
              con.close();
              
              JOptionPane.showMessageDialog(null, "Inserted");
          } catch (Exception e) {
              System.out.println(e);
          }
}
      
      public void delete(CarModel del){
      
          try {
              Connection con = DatabaseCon.connect();
              PreparedStatement prt = con.prepareStatement("delete from car where plateNo= ? ");
              
              prt.setString(1, del.getPlateNo());
              prt.executeUpdate();
              con.close();
          } catch (Exception e) {
              System.out.println(e);
          }
      }
    
}
