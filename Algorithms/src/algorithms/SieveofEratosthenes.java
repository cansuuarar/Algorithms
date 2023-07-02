package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SieveofEratosthenes {

	public static void main(String[] args) {
		
		SieveofEratosthenes soe = new SieveofEratosthenes();
		System.out.println("Please enter a positive integer: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		soe.countNumberOfPrimesUpTo(n);

	}
	
	void countNumberOfPrimesUpTo(int n) {
		boolean[] list = new boolean[n];
		Arrays.fill(list, true);   //listenin içindeki bütün odacıklarda true var, yani prime number
		
		for(int i = 2; i <= n; i++) {
			for(int j= 2; i*j <= n; j++ ) {
				list[i*j] = false;
			}
			
			
		}
		
		
	}

}
