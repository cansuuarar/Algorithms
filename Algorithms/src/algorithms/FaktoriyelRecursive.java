package algorithms;

import java.util.Scanner;

public class FaktoriyelRecursive {
	
	long factorial = 1;

	public static void main(String[] args) {
		
		FaktoriyelRecursive faktoriyelResursion = new FaktoriyelRecursive();
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("bir sayı giriniz: ");
		int b = scanner.nextInt();
		long factorial = faktoriyelResursion.faktoriyelResursive(b);
		System.out.println(factorial);
		
	}

	public long faktoriyelResursive(int a) {
		 
		if(a == 0) {
			factorial = 1;
		}else 
			factorial =  a * faktoriyelResursive(a-1);
		return factorial;
		
		
	}
}
