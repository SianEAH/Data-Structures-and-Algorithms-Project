/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carparkingmanagementsystemapp;

/**
 *
 * @author siane
 */

//SLL class for Priority Queue

public class PQNode {
    //private data members
    private PQElement element; //stores my whole object (+ priority)
    private PQNode next;

    //constructor
    //basic
    public PQNode() {
        
    }
    
    //other constructor
    public PQNode(PQElement element) {
        this.element = element;
        this.next = next;
    }

    //setters & getters
    public PQElement getElement() {
        return element;
    }

    public PQNode getNext() {
        return next;
    }

    public void setNext(PQNode next) {
        this.next = next;
    }
    
}
