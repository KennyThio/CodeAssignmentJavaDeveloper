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
class Cat extends Animal{
	void sound() {
		System.out.println("Meow Meow");
	}
}



class Bird extends Animal {
	 void fly() {
		 System.out.println("I am flying");
	 }
	 //A)1a
	 //Implemented the sing method in the Bird class
	 void  sing() {
		 System.out.println("I am singing");
	 }
	 
	
}
//A)2a
class Duck extends Bird{
	//override the sing method as duck can't sing
	@Override
	void sing() {
		System.out.println("I say Quack Quack");
	}
	//A)2b
	//create the swim method
	void swim() {
		System.out.println("I can swim");
	}
}

class Chicken extends Bird{
	//A)2c
	//override the sing method as chicken can't sing
	@Override
	void sing() {
		System.out.println("I say Cluck Cluck");
	}
	//A)2d
	//override the fly method as chicken can't fly
	@Override
	void fly() {
		System.out.println("I can't fly");
	}
}

class Rooster{
	//A)3a
	void sound() {
		System.out.println("I say Cock-a-doodle-doo");
	}
	//A)3b
	void gender() {
		System.out.println("I am a male chicken");
	}
	
}

//A)4a
class ParrotOne extends Dog{
	
}

//A)4b
class ParrotTwo extends Cat{
	
}
//A)4c
class ParrotThree extends Rooster{

}
//A)4d
class ParrotFour extends Duck{
	
}

class Fish extends Animal{
	@Override
	void walk() {
		System.out.println("I can't walk");
	}
	void sing() {
		System.out.println("I can't sing");
	}
	
	void swim() {
		System.out.println("I can swim");
	}
}

class Shark extends Fish{
	String size = "large";
	String colour = "grey";
	//B)2d
	void eat() {
		System.out.println("I eat other fishes");
	}

	public String getSize() {
		return size;
	}
	
	public String getColour() {
		return colour;
	}
	
	
	
}

class ClownFish extends Fish{
	String size = "small";
	String colour = "orange";
	//B)2b
	void behave() {
		System.out.println("I make jokes");
	}

	public String getSize() {
		return size;
	}

	public String getColour() {
		return colour;
	}
	
	
	
}
//B)3a
class Dolphin extends Animal{
	void swim() {
		System.out.println("I can swim");
	}
}

//D. Model animals that change their behaviour over time
class Caterpillar extends Animal{
	@Override
	void walk() {
		System.out.println("I can crawl");
	}
	void fly() {
		System.out.println("I cannot fly");
	}
}

class Butterfly extends Caterpillar{
	@Override
	void fly() {
		System.out.println("I can fly");
	}
	void sound() {
		System.out.println("I don't make a sound");
	}
}
