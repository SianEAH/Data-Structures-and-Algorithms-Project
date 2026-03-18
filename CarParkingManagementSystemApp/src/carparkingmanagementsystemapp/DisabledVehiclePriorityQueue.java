/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carparkingmanagementsystemapp;

/**
 *
 * @author siane
 */

//remove by priority, not FIFO

public class DisabledVehiclePriorityQueue {
    //data members
    private PQNode head;
    private PQNode curr;
    private PQNode prev;
    private int size; //track the size of the SLL
    
    //constructor
    public DisabledVehiclePriorityQueue() {
        head = null;
        curr = null;
        prev = null;
        size = 0;
    }
    
    //methods
    //isEmpty method
    public boolean isEmpty() {
      if(size == 0) {
          return true;
      }else {
          return false;
      }  
    }
    
    //the size method
    public int size() {
        return size;
    }
    
    //enqueue method
    public void enqueue(int priorityKey, Vehicle v) { //add the priority + vehicle

        PQElement elem = new PQElement(priorityKey, v); //new instance of PQElement
        PQNode newNode = new PQNode(elem); //newNode, taking in elem

        if(head == null || priorityKey > head.getElement().getPriorityKey()) { //if the head is empty or the priority key is greater than the head, get element + priority key
            newNode.setNext(head); //set it to the head
            head = newNode; //head is the new node
        }else {

            PQNode curr = head; //current node is the head
            //when the next element isn't null and it's greater than the priority key
            while(curr.getNext() != null && curr.getNext().getElement().getPriorityKey() >= priorityKey) {
                curr = curr.getNext(); //curr becomes the next vehicle
            }

            newNode.setNext(curr.getNext());
            curr.setNext(newNode);
        }

        size++; //increase the size counter
    }
    
    //dequeue method
    public Vehicle dequeue() {

        if(head == null) {
            return null;
        }

        Vehicle v = head.getElement().getVehicle();
        head = head.getNext();
        size--; //decrease the size counter

        return v;
    }
    
    //frontOfQueue method
    public Vehicle frontOfQueue() {

        if(head == null) {
            return null;
        }

        return head.getElement().getVehicle();
    }
    
    //print the priority list
    public String printQ() {

        StringBuffer strB = new StringBuffer(); //new StringBuffer
        PQNode curr = head; //curr is the head

        while(curr != null) {

            PQElement elem = curr.getElement();

            strB.append("Priority: ")
                .append(elem.getPriorityKey())
                .append(" Vehicle: ")
                .append(elem.getVehicle().getLicensePlateNumber())
                .append("\n");

            curr = curr.getNext();
        }

        return strB.toString(); //return to String
    }
}
