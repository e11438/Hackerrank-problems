import java.util.Scanner;


public class Teeen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int one;
		int two;
		one = in.nextInt();
		two = in.nextInt();
		
		if((one>=13&&one<=19)||(two>=13&&two<=19))
			System.out.println("True");
		else
			System.out.println("False");
		
	}

}
