package com.jasmincarter.zookeeper;

public class Gorilla extends Mammal  {

	public void throwSomething(){
		energyLevel -= 5;
		System.out.println("The Gorilla has thrown something " + displayEnergy());

	}
	public void eatBananas() {
		energyLevel += 10;
		System.out.println("The Gorilla is happy " + displayEnergy());
	}
	public void climb() {
		energyLevel -= 10;
		System.out.println("The Gorilla climbed a tree " + displayEnergy());
	}
	
	
}
