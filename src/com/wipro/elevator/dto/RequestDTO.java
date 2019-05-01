package com.wipro.elevator.dto;

import java.util.*;

public class RequestDTO {
	
	public String getDirection() {
		return direction;
	}


	public void setDirection(String direction) {
		this.direction = direction;
	}


	public boolean isRequestProcessed() {
		return isRequestProcessed;
	}


	public void setRequestProcessed(boolean isRequestProcessed) {
		this.isRequestProcessed = isRequestProcessed;
	}


	private int sourceFloor;
	//private int destinationFloor;
	private String direction;
	private boolean isRequestProcessed;
	
	
   
	


	public int getSourceFloor() {
		return sourceFloor;
	}


	public void setSourceFloor(int sourceFloor) {
		this.sourceFloor = sourceFloor;
	}


	/*public int getDestinationFloor() {
		return destinationFloor;
	}


	public void setDestinationFloor(int destinationFloor) {
		this.destinationFloor = destinationFloor;
	}*/


	

	public RequestDTO(int sourceFloor, int destinationFloor, int userWeight) {
		
		this.sourceFloor = sourceFloor;
		//this.destinationFloor = destinationFloor;
		//this.userWeight = userWeight;
	}


	public RequestDTO(int sourceFloor, String direction) {
		this.sourceFloor = sourceFloor;
		this.direction = direction;
	}


	


	//@Override
	/*public String toString() {
		return "RequestDTO [sourceFloor=" + sourceFloor + ", destinationFloor=" + destinationFloor + ", userWeight="
				+ userWeight + "]";
	}*/

	   public  static Comparator<RequestDTO> comparator = new Comparator<RequestDTO>(){
			
			@Override
			public int compare(RequestDTO c1, RequestDTO c2) {
				System.out.println(c1.getSourceFloor()+ "in comparator");
				System.out.println("is lift travelling up" + ElevatorDTO.isLiftTravellingUp() + " " + c1.getDirection());
				if(c1.getDirection().equals("INSIDE") ){
					
					if(ElevatorDTO.isLiftTravellingUp() && (ElevatorDTO.getCurrentfloor() < c1.getSourceFloor())){
						return 1;
					}
					else if(!ElevatorDTO.isLiftTravellingUp() && (ElevatorDTO.getCurrentfloor() > c1.getSourceFloor())){
							return 1;
						}
					else {
						return -1;
					}
					
				}
				if(ElevatorDTO.isLiftTravellingUp()){
					 if(c1.getDirection().equals("DOWN")){
						 return -1;
					 }
					
					 	return (int) (c1.getSourceFloor() - c2.getSourceFloor());
				}else{
					 if(c1.getDirection().equals("UP")){
						 return -1;
					 }
					 	return (int) (c2.getSourceFloor() - c1.getSourceFloor());
				}
	        }
		};
		
		
			


    
    


}
