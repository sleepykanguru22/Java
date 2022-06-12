package com.jasmincarter.zookeeper;

public class Mammal {
	
	int energyLevel;
		
	public Mammal() {
		this.energyLevel = 100;
	}
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
