import java.util.Scanner;


public class AlternateCharacters {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int t=Integer.parseInt(in.next());
		
		for(int i=0;i<t;i++){
			String word=in.next();
			int sum=0;
			for(int j=1;j<word.length();j++){
				if(word.charAt(j-1)==word.charAt(j)){
					sum++;
				}				
			}
			System.out.println(sum);
		}
		
	}

}
