import java.util.Scanner;


public class MonkeyTrouble {
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
    	String input=in.nextLine();
    	String[] name= input.split(" ");
    	
    	if((name[0].equals("true")&&name[1].equals("true"))||(name[0].equals("false")&&name[1].equals("false")))
    		System.out.println("true");
    	else
    		System.out.println("false");
		
	}

}
