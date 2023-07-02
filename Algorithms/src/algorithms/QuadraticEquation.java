package algorithms;
import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		QuadraticEquation test = new QuadraticEquation();
		test.ikinciDerecedenKokBul(3, 4, 3, 2);


	}
	

	public void ikinciDerecedenKokBul(int a, int b, int c, int x) {

		
		double delta = Math.pow(b, 2) - 4 * a * c;

		if (delta > 0) {
			double x1 = (-b + Math.sqrt(delta) / 2 * a);
			double x2 = (-b - Math.sqrt(delta) / 2 * a);
			System.out.println("birinci kok: " + x1 + "ikinci kok: " + x2);
		} else if (delta == 0) {
			double x1 = (-b / 2 * a);
			double x2 = (-b / 2 * a);
			System.out.println("kokler birbirine esittir, x1=x2 " + x1);
		} else if (delta < 0) {
			System.out.println("sistemin koku yoktur.");
		}

	}

}
