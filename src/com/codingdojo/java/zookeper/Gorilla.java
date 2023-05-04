package com.codingdojo.java.zookeper;


public class Gorilla extends Mammal {
	
	public void throwSomething() {
		energyLevel -= 5;
		System.out.println("Look out! The gorilla threw something at you!");
		displayEnergy();
	}
	
	public void eatBananas() {
		energyLevel +=10;
		System.out.println("The gorilla ate a banana and is much happier now. He isn't himself when he's hungry.");
		displayEnergy();
		
	}
	
	public void climb() {
		energyLevel -= 10;
		System.out.println("The gorilla climbed a tree then realized he's afraid of heights. The combination of the climb and the intense fear have decreased his energy level.");
		displayEnergy();
		
	}

}
