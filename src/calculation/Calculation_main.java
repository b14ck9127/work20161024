package calculation;

import java.util.Scanner;

public class Calculation_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Number m> ");
		double m = Double.parseDouble(scan.next());
		System.out.print("Input Number n> ");
		double n = Double.parseDouble(scan.next());
		
		Calculation_lib clib = new Calculation_lib(m,n);
		System.out.println("m + n = "+clib.getPlus());
		System.out.println("m - n = "+clib.getMinus());
		System.out.println("m Å~ n = "+clib.getProduct());
		System.out.println("m ÅÄ n = "+clib.getDivide());
		System.out.println("m mod(n) = "+clib.getMod());

	}

}
