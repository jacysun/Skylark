package model;

/**
 * This class holds values pertaining to a single flight from one airport to another. 
 * Class member attributes are the same as defined by the CS509 server API and store 
 * values after conversion from XML received from the server to Java primitives. 
 * Attributes are accessed via getter and setter methods.
 */

public class Flight {
	
	private String airplane;
	private String flightTime;
	private String departCode;
	private String departTime;
	private String arrivalCode;
	private String arrivalTime;
	private String firstClassPrice;
	private String coachPrice;
	private int firstClassSeats;
	private int coachSeats;
	
	public Flight (String airplane, String flightTime, String departCode, String departTime, String arrivalCode,
			       String arrivalTime, String firstClassPrice, String coachPrice, int firstClassSeats, int coachSeats) {
		
		this.airplane = airplane;
		this.flightTime = flightTime;
		this.departCode = departCode;
		this.departTime = departTime;
		this.arrivalCode = arrivalCode;
		this.arrivalTime = arrivalTime;
		this.firstClassPrice = firstClassPrice;
		this.coachPrice = coachPrice;
		this.firstClassSeats = firstClassSeats;
		this.coachSeats = coachSeats;
	}

	/**
	 * @return the airplane
	 */
	public String getAirplane() {
		return airplane;
	}

	/**
	 * @param airplane the airplane to set
	 */
	public void setAirplane(String airplane) {
		this.airplane = airplane;
	}

	/**
	 * @return the flightTime
	 */
	public String getFlightTime() {
		return flightTime;
	}

	/**
	 * @param flightTime the flightTime to set
	 */
	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

	/**
	 * @return the departCode
	 */
	public String getDepartCode() {
		return departCode;
	}

	/**
	 * @param departCode the departCode to set
	 */
	public void setDepartCode(String departCode) {
		this.departCode = departCode;
	}

	/**
	 * @return the departTime
	 */
	public String getDepartTime() {
		return departTime;
	}

	/**
	 * @param departTime the departTime to set
	 */
	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}

	/**
	 * @return the arrivalCode
	 */
	public String getArrivalCode() {
		return arrivalCode;
	}

	/**
	 * @param arrivalCode the arrivalCode to set
	 */
	public void setArrivalCode(String arrivalCode) {
		this.arrivalCode = arrivalCode;
	}

	/**
	 * @return the arrivalTime
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}

	/**
	 * @param arrivalTime the arrivalTime to set
	 */
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	/**
	 * @return the firstClassPrice
	 */
	public String getFirstClassPrice() {
		return firstClassPrice;
	}

	/**
	 * @param firstClassPrice the firstClassPrice to set
	 */
	public void setFirstClassPrice(String firstClassPrice) {
		this.firstClassPrice = firstClassPrice;
	}

	/**
	 * @return the coachPrice
	 */
	public String getCoachPrice() {
		return coachPrice;
	}

	/**
	 * @param coachPrice the coachPrice to set
	 */
	public void setCoachPrice(String coachPrice) {
		this.coachPrice = coachPrice;
	}

	/**
	 * @return the firstClassSeats
	 */
	public int getFirstClassSeats() {
		return firstClassSeats;
	}

	/**
	 * @param firstClassSeats the firstClassSeats to set
	 */
	public void setFirstClassSeats(int firstClassSeats) {
		this.firstClassSeats = firstClassSeats;
	}

	/**
	 * @return the coachSeats
	 */
	public int getCoachSeats() {
		return coachSeats;
	}

	/**
	 * @param coachSeats the coachSeats to set
	 */
	public void setCoachSeats(int coachSeats) {
		this.coachSeats = coachSeats;
	}
}
