//Session5_Assignment2 : 14.5.2016
//Author: Kamakshi Abbi
package com.acadglid.inheritance.building;

public class Building {	
	String name;
	String material;
	int length;
	int breadth;
	int area;
	String color;
	
	public void area(int length, int breadth){
		this.area = length * breadth;
	}

	public Building(String name ,String material, int length,int breadth, String color){
		this.name = name;
		this.material = material;
		this.length = length;
		this.breadth = breadth;
		this.color = color;
	}
	void Display(){
		System.out.println("The name of the building is "+ name);
		System.out.println("The Building material is " + material);
		System.out.println("The area of the building is " + area +" squarefeet");
		System.out.println("The color of the building is " + color);
		
	}
	

}
