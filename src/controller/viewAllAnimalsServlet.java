package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Animal;
import model.AnimalType;
import model.Mammal;
import model.Zoo;
import model.Diet;
import model.Gender;
import model.Reptiles;


/**
 * Servlet implementation class viewAllAnimalsServlet
 */
@WebServlet("/viewAllAnimalsServlet")
public class viewAllAnimalsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewAllAnimalsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Animal> animals = new ArrayList<Animal>();
		AnimalHelper dao = new AnimalHelper();
		animals = dao.showAllAnimals();
		if(dao.showAllAnimals().isEmpty()) {
			request.setAttribute("allItems", "empty");
		}
		getServletContext().getRequestDispatcher("/animalList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
