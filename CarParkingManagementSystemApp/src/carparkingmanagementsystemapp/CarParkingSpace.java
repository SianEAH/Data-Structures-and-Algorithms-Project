/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carparkingmanagementsystemapp;

/**
 *
 * @author siane
 */

//class added, not represented on Class Diagram
//seperate responsibilities from the SLL

public class CarParkingSpace {
    
    //data members
    private String carSpaceID;
    private boolean isTaken;
    private Vehicle vehicle; //Vehicle object
    
    //constructor
    //basic
    public CarParkingSpace() {
        
    }
    
    //other constructor
    public CarParkingSpace(String carSpaceID, boolean isTaken, Vehicle vehicle) {
        this.carSpaceID = carSpaceID;
        this.isTaken = isTaken;
        this.vehicle = vehicle;
    }
    
    //setters
    public void setCarSpaceID(String carSpaceID) {
        this.carSpaceID = carSpaceID;
    }

    public void setIsTaken(boolean isTaken) {
        this.isTaken = isTaken;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    //getters
    public String getCarSpaceID() {
        return carSpaceID;
    }

    public boolean isTaken() {
        return isTaken;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    
    //methods
    //assign a vehicle a space
    public void assignVehicle(Vehicle vehicle) { //Vehicle object
        this.vehicle = vehicle;
        this.isTaken = true;
    }
    
    //remove a vehicle
    public void removeVehicle() {
        this.vehicle = null;
        this.isTaken = false;
    }
    
    //display space for testing purposes
    public void displaySpace() {

    System.out.println("Space: " + carSpaceID);

    if (isTaken) {
        System.out.println("\nOccupied by: " + vehicle.getLicensePlateNumber());
    } else {
        System.out.println("Space is free");
    }

    }
    
}
