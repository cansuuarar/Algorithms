package algorithms;

import java.util.Scanner;

public class DivisorsAnumber {

	public static void main(String[] args) {

		DivisorsAnumber bolenSayilar = new DivisorsAnumber();

		System.out.println("bir tam sayi giriniz: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		bolenSayilar.bolenSayilariBul(n);

	}

	// bir tam sayının bölenlerini bulan bir program.

	void bolenSayilariBul(int n) {

		for (int i = 2; i <= n; i++) {

			if (n % i == 0) {
				System.out.println(i);
			}

		}

	}

	


}
