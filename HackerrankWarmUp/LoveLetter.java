import java.util.Scanner;


public class LoveLetter {
	
	public static void main(String args[]){
		
		Scanner in= new Scanner(System.in);
		
		int t=Integer.parseInt(in.nextLine());
		
		for(int i=0;i<t;i++){
			String word=in.nextLine();
			int sum=0;
			for(int j=0;j<word.length()/2;j++){
				int num1=(int)word.charAt(j);
				int num2=(int)word.charAt(word.length()-j-1);
				
				sum+=Math.abs(num1-num2);
			}
			System.out.println(sum);
		}
	}

}
