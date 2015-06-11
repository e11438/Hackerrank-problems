import java.util.Scanner;


public class MaxMOX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(10^10);
		Scanner in = new Scanner(System.in);
		int max=0;
		int l=in.nextInt();
		int r=in.nextInt();
		
		for(int i=l;i<=r;i++){
			for(int j=l;j<=r;j++){
				if(max<(i^j))
					max=(i^j);
			}
		}
		
		System.out.println(max);

	}

}
