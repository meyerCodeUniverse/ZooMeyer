package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Animal;
import model.Mammal;
import model.Zoo;
import model.Reptiles;

/**
 * Servlet implementation class addReptileServlet
 */
@WebServlet("/addReptileServlet")
public class addReptileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addReptileServlet() {
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
		String name = request.getParameter("ReptileName");
		double weight = Double.parseDouble(request.getParameter("ReptileWeight"));
		double length = Double.parseDouble(request.getParameter("ReptileLength"));
		double height = Double.parseDouble(request.getParameter("ReptileHeight"));
		String diet = request.getParameter("ReptileDiet");
		boolean isNocturnal = Boolean.parseBoolean(request.getParameter("ReptileNocturnal"));
		String gender = request.getParameter("ReptileGender");
		boolean laysEggs = Boolean.parseBoolean("ReptileEggs");
		String animal_type_id = "reptile";
		
		int zooToFind = Integer.parseInt(request.getParameter("ReptileZoo"));
		Zoo zoo_id = new Zoo();
		ZooHelper zh = new ZooHelper();
		zoo_id = zh.getZooByID(zooToFind);
		
		boolean hasLegs = Boolean.parseBoolean(request.getParameter("ReptileLegs"));
		boolean isVenomous = Boolean.parseBoolean(request.getParameter("ReptilePoisonous"));
		String skinType = request.getParameter("ReptileSkin");
		
		Animal reptile = new Reptiles(name, weight, length, height, diet, isNocturnal, laysEggs, gender, animal_type_id, zoo_id, hasLegs, isVenomous, skinType);		
		AnimalHelper dao = new AnimalHelper();
		dao.insert(reptile);
		
		getServletContext().getRequestDispatcher("/addReptile.jsp").forward(request, response);
	}

}
