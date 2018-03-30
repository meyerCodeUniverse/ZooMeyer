package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Diet;
import model.Gender;
import model.Skin;
import model.Zoo;

/**
 * Servlet implementation class PrepareAddReptileServlet
 */
@WebServlet("/PrepareAddReptileServlet")
public class PrepareAddReptileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrepareAddReptileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
				ZooHelper dao = new ZooHelper();
		
				// Find all zoos
				List<Zoo> zoo = new ArrayList<Zoo>();
				zoo = dao.showAllZoos();
						        
		        request.setAttribute("allZoos", zoo);
		        
		        // Find all genders
		        List<Gender> gender = new ArrayList<Gender>();
				gender = dao.showAllGenders();
						        
		        request.setAttribute("allGenders", gender);
		        
		        // Find all diets
		        List<Diet> diet = new ArrayList<Diet>();
				diet = dao.showAllDiets();
						        
		        request.setAttribute("allDiets", diet);
		        
		        // Find all skins
		        List<Skin> skin = new ArrayList<Skin>();
		        skin = dao.showAllSkins();
		        
		        request.setAttribute("allSkins", skin);
		               
		                     
		        getServletContext().getRequestDispatcher("/addReptile.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
