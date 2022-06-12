package com.jasmincarter.zookeeper;

public class BatTest {

	public static void main(String[] args) {
		Gorilla g = new Gorilla();
		System.out.println("Gorilla's total energy level is: "+ g.displayEnergy());
		g.throwSomething();
		g.throwSomething();
		g.throwSomething();
		g.eatBananas();
		g.eatBananas();
		g.climb();
		System.out.println("Gorilla's total energy level is: "+ g.displayEnergy());
		
		Bat b = new Bat();
		System.out.println("Bat's total energy level is: "+ b.displayEnergy());
		b.fly();
		b.fly();
		b.eatHumans();
		b.eatHumans();
		b.attackTowns();
		b.attackTowns();
		b.attackTowns();
		System.out.println("Bat's final energy level is: " + b.displayEnergy());
	  

	}

}
