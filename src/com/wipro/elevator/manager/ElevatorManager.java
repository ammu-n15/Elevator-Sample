package com.wipro.elevator.manager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import com.wipro.elevator.dto.ElevatorDTO;
import com.wipro.elevator.dto.RequestDTO;
import com.wipro.elevator.entity.ElevatorImpl;
import com.wipro.elevator.exception.InvalidDirectionException;

public class ElevatorManager {
	
	public static Queue<RequestDTO> requestList =  new PriorityQueue<RequestDTO>(10,RequestDTO.comparator); 
	public static  Set<Integer> targetList = new HashSet<Integer>();
	private ElevatorImpl elevator;
	
	
	public ElevatorManager() {
					this.elevator= elevator.getInstance();
				/*	this.requestList = new PriorityQueue<RequestDTO>();*/
	}

	
	public void addPickUp(RequestDTO request){
		
		
		// add all requests from User to List
		requestList.add(request);
		
		
		
	}
	
	 public void execute() {
		                
						this.elevator.processRequest();
						
		                
					
	  }
	 
	 /*  if passenger presses from OUTSIDE the lift , from which floor user pressed the lift and which button is pressed */
	 
	 public void liftRequestedFrom(int source , String direction){
		 
		 //check if list contains the existing value, do not add if duplicates
		  
		 requestList.add(new RequestDTO(source,direction));
		 
		 System.out.println(requestList);
		 
		 if(!ElevatorDTO.isLiftTravelling()){ // assumption that lift is idle initially
				System.out.println("is lift idle ");
				ElevatorDTO.setLiftTravelling(true);
				System.out.println("first request :" +source );
				System.out.println("current floor" + ElevatorDTO.getCurrentfloor());
				if(source >  ElevatorDTO.getCurrentfloor()){
					
					ElevatorDTO.setLiftTravellingUp(true);
					  //Direction = "UP";
					  
					  
					  
					  
				  }else{
					  ElevatorDTO.setLiftTravellingUp(false);
						//Direction = "DOWN";
				  }	
				
			 }
		 
		
		     
		 
		 
	 }
	 
	 
	 /* if passenger presses from INSIDE the lift , which floor user wants to go and which button is pressed */
	 
	 public void liftRequestedToGo(int target){
		 requestList.add(new RequestDTO(target,"INSIDE"));
		 
	 }

}
