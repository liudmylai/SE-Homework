package com.example.floorplan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Apartment {
	private boolean balcony;
	private String parking;

	@Autowired
	private FloorPlan fplan;
	
	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public boolean isBalcony() {
		return balcony;
	}

	public void setBalcony(boolean balcony) {
		this.balcony = balcony;
	}

	public FloorPlan getFplan() {
		return fplan;
	}

	public void setFplan(FloorPlan fplan) {
		this.fplan = fplan;
	}

	public void showApartment() {
		System.out.println("************************");
		System.out.println("** Apartment for rent **");
		System.out.println("************************");
		System.out.println("Floor plan:\n" + this.fplan);
		System.out.println("Parking: " + this.parking);
		System.out.println("********************");
		System.out.println("\n");

	}

}
