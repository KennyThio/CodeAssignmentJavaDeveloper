package com.singtel.java;

public class Animal {
	void walk(){
		 System.out.println("I am walking");
	 }
}

class Dog extends Animal{
	void sound(){
		System.out.println("Woof Woof");
	}
}

class ParrotOne extends Dog{
	
}

class Cat extends Animal{
	void sound() {
		System.out.println("Meow Meow");
	}
}
class ParrotTwo extends Cat{
	
}

class Bird extends Animal {
	 void fly() {
		 System.out.println("I am flying");
	 }
	 //Implemented the sing method in the Bird class
	 void  sing() {
		 System.out.println("I am singing");
	 }
	 
	
}

class Duck extends Bird{
	//override the sing method as duck can't sing
	@Override
	void sing() {
		System.out.println("I say Quack Quack");
	}
	//create the swim method
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

class Rooster{
	
	
	void sound() {
		System.out.println("I say Cock-a-doodle-doo");
	}
	void gender() {
		System.out.println("I am a male chicken");
	}
	
}

class ParrotThree extends Rooster{
	
	
}