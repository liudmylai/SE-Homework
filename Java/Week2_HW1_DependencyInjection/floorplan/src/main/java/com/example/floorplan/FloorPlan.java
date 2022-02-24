package com.example.floorplan;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class FloorPlan {
	private int bedroom;
	private int bathroom;
	private double area;
	
	
	public int getBedroom() {
		return bedroom;
	}
	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}
	public int getBathroom() {
		return bathroom;
	}
	public void setBathroom(int bathroom) {
		this.bathroom = bathroom;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public String toString() {
		return "Bedrooms: " + this.bedroom + "\n" +
			   "Bathrooms: " + this.bathroom + "\n" +
			   "Area: " + this.area + " sqft";
	}
	
	
	
}
