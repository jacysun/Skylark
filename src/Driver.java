import controller.MyTime;

public class Driver {

	public static void main(String[] args) {
		double latitude = 39.6034810;
		double longitude = -119.6822510;
		
		StringBuffer buffer = MyTime.getResponse(latitude, longitude);
		System.out.println(buffer);

	}

}
