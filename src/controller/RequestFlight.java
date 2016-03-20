package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestFlight 
 */
@WebServlet("/RequestFlight")
public class RequestFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
		String trip = request.getParameter("trip");
		String departure = request.getParameter("from");
		String arrival = request.getParameter("to");
		String depDate = request.getParameter("depart");
		String retDate = request.getParameter("return");
		
		if (departure == "BOS") {
			response.sendRedirect("searchOneWay.jsp");
		}
		
		//if ("one-way".equals(trip)) {
	//	response.sendRedirect("searchOneWay.jsp");
		//} else if ("round-trip".equals(trip)) {
		//	response.sendRedirect("searchRoundTrip.jsp");
		//}
		//return;
	
		/*RetrieveData rd = new RetrieveData();
		String airport = rd.getAirports("team06");
		String flight = rd.getDepartureFlights("team06", departure, depDate);
		String airplane = rd.getAirplanes("06");

		if (airplane != null && flight != null && airport != null ) {
			response.sendRedirect("searchResult.jsp");
			return;
		}*/
	}
}
