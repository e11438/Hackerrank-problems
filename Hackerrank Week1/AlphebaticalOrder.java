import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlphebaticalOrder {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	String input;
    	
    	input=in.nextLine();
    	char[] word = input.toCharArray();
    	//System.out.println((word[1]+"").compareTo(word[0]+""));
    	for(int i=1;i<word.length;i++){
    		if((word[i]+"").equals(word[i-1]+"")){
    			
    			System.out.println("false");
    			break;
    		}
    		else{
    			if((word[i]+"").compareTo(word[i-1]+"")<0){
    				System.out.println("false");
    				break;
    			
    			}
    		}
    		
    		if(i==word.length-1)
    			System.out.println("true");
    		
    	}
     }
}