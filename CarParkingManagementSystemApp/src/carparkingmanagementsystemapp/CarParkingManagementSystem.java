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
    
    //initialise some car parking spaces
    public void addCarParkingSpace(String id) {
      //Make sure the parameter requirements are met
      cpssll.add(new CarParkingSpace("A1", false, null));
      cpssll.add(new CarParkingSpace("A2", false, null));
      cpssll.add(new CarParkingSpace("A3", false, null));
      cpssll.add(new CarParkingSpace("A4", false, null));
    }
    
    //methods
    //park vehicle method
    @Override
    public void parkVehicle(Object vehicleObj) {

        Vehicle vehicle = (Vehicle) vehicleObj; //cast back to vehicle

        CarParkingSpace freeSpace = cpssll.findFreeSpace();

        if(freeSpace != null) {

            freeSpace.assignVehicle(vehicle);

            cphs.push("Parked - " + vehicle.getLicensePlateNumber()); //record the event

        } else {

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

            cphs.push("Left - " + licensePlateNumber); //record the event

            System.out.println("Vehicle removed from space " + space.getCarSpaceID());

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

            nextVehicle = vq.dequeue();
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
    public void displayParkingSpaces() {
        cpssll.printList();
    }
    
    //display the waiting queue
    public void displayWaitingQueue() {
        System.out.println(vq.toString());
    }
    
    //displa the recent history
    public void displayHistory() {
        cphs.displayStack();
    }
}
