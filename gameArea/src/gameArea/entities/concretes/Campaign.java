package gameArea.entities.concretes;

import gameArea.entities.abstracts.Entity;

public class Campaign implements Entity{

	private int id;
	private String name;
	private int discountRate;
	private String description;
	
	public Campaign() {
		super();
	}
	
	public Campaign(int id, String name, int discountRate, String description) {
		super();
		this.id = id;
		this.name = name;
		this.discountRate = discountRate;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
