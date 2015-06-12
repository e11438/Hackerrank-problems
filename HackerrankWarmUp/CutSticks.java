import java.util.Arrays;
import java.util.Scanner;


public class CutSticks {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int t=in.nextInt();
		int[] arr= new int[t];
		
		for(int i=0;i<t;i++){
			arr[i]=in.nextInt();			
		}
		
		Arrays.sort(arr);
		int num=1;
		for(int i=0;i<(t-1);i++){
			if(arr[i+1]!=arr[i]){
				if(num==1){
					
					System.out.println(t-i);
					if(i==(t-2)){
						System.out.println("1");
					}
				}else{
					
					System.out.println((t-1-i+num));
					num=1;
					//i++;
					if(i==(t-2)){
						System.out.println("1");
					}
				}
			}else{
				num++;
				if(i==(t-2)){
					System.out.println(num);
				}
			}
		}
		
	}

}
