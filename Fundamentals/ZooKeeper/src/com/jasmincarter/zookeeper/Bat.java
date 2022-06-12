package com.jasmincarter.zookeeper;

class Bat extends Mammal {
	public Bat(){
		super();
		this.energyLevel = 300;
		
	}
	public void fly() {
		energyLevel -=50;
		System.out.println("Swoosh swoosh" + displayEnergy());
	}

	public void eatHumans() {
		energyLevel +=25;
		System.out.println("ahhh! the bat is eating people" + displayEnergy());
		
	}
	public void attackTowns() {
		energyLevel -=100;
		System.out.println("ahhh! the town is burning" + displayEnergy());
	}
}


