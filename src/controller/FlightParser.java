package controller;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

import model.Flight;

public class FlightParser {
	private List<Flight> flightList = new ArrayList<>();
	public static void main(String[] args) {
		try {
			new FlightParser().start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void start() {
		InputStream inputXml = null;
		try {
			inputXml = new URL(
					"http://cs509.cs.wpi.edu:8181/CS509.server/ReservationSystem?team=Team06&action=list&list_type=departing&airport=ANC&day=2016_05_10")
							.openConnection().getInputStream();
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(inputXml);
			NodeList planes = doc.getElementsByTagName("Flight");

			for (int i = 0; i < planes.getLength(); i++) {
				Element flight = (Element) planes.item(i);
				String plane = flight.getAttribute("Airplane");
				String ftime = flight.getAttribute("FlightTime");
				String num = flight.getAttribute("Number");
				Node dep = flight.getFirstChild();
				String dcode = dep.getFirstChild().getTextContent();
				String dtime = dep.getLastChild().getTextContent();
				Node arr = dep.getNextSibling();
				String acode = arr.getFirstChild().getTextContent();
				String atime = arr.getLastChild().getTextContent();
				Node seat = arr.getNextSibling();
				int fcn = Integer.parseInt(seat.getFirstChild().getTextContent());
				String fcp = ((Element) seat.getFirstChild()).getAttribute("Price");
				int cn = Integer.parseInt(seat.getLastChild().getTextContent());
				String cp = ((Element) seat.getLastChild()).getAttribute("Price");
				
				Flight parsFlight = new Flight(plane,ftime,dcode,dtime,acode,atime,fcp,cp,fcn,cn);
				//System.out.println(parsFlight.getAirplane());
				flightList.add(parsFlight);
				// System.out.println("Airplane: " + plane);
				// System.out.println("Flight Time: " + ftime);
				// System.out.println("Number: " + num);
				// System.out.println("Departure Airport Code: " + dcode);
				// System.out.println("Departure Time: " + dtime);
				// System.out.println("Arrival Airport Code: " + acode);
				// System.out.println("Arrival Time: " + atime);
				// System.out.println("First Class Price: " + fcp);
				// System.out.println("First Class Seats Available: " + fcn);
				// System.out.println("Coach Price: " + cp);
				// System.out.println("Coach Seats Available: " + cn);
				// System.out.println("-------------------------" + "\n");
			}
		
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				if (inputXml != null)
					inputXml.close();
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}
