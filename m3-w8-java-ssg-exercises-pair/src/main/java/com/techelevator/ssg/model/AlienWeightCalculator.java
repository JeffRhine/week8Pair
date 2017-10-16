package com.techelevator.ssg.model;

import java.util.HashMap;
import java.util.Map;

public class AlienWeightCalculator {

	private int weight;
	private String planet;
	private Map<String, Double> planetMultiplier; 

	public AlienWeightCalculator(int weight, String planet){
		this.weight= weight;
		this.planet= planet;

		planetMultiplier = new HashMap<String, Double>();
		planetMultiplier.put("mercury", .37);
		planetMultiplier.put("venus", .9);
		planetMultiplier.put("mars", .17);
		planetMultiplier.put("jupiter", 2.65);
		planetMultiplier.put("saturn", 2.23);
		planetMultiplier.put("uranus", 2.09);
		planetMultiplier.put("neptune", 2.43);
		planetMultiplier.put("pluto", .04);
	}
	public double getAlienWeight(){
		return weight * planetMultiplier.get(planet);
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPlanet() {
		return planet;
	}

	public void setPlanet(String planet) {
		this.planet = planet;
	}
}
