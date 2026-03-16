/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carparkingmanagementsystemapp;

/**
 *
 * @author siane
 */
public class CarParkingSpaceSLL {
    //data members
    private SLLNode head;
    private SLLNode curr;
    private SLLNode prev;
    private int size; //track the size of the SLL
    
    //constructor
    public CarParkingSpaceSLL() {
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
    
    //adding a space to my SLL
    public void add(CarParkingSpace space) { //take in the CarParkingSpace object variable space

    SLLNode newNode = new SLLNode(space); //instance of Node, newNode and taking in a space

    if(head == null) { //if the head is null, nothing is in the list
        head = newNode; //the head becomes the newNode
    } else {
        curr = head; //otherwise curr becomes the head
        
        while(curr.getNext() != null) { //while the next element after curr is not empty, curr becomes it
            curr = curr.getNext();
        }
        
        curr.setNext(newNode); //setting it to the new node
    }

    size++; //increasing the size counter
    }
    
    //finding a free space
    public CarParkingSpace findFreeSpace() {
        curr = head; //starting at the beginnging of the list (head)

        while(curr != null) {

            CarParkingSpace space = (CarParkingSpace) curr.getSpace(); //get curr's space, casting CarParkingSpace

            if(!space.isTaken()) {
                return space;
            }

            curr = curr.getNext(); //curr becomes the next space/element
        }

        return null;
        }

        //searching for a vehicle space by license plate number
        public CarParkingSpace findVehicleSpace(String licensePlateNumber) {

        curr = head; //curr is the head

        while(curr != null) { //while curr is not null, get the next space

            CarParkingSpace space = curr.getSpace();
            //if the space is taken the the license plate number equals, return the space
            if(space.isTaken() && space.getVehicle().getLicensePlateNumber().equals(licensePlateNumber)) {

                return space;
            }

            curr = curr.getNext();
        }

        return null; //if not return null
    }
    
    //print the list
    public void printList() {
        SLLNode aNode = head;

        while(aNode != null) {
            CarParkingSpace space = (CarParkingSpace) aNode.getSpace();
            System.out.println(space.getCarSpaceID());
            aNode = aNode.getNext();
        }
    }
}
