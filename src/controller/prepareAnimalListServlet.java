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
import model.Diet;
import model.Gender;
import model.Skin;
import model.Zoo;

/**
 * Servlet implementation class prepareAnimalListServlet
 */
@WebServlet("/prepareAnimalListServlet")
public class prepareAnimalListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public prepareAnimalListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
						
				AnimalHelper dao = new AnimalHelper();
     
		        request.setAttribute("allAnimals", dao.showAllAnimals());
		        if(dao.showAllAnimals().isEmpty()) {
					request.setAttribute("allAnimals", " ");
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
