/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Jonathan Tshat Joe
 */
public class CarModel {
    private String PlateNo;
    private String Model;
    private String Type;
    private Double Price;
    private Double Tax;
    private Double Net;
    private String Owner;
    private String Owner_name;
    private String Owner_contact;

    public String getPlateNo() {
        return PlateNo;
    }

    public void setPlateNo(String PlateNo) {
        this.PlateNo = PlateNo;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public Double getTax() {
        return Tax;
    }

    public void setTax(Double Tax) {
        this.Tax = Tax;
    }

    public Double getNet() {
        return Net;
    }

    public void setNet(Double Net) {
        this.Net = Net;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public String getOwner_name() {
        return Owner_name;
    }

    public void setOwner_name(String Owner_name) {
        this.Owner_name = Owner_name;
    }

    public String getOwner_contact() {
        return Owner_contact;
    }

    public void setOwner_contact(String Owner_contact) {
        this.Owner_contact = Owner_contact;
    }
    
    
}
