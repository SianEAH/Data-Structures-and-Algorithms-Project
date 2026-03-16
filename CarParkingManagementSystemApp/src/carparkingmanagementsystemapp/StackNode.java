/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carparkingmanagementsystemapp;

/**
 *
 * @author siane
 */
public class StackNode {
    //private data members
    private String record;
    private StackNode next;

    //constructor
    public StackNode(String record) {
        this.record = record;
        this.next = null;
    }

    //setters & getters
    public String getRecord() {
        return record;
    }

    public StackNode getNext() {
        return next;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }
}
