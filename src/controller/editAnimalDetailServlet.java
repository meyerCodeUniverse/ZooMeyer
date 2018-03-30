package controller;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Animal;
import model.Mammal;
import model.Reptiles;
import model.Zoo;

/**
 * Servlet implementation class editAnimalDetailServlet
 */
@WebServlet("/editAnimalDetailServlet")
public class editAnimalDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editAnimalDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		final int MAMMALTYPEID = 1;
		
		AnimalHelper dao = new AnimalHelper();
		ZooHelper zh = new ZooHelper();
				
		String name = request.getParameter("AnimalName");
		double weight = Double.parseDouble(request.getParameter("AnimalWeight"));
		double length = Double.parseDouble(request.getParameter("AnimalLength"));
		double height = Double.parseDouble(request.getParameter("AnimalHeight"));
		String diet = request.getParameter("AnimalDiet");
		boolean isNocturnal = Boolean.parseBoolean(request.getParameter("AnimalNocturnal"));
		String gender = request.getParameter("AnimalGender");
		boolean laysEggs = Boolean.parseBoolean("AnimalEggs");
		int animal_id = Integer.parseInt(request.getParameter("AnimalType"));
		
		Integer tempID = Integer.parseInt(request.getParameter("id"));
		
		int zooToFind = Integer.parseInt(request.getParameter("AnimalZoo"));
		Zoo zoo_id = new Zoo();
		zoo_id = zh.getZooByID(zooToFind);
		
		if (animal_id == MAMMALTYPEID) {
		
			int numOfLegs = Integer.parseInt(request.getParameter("AnimalLegs"));
			boolean bipedal = Boolean.parseBoolean(request.getParameter("AnimalBipedal"));
			boolean hasFur = Boolean.parseBoolean(request.getParameter("AnimalFur"));
		
			Mammal mammalToUpdate = new Mammal();
			mammalToUpdate = (Mammal) dao.searchForAnimalById(tempID);
			mammalToUpdate.setName(name);
			mammalToUpdate.setWeight(weight);
			mammalToUpdate.setLength(length);
			mammalToUpdate.setHeight(height);
			mammalToUpdate.setDiet(diet);
			mammalToUpdate.setNocturnal(isNocturnal);
			mammalToUpdate.setGender(gender);
			mammalToUpdate.setLaysEggs(laysEggs);
			mammalToUpdate.setZoo_id(zoo_id);
			mammalToUpdate.setNumOfLegs(numOfLegs);
			mammalToUpdate.setBipedal(bipedal);
			mammalToUpdate.setHasFur(hasFur);
		
			dao.updateAnimal(mammalToUpdate);
		
		} else {
			
			boolean hasLegs = Boolean.parseBoolean(request.getParameter("AnimalLegs"));
			boolean isVenomous = Boolean.parseBoolean(request.getParameter("AnimalPoisonous"));
			String skinType = request.getParameter("AnimalSkin");
			
			Reptiles reptileToUpdate = new Reptiles();
			reptileToUpdate = (Reptiles) dao.searchForAnimalById(Integer.parseInt(request.getParameter("id")));
			reptileToUpdate.setName(name);
			reptileToUpdate.setWeight(weight);
			reptileToUpdate.setLength(length);
			reptileToUpdate.setHeight(height);
			reptileToUpdate.setDiet(diet);
			reptileToUpdate.setNocturnal(isNocturnal);
			reptileToUpdate.setGender(gender);
			reptileToUpdate.setLaysEggs(laysEggs);
			reptileToUpdate.setZoo_id(zoo_id);
			reptileToUpdate.setVenomous(isVenomous);
			reptileToUpdate.setSkinType(skinType);
			reptileToUpdate.setHasLegs(hasLegs);
			dao.updateAnimal(reptileToUpdate);
			
		}

		getServletContext().getRequestDispatcher("/prepareAnimalListServlet").forward(request, response);
	}

}
