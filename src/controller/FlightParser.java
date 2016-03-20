import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

public class FlightParser
{
    public static void main(String[] args) 
    {
        try {
            new FlightParser().start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void start() {
    	 InputStream inputXml = null;
    	    try
    	    {
    	       inputXml  = new URL("http://cs509.cs.wpi.edu:8181/CS509.server/ReservationSystem?team=Team06&action=list&list_type=departing&airport=ANC&day=2016_05_10").openConnection().getInputStream();
    	       DocumentBuilderFactory factory = DocumentBuilderFactory.
    	                                        newInstance();
    	       DocumentBuilder builder = factory.newDocumentBuilder();
    	       Document doc = builder.parse(inputXml);
    	       NodeList planes = doc.getElementsByTagName("Flight");

    	       for(int i=0; i<planes.getLength();i++)
    	       {
    	          Element flight = (Element)planes.item(i);
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
    	          String fcn = seat.getFirstChild().getTextContent();
    	          String fcp = ((Element) seat.getFirstChild()).getAttribute("Price");
    	          String cn = seat.getLastChild().getTextContent();
    	          String cp = ((Element) seat.getLastChild()).getAttribute("Price");
    	          System.out.println("Airplane: " + plane);
    	          System.out.println("Flight Time: " + ftime);
    	          System.out.println("Number: " + num);
    	          System.out.println("Departure Airport Code: " + dcode);
    	          System.out.println("Departure Time: " + dtime);
    	          System.out.println("Arrival Airport Code: " + acode);
    	          System.out.println("Arrival Time: " + atime);
    	          System.out.println("First Class Price: " + fcp);
    	          System.out.println("First Class Seats Available: " + fcn);
    	          System.out.println("Coach Price: " + cp);
    	          System.out.println("Coach Seats Available: " + cn);
    	          System.out.println("-------------------------" + "\n");
    	        }
    	    }
    	    catch (Exception ex)
    	    {
    	       System.out.println(ex.getMessage());
    	    }
    	    finally
    	    {
    	       try
    	       {
    	          if (inputXml != null)
    	          inputXml.close();
    	       }
    	       catch (IOException ex)
    	       {
    	          System.out.println(ex.getMessage());
    	       }
    	    }
    	 }
    }
