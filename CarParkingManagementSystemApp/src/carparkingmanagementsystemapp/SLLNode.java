/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carparkingmanagementsystemapp;

/**
 *
 * @author siane
 */
public class SLLNode {
    //data members
    protected CarParkingSpace space; //CarParkingSpace Object for my SLL
    protected SLLNode next;
    
    //constructor
    //basic 
    public SLLNode() {
        
    }
    
    //other constructor
    public SLLNode(CarParkingSpace space) {
        this.space = space;
        this.next = next;
    }
    
    //setters
    public void setSpace(CarParkingSpace space) {
        this.space = space;
    }

    public void setNext(SLLNode next) {
        this.next = next;
    }
    
    //getters
    public CarParkingSpace getSpace() {
        return space;
    }

    public SLLNode getNext() {
        return next;
    }
    
    //methods
    //toString method
    @Override
    public String toString() {
        return space.toString();
    }
}
