package algorithms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		ReverseNumber test = new ReverseNumber();

		System.out.println("bir sayi girin: ");
		Scanner sc = new Scanner(System.in);
		int sayi = sc.nextInt();
		test.sayininTersi(sayi);

	}

	public void sayininTersi(int sayi) {
		int sayininTersi = 0;

		while (sayi != 0) {
			sayininTersi = sayininTersi * 10;
			sayininTersi = sayininTersi + sayi % 10;
			sayi = sayi / 10;

		}
		System.out.println(sayininTersi);

	}

}
