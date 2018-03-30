package model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

	@Entity
	@Table(name="mammal")
	@DiscriminatorValue("1")

public class Mammal extends Animal {
	
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int ID;
	@Column(name="num_of_legs")
	private int numOfLegs;
	@Column(name="bipedal")
	private boolean bipedal;
	@Column(name="has_fur")
	private boolean hasFur;
	
	// no arg constructor
	public Mammal() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public Mammal(int numOfLegs, boolean bipedal, boolean hasFur) {
		super();
		this.numOfLegs = numOfLegs;
		this.bipedal = bipedal;
		this.hasFur = hasFur;
	}


	public Mammal(String name, double weight, double length, double height, String diet, boolean isNocturnal,
			boolean laysEggs, String gender, String animal_type_id, Zoo zoo_id, int numOfLegs, boolean bipedal,
			boolean hasFur) {
		super(name, weight, length, height, diet, isNocturnal, laysEggs, gender, animal_type_id, zoo_id);
		this.numOfLegs = numOfLegs;
		this.bipedal = bipedal;
		this.hasFur = hasFur;
	}
	
	

	public Mammal(String name, double weight, double length, double height, String diet, boolean isNocturnal,
			boolean laysEggs, String gender, String animal_type_id, Zoo zoo_id) {
		super(name, weight, length, height, diet, isNocturnal, laysEggs, gender, animal_type_id, zoo_id);
		// TODO Auto-generated constructor stub
	}

	// Getters and setters
	public int getNumOfLegs() {
		return numOfLegs;
	}
	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}
	public boolean isBipedal() {
		return bipedal;
	}
	public void setBipedal(boolean bipedal) {
		this.bipedal = bipedal;
	}
	public boolean isHasFur() {
		return hasFur;
	}
	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
	
	// toString of Mammal and superclass Animal
	@Override
	public String toString() {
		return "Mammal [numOfLegs=" + numOfLegs + ", bipedal=" + bipedal + ", hasFur=" + hasFur + ", toString()="
				+ super.toString() + "]";
	}
		
	/* Overrode method animalProfile from superclass Animal
	 */
	public String animalProfile() {
		// TODO Auto-generated method stub
		return super.animalProfile() + "\n Number of Legs: " + numOfLegs + "\n Bipedal: " + bipedal + "\n Fur: " + hasFur;
	}

	/** Helper method for grooming variable
	 * @return boolean of fur value
	 */
	public boolean needsGroomed() {
		return hasFur;
	}
	
	public String Groomed() {
		if (hasFur) {
			return "Please bathe and groom 1x/month."; 
		} else { 
			return "This animal is low maintenance.";
		}
					
		}
	}
	

