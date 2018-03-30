package controller;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Zoo;


/**
 * Servlet implementation class editZooDetailServlet
 */
@WebServlet("/editZooDetailServlet")
public class editZooDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editZooDetailServlet() {
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
		
		String zooKeeper = request.getParameter("ZooKeeper");
		String name = request.getParameter("NameOfZoo");
		LocalTime openTime = LocalTime.parse(request.getParameter("OpenTime"));
		LocalTime closeTime = LocalTime.parse(request.getParameter("CloseTime"));
		Integer tempID = Integer.parseInt(request.getParameter("id"));
		
		Zoo zooToUpdate = dao.getZooByID(tempID);
		zooToUpdate.setZooKeeper(zooKeeper);
		zooToUpdate.setName(name);
		zooToUpdate.setOpenTime(openTime);
		zooToUpdate.setCloseTime(closeTime);
		
		dao.updateZoo(zooToUpdate);
		
		getServletContext().getRequestDispatcher("/viewAllZoosServlet").forward(request, response);
	}

}
