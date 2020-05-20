package com.singtel.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {
	//Testing each method called from the bird class
	@Test
	public void testBirdWalk() {
		Bird bird = new Bird();
		bird.walk();
	}
	
	@Test
	public void testBirdSing() {
		Bird bird = new Bird();
		bird.sing();
	}
	
	@Test
	public void testBirdFly() {
		Bird bird = new Bird();
		bird.fly();
	}

}
