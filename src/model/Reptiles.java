package model;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import controller.SkinTypeAttributeConverter;

@Entity
@Table(name="reptile")
@DiscriminatorValue("2")

public class Reptiles extends Animal {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int ID;
	@Column(name="has_legs")
	private boolean hasLegs;
	@Column(name="is_poisonous")
	private boolean venomous;
	@Column(name="skin_type_id")
	@Convert(converter = SkinTypeAttributeConverter.class)
	private String skinType;
	
	// Default no arg constructor
	public Reptiles() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Reptiles(int iD, boolean hasLegs, boolean isVenomous, String skinType) {
		super();
		this.hasLegs = hasLegs;
		this.venomous = isVenomous;
		this.skinType = skinType;
	}



	public Reptiles(String name, double weight, double length, double height, String diet, boolean isNocturnal,
			boolean laysEggs, String gender, String animal_type_id, Zoo zoo_id, boolean hasLegs,
			boolean isVenomous, String skinType) {
		super(name, weight, length, height, diet, isNocturnal, laysEggs, gender, animal_type_id, zoo_id);
		this.hasLegs = hasLegs;
		this.venomous = isVenomous;
		this.skinType = skinType;
	}



	public Reptiles(String name, double weight, double length, double height, String diet, boolean isNocturnal,
			boolean laysEggs, String gender, String animal_type_id, Zoo zoo_id) {
		super(name, weight, length, height, diet, isNocturnal, laysEggs, gender, animal_type_id, zoo_id);
		// TODO Auto-generated constructor stub
	}



	// Getters and Setters
	public boolean isHasLegs() {
		return hasLegs;
	}
	public void setHasLegs(boolean hasLegs) {
		this.hasLegs = hasLegs;
	}
	public boolean isVenomous() {
		return venomous;
	}
	public void setVenomous(boolean isVenomous) {
		this.venomous = isVenomous;
	}
	public String getSkinType() {
		return skinType;
	}
	public void setSkinType(String skinType) {
		this.skinType = skinType;
	}
	
	// toString from Super Class
	@Override
	public String toString() {
		return "Reptiles [hasLegs=" + hasLegs + ", isVenomous=" + venomous + ", skinType=" + skinType
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public String animalProfile() {
		// TODO Auto-generated method stub
		return super.animalProfile() + "\n Legs: " + hasLegs + "\n Venomous: " + venomous + "\n Skin Type: " + skinType;
	}
	
	public String handleWithCare( ) {
		if (venomous) {
			return "Handle with care.";
		} else {
				return "This animal is safe to pet.";
			}
		}
	}
	
	
	
	