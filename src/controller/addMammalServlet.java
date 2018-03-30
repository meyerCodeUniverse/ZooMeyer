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
import model.Zoo;

/**
 * Servlet implementation class addMammalServlet
 */
@WebServlet("/addMammalServlet")
public class addMammalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addMammalServlet() {
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
		String name = request.getParameter("MammalName");
		double weight = Double.parseDouble(request.getParameter("MammalWeight"));
		double length = Double.parseDouble(request.getParameter("MammalLength"));
		double height = Double.parseDouble(request.getParameter("MammalHeight"));
		String diet = request.getParameter("MammalDiet");
		boolean isNocturnal = Boolean.parseBoolean(request.getParameter("MammalNocturnal"));
		String gender = request.getParameter("MammalGender");
		boolean laysEggs = Boolean.parseBoolean("MammalEggs");
		String animal_type_id = "mammal";
		
		int zooToFind = Integer.parseInt(request.getParameter("MammalZoo"));
		Zoo zoo_id = new Zoo();
		ZooHelper zh = new ZooHelper();
		zoo_id = zh.getZooByID(zooToFind);
		
		int numOfLegs = Integer.parseInt(request.getParameter("MammalLegs"));
		boolean bipedal = Boolean.parseBoolean(request.getParameter("MammalBipedal"));
		boolean hasFur = Boolean.parseBoolean(request.getParameter("MammalFur"));
		


		Animal mammal = new Mammal(name, weight, length, height, diet, isNocturnal, laysEggs, gender, animal_type_id, zoo_id, numOfLegs, bipedal, hasFur);		
		System.out.println(mammal.animalProfile());
		AnimalHelper dao = new AnimalHelper();
		dao.insert(mammal);
		
		getServletContext().getRequestDispatcher("/addMammal.jsp").forward(request, response);
		
		
	}

}
