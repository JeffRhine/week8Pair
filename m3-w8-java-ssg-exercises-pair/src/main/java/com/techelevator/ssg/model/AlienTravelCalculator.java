package com.techelevator.ssg.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class AlienTravelCalculator {
	
	private int age;
	private String planet;
	private String transport;
	private Map<String, BigDecimal> planetMultiplier; 
	private Map<String, BigDecimal> transportMultiplier;

	public AlienTravelCalculator( int age, String planet, String transport){
		
		this.age=age;
		this.planet= planet;
		this.transport=transport;
		
		transportMultiplier = new HashMap<String, BigDecimal>();
		transportMultiplier.put("walking",new BigDecimal("3.0"));
		transportMultiplier.put("car",new BigDecimal("100.0"));
		transportMultiplier.put("bullet train",new BigDecimal("200.0"));
		transportMultiplier.put("boeing 747",new BigDecimal("570.0"));
		transportMultiplier.put("concorde",new BigDecimal("1350.0"));

		planetMultiplier = new HashMap<String, BigDecimal>();
		planetMultiplier.put("mercury",new BigDecimal ("56974146.0"));
		planetMultiplier.put("venus", new BigDecimal ("25724767.0"));
		planetMultiplier.put("mars", new BigDecimal ("48678219.0"));
		planetMultiplier.put("jupiter",new BigDecimal ("390674710.0"));
		planetMultiplier.put("saturn", new BigDecimal ("792248270.0"));
		planetMultiplier.put("uranus", new BigDecimal ("1692662530.0"));
		planetMultiplier.put("neptune", new BigDecimal ("2703959960.0"));
			
	}
	public BigDecimal getTravelYears(){
		return  (planetMultiplier.get(planet).divide(transportMultiplier.get(transport),2).divide(new BigDecimal("8760.0"),2));	
	}
	public BigDecimal getTravelAge(){
		return  (planetMultiplier.get(planet).divide(transportMultiplier.get(transport),2).divide(new BigDecimal("8760.0"),2).add(new BigDecimal(age)));	
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlanet() {
		return planet;
	}
	public void setPlanet(String planet) {
		this.planet = planet;
	}
	public String getTransport() {
		return transport;
	}
	public void setTransport(String transport) {
		this.transport = transport;
	}
}
