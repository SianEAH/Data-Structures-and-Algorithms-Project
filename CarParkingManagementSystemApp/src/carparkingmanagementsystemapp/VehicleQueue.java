/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carparkingmanagementsystemapp;

/**
 *
 * @author siane
 */

//First In First Out

public class VehicleQueue {
    //data members
    private QueueNode head, curr;
    private int size; //track the size of the Queue
    
    //constructor
    public VehicleQueue() {
        head = null;
        size = 0;
        curr = null;
    }
    
    //methods
    //the front vehicle
    public Vehicle frontVehicle() {
        if (head == null) {
            return null;
        } else {
            return head.getVehicle(); //the vehicle at the front of the Queue
        }
    }
    
    //setting the current vehicle
    public void setCurrent(int index) {
        curr = head;

        for(int i = 1; i < index; i++) { //iterate along the Queue
            curr = curr.getNext(); //curr is equal to the next vehicle
        }
    }
    
    //isEmpty() method
    public boolean isEmpty() {
        if(size == 0) {
            return true;
        }else {
            return false;
        }
    }
    
    //enqueue method
    public void enqueue(Vehicle vehicle) { //taking in my Vehicle object

        QueueNode newNode = new QueueNode(vehicle); //newNode object, taking in vehicle

        if(head == null) {
            head = newNode; //if the head is empty, the Queue is empty, the head becomes newNode
        } else {
            setCurrent(size); //set the current to the size of the queue
            curr.setNext(newNode); //set the Next to the newNode
        }

        size++; //increase the size counter
        System.out.println("Vehicle added: " + vehicle.getLicensePlateNumber());
    }
    
    //dequeue method
    public Vehicle dequeue() {

        if(head == null) {
            return null;
        }

        Vehicle removedVehicle = head.getVehicle(); //temp object

        head = head.getNext(); //head becomes the next Vehicle
        size--; //size counter decreases

        System.out.println("Vehicle removed: " + removedVehicle.getLicensePlateNumber());

        return removedVehicle; //return temp object
    }
    
    //toString method
    @Override
    public String toString() {

        StringBuffer sb = new StringBuffer(); //new StringBuffer
        QueueNode tempNode = head; //tempNode for the head

        while (tempNode != null) { //while tempNode isn't null, get the vehicle + license plate number and add to the StringBuffer
            sb.append(tempNode.getVehicle().getLicensePlateNumber()).append(" ");
            tempNode = tempNode.getNext(); //get the next vehicle
        }

        return sb.toString();
    }
}
