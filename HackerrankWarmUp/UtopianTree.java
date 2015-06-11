import java.util.Scanner;


public class UtopianTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t=in.nextInt();
		int num;
		
		for(int i=0;i<t;i++){
			
			num=in.nextInt();
			System.out.println(countLength(num));
		}
		
		
		
	}
	
	public static int countLength(int numOfCyc){
		
		int len=1;
		
		for(int i=1;i<=numOfCyc;i++){
			if(i%2==0){
				len++;
			}else{
				len*=2;
			}
				
			
		}
		return len;
	}

}
