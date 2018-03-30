package tester;

import java.util.ArrayList;

import model.Reptiles;

public class ReptilesTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Reptiles reptile1 = new Reptiles("Boa constrictor", 4.5, 48.2, 3.7, "mice", true, true, "male", false, true, "scales");
		
		ArrayList<Reptiles> allReptiles = new ArrayList<Reptiles>();
		// allReptiles.add(reptile1);
		
		for(Reptiles temp : allReptiles) {
			System.out.println(temp.animalProfile());
		}
		
	}

}
