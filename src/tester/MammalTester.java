package tester;
import java.util.ArrayList;

import model.Mammal;

public class MammalTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	// Mammal mammal1 = new Mammal("cow", 1200.5, 96.2, 60.7, "hay", false, false, "female", 4, false, true);
	
	ArrayList<Mammal> allMammals = new ArrayList<Mammal>();
	// allMammals.add(mammal1);
	
	for(Mammal temp : allMammals) {
		System.out.println(temp.animalProfile());
	}
	}
}

