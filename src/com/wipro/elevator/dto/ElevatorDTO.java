package com.wipro.elevator.dto;

public class ElevatorDTO {
	
	private static boolean isLiftTravellingUp;
	private static boolean isLiftIdle;
	private static int liftWeight;
	private static int currentfloor;
	public static boolean isLiftTravellingUp() {
		return isLiftTravellingUp;
	}
	public static void setLiftTravellingUp(boolean isLiftTravellingUp) {
		ElevatorDTO.isLiftTravellingUp = isLiftTravellingUp;
	}
	public static boolean isLiftIdle() {
		return isLiftIdle;
	}
	public static void setLiftIdle(boolean isLiftIdle) {
		ElevatorDTO.isLiftIdle = isLiftIdle;
	}
	public static int getLiftWeight() {
		return liftWeight;
	}
	public static void setLiftWeight(int liftWeight) {
		ElevatorDTO.liftWeight = liftWeight;
	}
	public static int getCurrentfloor() {
		return currentfloor;
	}
	public static void setCurrentfloor(int currentfloor) {
		ElevatorDTO.currentfloor = currentfloor;
	}
	
	
	}
