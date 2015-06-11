import java.util.Scanner;


public class SumDouble {
	
	public static void main(String args[]){
		
		
		Scanner in = new Scanner(System.in);
    	String input=in.nextLine();    	
    	String[] name= input.split(" ");
    	
    	if(name[0].equals(name[1])){
    		System.out.println(2*(Integer.parseInt(name[0])+Integer.parseInt(name[1])));
    	}
    	else
    		System.out.println(Integer.parseInt(name[0])+Integer.parseInt(name[1]));
    	
	}

}
