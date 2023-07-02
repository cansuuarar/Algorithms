package algorithms;
import java.util.Scanner;

public class StringStar {

	public static void main(String[] args) {

		
		StringStar st = new StringStar();
		
		System.out.println("please enter a string expression: ");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		st.star(a);
		
	}
	
	void star(String a) {
		for(int i = 0; i < a.length(); i++) {
			String aNew = a.charAt(i) + "*";
			System.out.print(aNew);
		}
		
		System.out.println();
	}

}
