package com.example.floorplan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class House {
	
	private int floors;
	private int year;
	private String type;
	
	@Autowired
	private FloorPlan fplan;
	
	
	
	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public FloorPlan getFplan() {
		return fplan;
	}

	public void setFplan(FloorPlan fplan) {
		this.fplan = fplan;
	}

	public void showHouse() {
		System.out.println("************************");
		System.out.println("**   House for sale   **");
		System.out.println("************************");
		System.out.println("Type  : " + this.type + "\n" +
				           "Year  : " + this.year + "\n" +
						   "Floors: " + this.floors);
		System.out.println("------------------------");
		System.out.println("Floor plan:\n" + this.fplan);
		System.out.println("************************");
		System.out.println("\n");
	}
	
}
