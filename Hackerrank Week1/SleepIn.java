import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SleepIn {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	String input;
    	String weekday;
    	String vacation;
    	
    	input=in.nextLine();
    	String[] names=input.split(" ");
    	weekday=names[0];
    	vacation=names[1];
    	
    	if(weekday.equals("false")||vacation.equals("true"))
    		System.out.println("true");
    	else
    		System.out.println("false");
    }
}