/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carparkingmanagementsystemapp;

/**
 *
 * @author siane
 */

//stores the priority information

public class PQElement {
    //private data members
    private int priorityKey;
    private Vehicle vehicle; //my vehicle object

    //constructor
    public PQElement(int priorityKey, Vehicle vehicle) {
        this.priorityKey = priorityKey;
        this.vehicle = vehicle;
    }

    //setters & getters
    public int getPriorityKey() {
        return priorityKey;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setPriorityKey(int priorityKey) {
        this.priorityKey = priorityKey;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    @Override
    public String toString() {
        return "PQElement{" + "Priority Key=" + priorityKey + ", Vehicle=" + vehicle + '}';
    }
}
