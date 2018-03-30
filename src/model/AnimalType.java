package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="animal_type")
	

public class AnimalType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@ Column(name="animal_type")
	private String animal_type;
	
	public int getId() {
		return id;
	}
	
	public String getAnimal_type() {
		return animal_type;
	}
	
}
