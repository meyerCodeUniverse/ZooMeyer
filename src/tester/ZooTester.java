package tester;

import java.time.LocalTime;

import controller.AnimalHelper;
import controller.ZooHelper;
import model.Animal;
import model.Mammal;
import model.Reptiles;
import model.Zoo;

public class ZooTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Reptiles reptile1 = new Reptiles("Boa constrictor", 4.5, 48.7, 3.2, "mice", true, true, "male", false, true, "scales");
		//Mammal mammal1 = new Mammal("cow", 1200.5, 96.7, 60.2, "hay", false, false, "female", 4, false, true);
		
		//Zoo facility1 = new Zoo("Mike Johnson", "Des Moines Zoo", LocalTime.of(8, 15), LocalTime.of(12, 15));
		
		//System.out.println(reptile1.animalProfile());
		//System.out.println(mammal1.animalProfile());
		//System.out.println(facility1.printZooDetails());
		//System.out.println();
		
		//Zoo zoo1 = new Zoo("Mike Johnson", "Des Moines Zoo", LocalTime.of(8, 15), LocalTime.of(12, 15));
		//zoo1.addToZoo(reptile1);
		//zoo1.addToZoo(mammal1);
		
		//System.out.println(zoo1.displayZoo());
	
		AnimalHelper animalHelper = new AnimalHelper();
		ZooHelper zooHelper = new ZooHelper();
		 
		 // Adding works
		 Zoo zoo1 = new Zoo("Bob", "Blank", LocalTime.of(10, 10), LocalTime.of(20, 10));
		 zooHelper.insertZoo(zoo1);
		 
		// Deleting works 
		// Zoo zoo1 = zooHelper.getZooByID(1);
		 // zooHelper.deleteZoo(zoo1);
		 
		// Animal animal = new Mammal("cat", 20, 12, 6, "herbivore", true, false, "male", "mammal", zoo1);
		Animal animal = new Mammal("cat", 20, 3, 10, "omnivore", true, true, "male", "mammal", zoo1, 4, true, true);
		 // Animal animal = new Mammal("cat", 1, 1, 10.5, 36, 2, 1, true, false, 4, true, true, 1);
			
		 // Zoo zoo_id = zooHelper.getZooByID(zoo_id);
		 

		
		// Animal animal = new Reptiles("snake", 5, 20, 2, "omnivore", true, true, "male", "reptile", zoo1, false, true, "scales");
		animalHelper.insert(animal);
		
		 // animal.setDiet(3);
		 // animalHelper.update(animal);
	}

}
