import java.util.Scanner;


public class HandShakes {

	/**
	 * @param args
	 */
	/*
	 * 	if 5
	 * 
	 * 	|****|
	 *  | ***|
	 *  |  **|
	 *  |   *|
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int t =in.nextInt();
		int num;
		int sum=0;
		
		for(int i=0;i<t;i++){
			num=in.nextInt();
			
			for(int j=1;j<num;j++){
				int count=j;
				while(count<num){
					sum++;
					count++;
				}
			}
			System.out.println(sum);
			sum=0;
		}
		
		
	}

}
