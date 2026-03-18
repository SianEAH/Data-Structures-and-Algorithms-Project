/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carparkingmanagementsystemapp;

/**
 *
 * @author siane
 */
public class CarParkingHistoryStack {
    //data members
    private StackNode head, curr;
    private int size; //keeping track of the size of the SLL (Stack)
    
    //constructor
    public CarParkingHistoryStack(){
        //setting up the empty stack
        head = null;
        curr = null;
        size = 0;
    }
    
    //methods
    //push method
    public void push(String record) { //push the new parking event

        StackNode newNode = new StackNode(record); //create a Node to store it

        newNode.setNext(head);
        head = newNode; //set the head to the newNode

        size++; //increase the size counter
    }
    
    //pop method
    public String pop() {

        if(head == null) {
            return null;
        }

        String record = head.getRecord();
        head = head.getNext();
        size--; //decrease the size counter

        return record; //return the record
    }
    
    //peek method
    public String peek() {

        if(head == null) {
            return null;
        } else {
            return head.getRecord();
        }
    }
    
    //isEmpty() method
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }else
            return false;
    }
    
    //size method
    public int size() {
        return size;
    }
    
    //display stack
    public String displayStack() {
        StringBuffer sb = new StringBuffer();
        
        StackNode curr = head;

        while(curr != null) {
            sb.append(curr.getRecord()).append("\n");
            curr = curr.getNext();
        }
        return sb.toString(); //return to String
    }
}
