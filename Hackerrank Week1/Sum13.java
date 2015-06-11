import java.util.Scanner;


public class Sum13 {
	
	public static void main(String args[]){
			Scanner in = new Scanner(System.in);
			int t;	       
	        int sum=0;
	        
	        int a;
	        t = in.nextInt();
	        int[] arr = new int[t];
	        
	        for(int i=0;i<arr.length;i++){
	        	a=in.nextInt();
	        	arr[i]=a;
	        }   
	      
	        for(int i=0;i<arr.length;i++){
	        	if(arr[i]==13){
	        		sum-=13;
	        		if(i+1<arr.length)
	        			sum-=arr[i+1];
	        	}
	        	sum+=arr[i];
	        }
	        
	        System.out.println(sum);
	}
	
}
