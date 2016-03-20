<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Skylark</title>
<%@ page import="controller.ItineraryBuilder" %>
<%@ page import="controller.RetrieveData" %>
<%@ page import="model.Flight" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.io.PrintWriter" %>
</head>
<body>
<%
   String departure = request.getParameter("from");
   String arrival = request.getParameter("to");
   String depDate = request.getParameter("depart");
   String seat = request.getParameter("seat type");
   
   out.println("you searched oneway");
   out.println(departure + " " + arrival + " " + depDate + " " + seat);
   //RetrieveData rd = new RetrieveData();
   //String flight = rd.getDepartureFlights("06", departure, depDate); //XML String
   //call XMLParser, return ArrayList<Flight>
   //call ItineraryBuilder, return ArrayList<ArrayList<Flight>>
     
   //String result = "";
   //for () {
	 //  result = 
   //}
   //out.print(result);
%>



   

</body>
</html>