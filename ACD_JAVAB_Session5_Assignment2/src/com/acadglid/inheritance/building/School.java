//Session5_Assignment2 : 14.5.2016
//Author: Kamakshi Abbi
package com.acadglid.inheritance.building;

public class School extends Building{
	int noOfFloors;
	
	public School(String name,String material, int length,int breadth, String color, int noOfFloors){	
		super(name,material,length,breadth,color);
		this.area(length,breadth);
		this.noOfFloors = noOfFloors;
	}
	public void Display(){
		super.Display();
		System.out.println("The no. of floors in building are "+noOfFloors);
	
	}

}
