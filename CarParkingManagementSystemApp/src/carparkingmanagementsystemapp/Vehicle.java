/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carparkingmanagementsystemapp;

/**
 *
 * @author siane
 */

//this is my parent class

public class Vehicle implements Displayable{
    //data members
    protected String ownerName, licensePlateNumber; 
    
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
       System.out.println("Owner: " + ownerName + "\nLicense Plate: " + licensePlateNumber); 
    }
}
