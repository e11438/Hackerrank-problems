import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class Pangrams {

	/**
	 * @param args
	 */
	
	public static Integer[] removeDuplicates(Integer[] arr) {
		  return new HashSet<Integer>(Arrays.asList(arr)).toArray(new Integer[0]);
	}
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        String t;
        HashSet<String> finLetters =new HashSet<String>();
        t = in.nextLine();
        char[] letters = t.toLowerCase().toCharArray();
        
        for(int i=0;i<letters.length;i++){
        	finLetters.add(letters[i]+"");
        	
        }
        if(finLetters.size()==27)
        	System.out.println("pangram");
        else
        	System.out.println("not pangram");
		
	}

}
