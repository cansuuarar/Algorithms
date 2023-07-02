package algorithms;
import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();

		System.out.println("Lütfen pozitif bir tam sayı giriniz: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(pn.isPrime(n));
		
		pn.countNumberOfPrimesUpTo(n);
		
	}

	

	boolean isPrime(int n) {
		boolean prime = true;
		int i = 2;
		for(;i < n; i++ ) {
			if(n % i == 0) {
				prime = false;
				break;
			}
		}
//		if(!prime) {
//			System.out.println("ilk bölen sayi: " + i);
//		}
		return prime;
		
	}
	
	
	boolean isPrimeSecondWay(int n) {
		boolean prime = false;
		int upperBound = (int) (Math.sqrt(n) + 1);
		int i = 2;
		for(; i < upperBound; i++) {
			if(n % i == 0) {
				prime = false;
				break;				
			}
		}
		if(!prime) {
			System.out.println("ilk bölen sayi: " + i);
		}
		
		return prime;
		
	}
	
	
	void countNumberOfPrimesUpTo(int n) {
		int numberOfPrimes = 0;
		for(int i=2; i<n ; i++) {
			boolean isPrime = isPrime(i);
			if(isPrime) {
				numberOfPrimes++;
			}
		}System.out.println(n + " sayısına kadar " + numberOfPrimes + " asal sayı vardır.");
	}

}
