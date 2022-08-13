package com.booking;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DBConnection.FlightDAO;
/**
 * Servlet implementation class AddFlight
 */
@WebServlet("/AddFlight")
public class AddFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFlight() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("name");
		String from=request.getParameter("from");
		String to=request.getParameter("to");
		String departure=request.getParameter("departure");
		String time=request.getParameter("time");
		String price=request.getParameter("price");
		
		HashMap<String,String> flight=new HashMap<>();
		flight.put("name", name);
		flight.put("from", from);
		flight.put("to", to);
		flight.put("date", departure);
		flight.put("time", time);
		flight.put("price", price);
		
		try {
			FlightDAO dao=new FlightDAO();
			HttpSession session=request.getSession();
			if(dao.insertFlight(flight)) {
				
				session.setAttribute("message", "Flight Added Successfully");
			}
			else {
				session.setAttribute("message", "Invalid Details");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print("error");
			e.printStackTrace();
		}
		response.sendRedirect("HomeAdmin.jsp");
		
	}

}
