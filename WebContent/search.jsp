<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
  String trip = request.getParameter("trip");
  if (trip.equals("one-way")) {%>
	  <jsp:forward page="searchOneWay.jsp"/>
  <%}
  else if (trip.equals("round-trip")) {%>
      <jsp:forward page = "searchRoundTrip.jsp"/>
  <%} 
%>

</body>
</html>