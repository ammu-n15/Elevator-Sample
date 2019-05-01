
package com.wipro.elevator.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.wipro.elevator.dto.ElevatorDTO;
import com.wipro.elevator.dto.RequestDTO;

import com.wipro.elevator.entity.ElevatorImpl;
import com.wipro.elevator.entity.User;
import com.wipro.elevator.manager.ElevatorManager;

/**
 * @author Amreen Nazeer
 */

public class Client {

	public static void main(String[] args) {
		
		/*		
		  ElevatorManager elevatorManager = new ElevatorManager(elevator);
		  elevatorManager.addPickUp(new RequestDTO(5,10,30)); // first user access the lift at ground floor and want to go to 5th floor
		  elevatorManager.addPickUp(new RequestDTO(7,5,60)); 
		  elevatorManager.addPickUp(new RequestDTO(6,3,60)); 
	      elevatorManager.addPickUp(new RequestDTO(8,10,40));
	    
	      elevatorManager.addPickUp(new RequestDTO(7,8,50));
	      elevatorManager.execute();*/
		
		  
		  ElevatorDTO.setCurrentfloor(0);  // assuming lift is in ground Floor initially
		  ElevatorDTO.setLiftWeight(50);
		  
		  // add the pickUp Requests and destination Requests
		
		  ElevatorManager elevatorManager = new ElevatorManager();
		  elevatorManager.liftRequestedFrom(5, "UP"); //source,dir
		  elevatorManager.liftRequestedFrom(4, "DOWN");
		  elevatorManager.liftRequestedFrom(7, "UP");
		  
		  
		  
		  
		 /* elevatorManager.liftRequestedToGo(9); //how we will know if user 1 requested 9th floor
		  elevatorManager.liftRequestedToGo(2);
		  elevatorManager.liftRequestedToGo(10);*/
		  
		 		  
		  elevatorManager.execute();
		  
		  
		
		
		
		

	}

}
