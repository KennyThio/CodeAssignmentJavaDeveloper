package com.singtel.java;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bird actions: ");
		birdActions();
		
		System.out.println("Duck actions: ");
		duckActions();
		
		System.out.println("Chicken actions: ");
		chickenActions();
	}
	
	//Created a method to organize actions for bird 
	static void birdActions() {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		//called the sing method from the bird object
		bird.sing();
	}
	
	//method for duck actions
	static void duckActions() {
		Duck duck = new Duck();
		duck.sing();
		duck.swim();
	}
	
	//method for chicken actions
	static void chickenActions() {
		Chicken chicken = new Chicken();
		chicken.sing();
		chicken.fly();
	}
}
