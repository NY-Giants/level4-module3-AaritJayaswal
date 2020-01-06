package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double numerator, double denominator) {
		if(0.0 == denominator) {
			throw new IllegalArgumentException();
		}
		return numerator/denominator;
		
	}
}
