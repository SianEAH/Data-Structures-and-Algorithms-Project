/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carparkingmanagementsystemapp;

/**
 *
 * @author siane
 */
public class Vehicle implements Displayable{
    //data members
    String ownerName, licensePlateNumber;
    
    //constructor
    //Basic constructor
    public Vehicle() {
        
    }
    
    //Other constructor
    public Vehicle(String ownerName, String licensePlateNumber) {
        this.ownerName = ownerName;
        this.licensePlateNumber = licensePlateNumber;
    }
    
    //setters
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }
    
    //getters
     public String getOwnerName() {
        return ownerName;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }
    
    //methods
    @Override
    public void displayDetails() {
        
    }
}
