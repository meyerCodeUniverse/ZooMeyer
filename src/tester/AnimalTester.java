package tester;
import java.util.ArrayList;

import model.Animal;

public class AnimalTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Animal animal1 = new Animal("Jake", 100.5, 36.2, 24.7, "dog food", false,	false, "male");
		
		ArrayList<Animal> allAnimals = new ArrayList<Animal>();
		// allAnimals.add(animal1);
		
		for(Animal temp : allAnimals) {
			System.out.println(temp.animalProfile());
		}
		
	}

}
