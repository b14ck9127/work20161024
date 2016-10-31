package calculation;

public class Calculation_lib {
    
	private double m,n;

	public Calculation_lib(double m, double n) {
		this.m = m;
		this.n = n;
	}
	
	public double getPlus(){
		return m + n;
		
	}
	
	public double getMinus(){
		return m - n;
	
	}
	
	public double getProduct(){
		return m * n;
		
	}
	
	public double getDivide(){
		return m / n;
	
	}
	
	public double getMod(){
		return m % n;
		
	}
}
