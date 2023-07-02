package algorithms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OrderedArray {

	public static void main(String[] args) {
		// uzunluğu 5 olan bir dizide, kullanıcı tarafından seçilen iki index
		// kıyaslanarak, yerleri değiştirilerek ve dizi sıralı hale getirilecek.

		Random rand = new Random();
		int[] num = new int[5];

		for (int i = 0; i < num.length; i++) {
			num[i] = rand.nextInt(10) + 1;
		}

		System.out.println("elements of array: " + Arrays.toString(num));

		Scanner scanner = new Scanner(System.in);

		while (!isSorted(num)) {
			System.out.println("which indexes do you want to change?");
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			
			swap(num, i , j);
			System.out.println(Arrays.toString(num));
		}
		System.out.println("well done");
		System.out.println("sıralı dizi: " + Arrays.toString(num));

	}

	// swap methodu ile ikili olarak sıralama yapacağız.
	public static void swap(int[] num, int i, int j) {

		int temp = num[i];  // 2 1    2 yi temp e atadık,
		num[i] = num[j];    // 1 
		num[j] = temp ;     // 1 2
	}
	
	
	public static boolean isSorted(int[] num) {
		for(int i = 0; i<num.length-1; i++) {
			if(num[i] > num[i+1]) {
				return false;
			}
		}
		return true;
	}

}
