/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carparkingmanagementsystemapp;

/**
 *
 * @author siane
 */
public class Node {
    //data members
    protected CarParkingSpace space; //CarParkingSpace Object for my SLL
    protected Node next;
    
    //constructor
    //basic 
    public Node() {
        
    }
    
    //other constructor
    public Node(CarParkingSpace space) {
        this.space = space;
        this.next = next;
    }
    
    //setters
    public void setSpace(CarParkingSpace space) {
        this.space = space;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    //getters
    public CarParkingSpace getSpace() {
        return space;
    }

    public Node getNext() {
        return next;
    }
    
    //methods
    //toString method
    @Override
    public String toString() {
        return space.toString();
    }
}
