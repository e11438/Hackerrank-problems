import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HackTweets {
	
	public static void main(String args[]){
		Scanner in= new Scanner (System.in);
		
		int t =Integer.parseInt(in.nextLine());
		String typed = "hackerrank";
		Pattern pattern = Pattern.compile(".*"+typed + ".*");
		Matcher match; 
		int found=0;
		for(int i=0;i<t;i++){
			String tweet=in.nextLine();
			
			match = pattern.matcher(tweet.toLowerCase());
			//System.out.println(tweet.toLowerCase());
			
			if(match.find()){				
				found++;
			}
			
		}
		System.out.println(found);
		
	}

}
