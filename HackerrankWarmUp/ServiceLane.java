import java.util.Scanner;


public class ServiceLane {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//int input;
		int min=3;
		int enter;
		int out;
		int len=in.nextInt();
		int[] widthArray = new int[len];
		int t=in.nextInt();
		
		for(int i=0;i<len;i++){
			widthArray[i]=in.nextInt();
		}
		
		for(int i=0;i<t;i++){
			enter=in.nextInt();
			out=in.nextInt();
			min=3;
			for(int j=enter;j<=out;j++){
				if(widthArray[j]<min){
					min=widthArray[j];
				}
			}
			System.out.println(min);
			
		}

	}

}
