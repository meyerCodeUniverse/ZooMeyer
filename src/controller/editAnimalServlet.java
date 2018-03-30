package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Animal;
import model.Mammal;
import model.Reptiles;

/**
 * Servlet implementation class editAnimalServlet
 */
@WebServlet("/editAnimalServlet")
public class editAnimalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editAnimalServlet() {
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
		AnimalHelper ah = new AnimalHelper();
		String act = request.getParameter("doThisToItem");
		
		if (act == null) {
				// no button has been selected
			getServletContext().getRequestDispatcher("/viewAllAnimalsServlet").forward(request, response);
		} else if (act.equals("Delete Selected Animal")) {
			Integer tempID = Integer.parseInt(request.getParameter("ID"));
			Animal itemToDelete = ah.searchForAnimalById(tempID);
			ah.deleteItem(itemToDelete);
					
			getServletContext().getRequestDispatcher("/prepareAnimalListServlet").forward(request, response);
		} else if (act.equals("Edit Selected Animal")) {
			Integer tempID = Integer.parseInt(request.getParameter("ID"));
			Animal itemToEdit = ah.searchForAnimalById(tempID);
			request.setAttribute("itemToEdit", itemToEdit);
			
			getServletContext().getRequestDispatcher("/PrepareAnimalEditServlet").forward(request, response);
			
		}
	}

}
