package gameArea.entities.concretes;

import gameArea.entities.abstracts.Entity;

public class User implements Entity{

	private int id;
	private String firstName;
	private String lastName;
	private int birthYear;
	private String nationalityId;
	private double wallet;
	public User() {
		super();
	}
	public User(int id, String firstName, String lastName, int birthYear, String nationalityId,double wallet) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.nationalityId = nationalityId;
		this.wallet= wallet;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int age) {
		this.birthYear = age;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public double getWallet() {
		return wallet;
	}
	public void setWallet(double wallet) {
		this.wallet = wallet;
	}
	
	
	
	
}
