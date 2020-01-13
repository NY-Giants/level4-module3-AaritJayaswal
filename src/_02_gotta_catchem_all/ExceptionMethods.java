package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double numerator, double denominator) {
		if(0.0 == denominator) {
			throw new IllegalArgumentException();
		}
		return numerator/denominator;
		
	}
	public String reverseString(String fillininput) {
	if(fillininput.equals("")) {
		throw new IllegalStateException();
	}
	String fillinoutput = "";
		for(int i = fillininput.length()-1; i >= 0; i--) {
			fillinoutput += fillininput.charAt(i);
		}
		return fillininput;
		
	}
	
}
