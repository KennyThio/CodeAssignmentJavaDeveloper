package com.singtel.java;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bird actions: ");
		birdActions();
		System.out.println();
		System.out.println("Duck actions: ");
		duckActions();
		
		System.out.println();
		System.out.println("Chicken actions: ");
		chickenActions();
		
		System.out.println();
		parrotsActions();
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
		
		System.out.println("Rooster actions: ");
		//create a rooster object from rooster class
		Rooster rooster = new Rooster();
		rooster.sound();
		rooster.gender();
	}
	
	static void parrotsActions() {
		ParrotOne parrotOne = new ParrotOne();
		ParrotTwo parrotTwo = new ParrotTwo();
		ParrotThree parrotThree = new ParrotThree();
		System.out.println("Parrot actions: ");
		System.out.println("Parrot 1 live with dogs: ");
		parrotOne.sound();
		System.out.println("Parrot 2 live with cats: ");
		parrotTwo.sound();
		System.out.println("Parrot 3 live near a rooster: ");
		parrotThree.sound();
		
	}
}
