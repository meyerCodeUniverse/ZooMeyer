package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Zoo;
import model.Animal;


/**
 * Servlet implementation class editZooServlet
 */
@WebServlet("/editZooServlet")
public class editZooServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editZooServlet() {
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
		ZooHelper dao = new ZooHelper();
				
		String act = request.getParameter("doThisToItem");
		if(act == null) {
			//no button has been selected
			getServletContext().getRequestDispatcher("/viewAllZoosServlet").forward(request, response);
		}else if(act.equals("Delete Selected Zoo (Zoo must be empty of animals)")){
			Integer tempId = Integer.parseInt(request.getParameter("ID"));
			Zoo itemToDelete = dao.getZooByID(tempId);
			dao.deleteZoo(itemToDelete);
			getServletContext().getRequestDispatcher("/viewAllZoosServlet").forward(request, response);
		}else if(act.equals("Check for animals present in Zoo")) {
			getServletContext().getRequestDispatcher("/prepareAnimalListServlet").forward(request, response);
		}else if(act.equals("Edit Selected Zoo")) {
			Integer tempId = Integer.parseInt(request.getParameter("ID"));
			Zoo itemToEdit = dao.getZooByID(tempId);
			request.setAttribute("itemToEdit", itemToEdit);
			getServletContext().getRequestDispatcher("/edit-Zoo.jsp").forward(request, response);
		}else if(act.equals("Add New Zoo")) {
			getServletContext().getRequestDispatcher("/addZoo.html").forward(request, response);
		}
	}
}
