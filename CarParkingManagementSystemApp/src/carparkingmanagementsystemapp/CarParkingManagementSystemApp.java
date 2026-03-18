/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carparkingmanagementsystemapp;

/**
 *
 * @author siane
 */
public class CarParkingManagementSystemApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variables
        
        //create and declare objects
        //Call my management system
        CarParkingManagementSystem cpms = new CarParkingManagementSystem();
        
        //initialise some car parking spaces
        cpms.addCarParkingSpace("A1");
        cpms.addCarParkingSpace("A2");
        cpms.addCarParkingSpace("A3");
        
        //make my main GUI visibile
        SmartParkGUI spGUI = new SmartParkGUI(cpms);
        spGUI.setVisible(true);
        
        //inputs
        
        //processes
        
        //outputs
    }
    
}
