package model;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import controller.AnimalTypeAttributeConverter;
import controller.DietAttributeConverter;
import controller.GenderAttributeConverter;

	@Entity
	@Table(name = "animal")
	@Inheritance(strategy = InheritanceType.JOINED)
	@DiscriminatorColumn(name="animal_type_id")
	
public class Animal {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id")
		private int ID;
		@Column(name = "name")
		private String Name;
		@Column(name = "weight")
		private double weight;
		@Column(name = "length")
		private double length;
		@Column(name = "height")
		private double height;
		@Column(name = "diet_id")
		@Convert(converter = DietAttributeConverter.class)
		private String diet;
		@Column(name = "nocturnal")
		private boolean isNocturnal;
		@Column(name = "lay_eggs")
		private boolean laysEggs;
		@Column(name = "gender_id")
		@Convert(converter = GenderAttributeConverter.class)
		private String gender;
		@Column(name="animal_type_id")
		// @Convert(converter = AnimalTypeAttributeConverter.class)
		private String animal_id;
		@JoinColumn(name="zoo_id")
		private Zoo zoo_id;
		
		


		public Animal() {
			super();
		}
		
		
		
		public Animal(String name, double weight, double length, double height, String diet, boolean isNocturnal,
				boolean laysEggs, String gender, String animal_type_id, Zoo zoo_id) {
			super();
			Name = name;
			this.weight = weight;
			this.length = length;
			this.height = height;
			this.diet = diet;
			this.isNocturnal = isNocturnal;
			this.laysEggs = laysEggs;
			this.gender = gender;
			this.animal_id = animal_type_id;
			this.zoo_id = zoo_id;
		}



		//Getters and Setters
		
		public int getID() {
			return ID;
		}



		public void setID(int iD) {
			ID = iD;
		}



		public String getName() {
			return Name;
		}



		public void setName(String name) {
			Name = name;
		}



		public double getWeight() {
			return weight;
		}



		public void setWeight(double weight) {
			this.weight = weight;
		}



		public double getLength() {
			return length;
		}



		public void setLength(double length) {
			this.length = length;
		}



		public double getHeight() {
			return height;
		}



		public void setHeight(double height) {
			this.height = height;
		}



		public String getDiet() {
			return diet;
		}



		public void setDiet(String diet) {
			this.diet = diet;
		}



		public boolean isNocturnal() {
			return isNocturnal;
		}



		public void setNocturnal(boolean isNocturnal) {
			this.isNocturnal = isNocturnal;
		}



		public boolean isLaysEggs() {
			return laysEggs;
		}



		public void setLaysEggs(boolean laysEggs) {
			this.laysEggs = laysEggs;
		}



		public String getGender() {
			return gender;
		}



		public void setGender(String gender) {
			this.gender = gender;
		}



		public String getAnimal_id() {
			return animal_id;
		}



		public void setAnimal_id(String animal_type_id) {
			this.animal_id = animal_type_id;
		}



		public Zoo getZoo_id() {
			return zoo_id;
		}



		public void setZoo_id(Zoo zoo_id) {
			this.zoo_id = zoo_id;
		}



		// toString
		@Override
		public String toString() {
			return "Animal [Name=" + Name + ", weight=" + weight + ", length=" + length + ", height=" + height
					+ ", diet=" + diet + ", isNocturnal=" + isNocturnal + ", laysEggs=" + laysEggs + ", gender="
					+ gender + "]";
		}
		
		
		/** Helper method for animal profile details
		 * @return all variables of type Animal
		 */
		public String animalProfile() {
			return "Name: " + Name + "\n Weight: " + weight + " lbs\n Length: " + length + " inches\n Height: " + height + " inches\n Diet: " + diet + "\n Nocturnal: " + isNocturnal + "\n Lays Eggs: " + laysEggs + "\n Gender: " + gender;
		}
		
		
		
}
