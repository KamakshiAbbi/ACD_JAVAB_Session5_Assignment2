//Session5_Assignment2 : 14.5.2016
//Author: Kamakshi Abbi
package com.acadglid.inheritance.building;
	
public class Hospital extends Building{
	int noOfBlocks;

	public Hospital(String name,String material, int length, int breadth, String color, int noOfBlocks) {
		super(name, material, length, breadth, color);
		this.area(length,breadth);
		this.noOfBlocks = noOfBlocks;
	}
	public void Display(){
		super.Display();
		System.out.println("The no. of blocks in building are "+noOfBlocks);
	}
	
}
