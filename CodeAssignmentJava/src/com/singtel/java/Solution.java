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
	 //Implmented the sing method in the Bird class
	 void  sing() {
		 System.out.println("I am singing");
	 }
}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		birdActions();
	
	}
	
	//Created a method to organize actions for bird
	static void birdActions() {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		//called the sing method from the bird object
		bird.sing();
	}
	
	
}
