/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carparkingmanagementsystemapp;

/**
 *
 * @author siane
 */
public class CarParkingManagementSystem implements Parkable {
    //data members
    
    //declare and create instances of my SLL, Queue, Priority Queue & Stack to use here in the management system
    CarParkingSpaceSLL cpssll = new CarParkingSpaceSLL();
    VehicleQueue vq = new VehicleQueue();
    DisabledVehiclePriorityQueue dvpq = new DisabledVehiclePriorityQueue();
    CarParkingHistoryStack cphs = new CarParkingHistoryStack();
    
    //constructor
    //Basic Constructor
    public CarParkingManagementSystem() {
        
    }
    
    //setters
    
    //getters
    
    //methods
    @Override
    public void parkVehicle(Object Vehicle) {
        
    }
    
    @Override
    public void removeVehicle(String licensePlateNumber) {
        
    }
}
