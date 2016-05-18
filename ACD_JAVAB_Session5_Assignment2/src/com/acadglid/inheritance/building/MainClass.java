//Session5_Assignment2 : 14.5.2016
//Author: Kamakshi Abbi
package com.acadglid.inheritance.building;

public class MainClass {
	public static void main(String[] args) {
		
		School s = new School("Hope Public School","Brick", 23, 20, "red", 15);
		Hospital h = new Hospital("Subharti Hospital","Gravel", 20, 50, "brown",6);
		System.out.println("School");
		s.Display();
		System.out.println("*********************");
		System.out.println("Hospital");
		h.Display();
	}

}
