package com.example.floorplan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FloorplanApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext	context = SpringApplication.run(FloorplanApplication.class, args);
		
		// create FloorPlan bean for House
		FloorPlan floorplan1 = context.getBean(FloorPlan.class);
		floorplan1.setBedroom(4);
		floorplan1.setBathroom(2);
		floorplan1.setArea(1200);
		
		// create House bean
		House house1 = context.getBean(House.class);
		house1.setFplan(floorplan1);
		house1.setFloors(2);
		house1.setType("single");
		house1.setYear(2016);
		
		// create FloorPlan bean for Apartment
		FloorPlan floorplan2 = context.getBean(FloorPlan.class);
		floorplan2.setBedroom(2);
		floorplan2.setBathroom(1);
		floorplan2.setArea(800);
		
		// create Apartment bean 
		Apartment apartment1 = context.getBean(Apartment.class);
		apartment1.setFplan(floorplan2);
		apartment1.setParking("Yes");
		
		// display house info
		house1.showHouse();
		
		// display apartment info
		apartment1.showApartment();

		context.close();
	}
}
