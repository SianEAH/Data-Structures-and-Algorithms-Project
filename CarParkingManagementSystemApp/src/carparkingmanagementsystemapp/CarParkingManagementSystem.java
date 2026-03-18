/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carparkingmanagementsystemapp;

import javax.swing.JOptionPane;

/**
 *
 * @author siane
 */

//Logic for the GUIs will be handled here

public class CarParkingManagementSystem implements Parkable {
    //data members

    //declare and create instances of my SLL, Queue, Priority Queue & Stack to use here in the management system
    private CarParkingSpaceSLL cpssll; 
    private VehicleQueue vq;
    private DisabledVehiclePriorityQueue dvpq;
    private CarParkingHistoryStack cphs;
   
    //constructor
    public CarParkingManagementSystem() {
      cpssll = new CarParkingSpaceSLL();
      vq = new VehicleQueue();
      dvpq = new DisabledVehiclePriorityQueue();
      cphs = new CarParkingHistoryStack();  
    }
    
    //initialise some car parking spaces (for main)
    public void addCarParkingSpace(String id) {
      //Make sure the parameter requirements are met
      cpssll.add(new CarParkingSpace(id, false, null));
    }
    
    //methods
    //park vehicle method
    @Override
    public void parkVehicle(Vehicle vehicle) {

        CarParkingSpace freeSpace = cpssll.findFreeSpace();

        if(freeSpace != null) {

            freeSpace.assignVehicle(vehicle);

            cphs.push("Parked: " + vehicle.getLicensePlateNumber()); //record the event

        } else {
            //https://www.w3schools.com/java/ref_keyword_instanceof.asp
            if(vehicle instanceof DisabledVehicle) {

                dvpq.enqueue(1, vehicle); //go into the priority queue

            } else {

                vq.enqueue(vehicle); //other vehicles join the queue
            }
        }
    }
    
    //remove vehicle method
    @Override
    public void removeVehicle(String licensePlateNumber) { //Finding where this car is parked

        CarParkingSpace space = cpssll.findVehicleSpace(licensePlateNumber);

        if(space != null) { 

            space.removeVehicle(); //if it's there remove it

            cphs.push("Left: " + licensePlateNumber); //record the event

            System.out.println("Vehicle removed from space: " + space.getCarSpaceID());

            assignNextVehicle(); //checks for anyone now waiting for this space

        } else {
            JOptionPane.showMessageDialog(null, "Vehicle not found.");
        }
    }
    
    //assign the next vehicle
    private void assignNextVehicle() {

    Vehicle nextVehicle = null;

        if(!dvpq.isEmpty()) { //check for any disabled drivers waiting for spaces

            nextVehicle = dvpq.dequeue(); //they get the space first

        } else if(!vq.isEmpty()) {

            nextVehicle = vq.dequeue(); //otherwise we take from the queue
        }

        if(nextVehicle != null) {

            CarParkingSpace freeSpace = cpssll.findFreeSpace();

            if(freeSpace != null) {

                freeSpace.assignVehicle(nextVehicle); //it is now full again

                cphs.push("Parked - " + nextVehicle.getLicensePlateNumber()); //record the event
            }
        }
    }
    
    //display parking spaces
    public String displayParkingSpaces() {
        return cpssll.getSpaces();
    }
    
    //display the waiting queue
    public String displayWaitingQueue() {
        return vq.toString();
    }
    
    //display the disability waiting queue
    public String displayDisabledQueue() {
        if(dvpq.isEmpty()) {
            return "No disabled vehicles waiting in the queue";
        }
        return dvpq.printQ();
    }
    
    //display the recent history
    public String displayHistory() {
        //Checking if it's empty
        if(cphs.isEmpty()) {
            return "No parking history available";
        }
        
        return cphs.displayStack();
    }
}
