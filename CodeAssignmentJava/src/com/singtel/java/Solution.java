package com.singtel.java;

class Animal {
	 void walk(){
		 System.out.println("I am walking");
	 }
}
class Bird extends Animal {
	 void fly() {
		 System.out.println("I am flying");
	 }
	 //Implemented the sing method in the Bird class
	 void  sing() {
		 System.out.println("I am singing");
	 }
	 
	 //created a swim method
	 void swim() {
		 System.out.println("I can't swim");
	 }
}

class Duck extends Bird{
	//override the sing method as duck can't sing
	@Override
	void sing() {
		System.out.println("I say Quack Quack");
	}
	//override the swim method as duck can swim
	@Override
	void swim() {
		System.out.println("I can swim");
	}
}

class Chicken extends Bird{
	//override the sing method as chicken can't sing
	@Override
	void sing() {
		System.out.println("I say Cluck Cluck");
	}
	//override the fly method as chicken can't fly
	@Override
	void fly() {
		System.out.println("I can't fly");
	}
}

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
		Bird duck = new Duck();
		duck.sing();
		duck.swim();
	}
	
	//method for chicken actions
	static void chickenActions() {
		Bird chicken = new Chicken();
		chicken.sing();
		chicken.fly();
	}
}
