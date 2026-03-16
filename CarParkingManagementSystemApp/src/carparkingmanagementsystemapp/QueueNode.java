/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carparkingmanagementsystemapp;

/**
 *
 * @author siane
 */
public class QueueNode {
    //private data members
    protected Vehicle vehicle; //vehicle object
    protected QueueNode next;
    
    //constructors
    //empty
    public QueueNode() {
        
    }
    
    //other constructor
    public QueueNode(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.next = next;
    }
    
    //setters: one for each input
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }
    
    //getters: one for each output
    public Vehicle getVehicle() {
        return vehicle;
    }

    public QueueNode getNext() {
        return next;
    }
    
    
    //My other methods
    @Override
    public String toString() {
        return vehicle.toString();
    }
}
