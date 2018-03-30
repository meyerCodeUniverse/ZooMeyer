package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Zoo;

/**
 * Servlet implementation class viewAllZoosServlet
 */
@WebServlet("/viewAllZoosServlet")
public class viewAllZoosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewAllZoosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ZooHelper dao = new ZooHelper();
		
		List<Zoo> zoos = new ArrayList<Zoo>();
		zoos = dao.getAllZoos();      
        request.setAttribute("allZoos", zoos);
		
		request.setAttribute("allZoos", dao.showAllZoos());
		if(dao.showAllZoos().isEmpty()) {
			request.setAttribute("allItems", "empty");
		}
		getServletContext().getRequestDispatcher("/zooList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
