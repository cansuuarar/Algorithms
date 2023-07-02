package algorithms;

import java.util.Scanner;

public class AverageNumber {

	public static void main(String[] args) {

		//2-Klavyeden girilen 5 sayının ortalamasını bulan java kodunu yazın.
		
		Scanner scanner = new Scanner(System.in);
		double total = 0;
		
		for(int i=1; i<=5; i++) {
			System.out.print(i+ ". sayıyı giriniz: ");
			double num = scanner.nextDouble();
			total = total +num;
		}
		double average = total / 5;
		System.out.println(average);
	}

}
