package algorithms;

public class FizzBuzz {

	public static void main(String[] args) {
		
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.fizzBuzz(20);

	}
	
	
	public void fizzBuzz(int number) {
		for (int i = 1; i < number; i++) {
			if (i % 3 == 0) {
				System.out.println("fizz");
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			} else if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzbuzz");
			} else {
				System.out.println(i);
			}

		}

	}

}
