package com.singtel.java;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		birdActions();
		System.out.println();
		
		duckActions();		
		System.out.println();
		
		chickenActions();		
		System.out.println();
		
		parrotsActions();
		System.out.println();
		
		fishActions();
		System.out.println();
		
		sharkActions();
		
		clownFishActions();
		System.out.println();
		
		dolphinActions();
		System.out.println();
		
		//the use of try catch finally to act as the metamorphosis
		//of a caterpillar to a butterfly
		try {
			System.out.println("Now I am a caterpillar");
			caterpillarActions();
			
			System.out.println("Becoming a cocoon now....");
			Thread.sleep(5000);
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		finally {
			System.out.println("At last I am a butterfly");
			butterflyActions();
		}
		System.out.println();
		
		animalArray();
		
	}
	
	//Created a method to organize actions for bird 
	static void birdActions() {
		Bird bird = new Bird();
		System.out.println("Bird actions: ");
		bird.walk();
		bird.fly();
		//called the sing method from the bird object
		bird.sing();
	}
	
	//method for duck actions
	static void duckActions() {
		Duck duck = new Duck();
		System.out.println("Duck actions: ");
		duck.sing();
		duck.swim();
	}
	
	//method for chicken actions
	static void chickenActions() {
		Chicken chicken = new Chicken();
		System.out.println("Chicken actions: ");
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
	//B1
	static void fishActions() {
		Fish fish = new Fish();
		System.out.println("Fish actions: ");
		fish.walk();
		fish.sing();
		fish.sing();
	}
	
	//B2
	static void sharkActions() {
		Shark shark = new Shark();
		//B)2a
		System.out.println("Shark: ");
		System.out.println("I am "+shark.getSize()+" and "+shark.getColour());
		shark.eat();
	}
	
	static void clownFishActions() {
		ClownFish clownFish = new ClownFish();
		//B)2b
		System.out.println("ClownFish: ");
		System.out.println("I am "+clownFish.getSize()+" and "+clownFish.getColour());
		clownFish.behave();
	}
	
	static void dolphinActions() {
		Dolphin dolphin = new Dolphin();
		//B)2b
		System.out.println("Dolphin:");
		dolphin.swim();
	}
	
	static void caterpillarActions() {
		Caterpillar caterpillar = new Caterpillar();
		caterpillar.walk();
		caterpillar.fly();
	}
	static void butterflyActions() {
		Butterfly butterfly = new Butterfly();
		butterfly.fly();
		butterfly.sound();
	}
	
	static void animalArray() {
		
		try {
			Animal[] animals = new Animal[] {
				new Bird(),
				new Duck(),
				new Chicken(),
				new ParrotOne(),
				new Fish(),
				new Shark(),
				new Fish(),
				new Dolphin(),
				new Dog(),
				new Cat(),
				new Butterfly(),
				new Caterpillar() };
		
			for(int i = 0;i<animals.length;i++) {
				System.out.println(animals[i].getClass());
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

	
}
