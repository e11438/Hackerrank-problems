import java.util.Scanner;


public class Sherlock {
	
	public static void main(String args[]){
		Scanner in = new Scanner (System.in);
		
		int t=in.nextInt();
		
		for(int i=0;i<t;i++){
			int[] arr = new int[12];
			for(int j=0;j<12;j++){
				arr[j]=in.nextInt();		
			}
			int[] arr2= new int[6];
			arr2[0]=arr[0]-arr[3];
			arr2[1]=arr[1]-arr[4];
			arr2[2]=arr[2]-arr[5];
			
			arr2[3]=arr[0]-arr[6];
			arr2[4]=arr[1]-arr[7];
			arr2[5]=arr[2]-arr[8];
			
			int x=arr2[4]*arr2[2]-arr2[5]*arr2[1];
			int y=arr2[3]*arr2[2]-arr2[5]*arr2[0];
			int z=arr2[3]*arr2[1]-arr2[4]*arr2[0];
			
			int d=-1*(x*arr[0]+y*arr[1]+z*arr[2]);
			
			int ans=x*arr[9]+y*arr[10]+z*arr[11]+d;
			
			if(ans==0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
				
		}
		
		
		
	}
	
	

}
