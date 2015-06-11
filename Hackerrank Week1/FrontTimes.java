import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FrontTimes {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	String input=in.nextLine();
    	String [] parts= input.split(" ");
    	
    	String str =parts[1];
    	int num =Integer.parseInt(parts[0]);
    	if(str.length()<num){
    		for(int i=0;i<num;i++)
    			System.out.print(str);
    	}
    	else{
    		for(int i=0;i<num;i++)
    			System.out.print(str.substring(0, num));
    	}
    }
}