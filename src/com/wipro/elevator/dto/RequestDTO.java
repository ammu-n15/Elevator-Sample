package com.wipro.elevator.dto;



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

	


    
    


}
