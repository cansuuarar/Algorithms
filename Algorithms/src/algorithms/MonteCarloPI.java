package algorithms;
import java.util.Scanner;

public class MonteCarloPI {

	public static void main(String[] args) {

		/*
		 * 1.dışarıdan bir sayı oku, kaç nokta : n
		 * 2. r= 0 leyerek saymaya başla
		 * 3. for loop u içinde  0-1 arası için nokta atıcaz (ceyrek daire için yapacağız)
		 */
		
		System.out.println("nokta sayısını girin: ");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();   // atılacak nokta sayısı n.
		
		long start = System.currentTimeMillis();
		
		int numberInCircle = 0;  // aslında r
		for(int i = 0; i <n; i++) {
			double x = Math.random(); //double 0-1 arası olduğu için double seçtik, random sayı alacağız.
			double y = Math.random();
			double distance = x*x + y*y; // 1 ile kıyaslayacağımız için karekök ünü almaya gerek yok.
			if(distance <= 1) {
				numberInCircle++;
			}
		}
		
		long end = System.currentTimeMillis();
		long time = end - start;
		
		double myPI = 4.0 * numberInCircle / n;
		System.out.println("My PI: " + myPI);
		System.out.println("Java PI: " + Math.PI);
		
		System.out.println("Time: " + time + " ms.");
		
	}

}
