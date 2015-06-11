import java.util.Scanner;


public class Sum132 {
	public static void main(String args[]){
		
		//System.out.println("sdsad");
		boolean imm =false;
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
        //System.out.println("sdasdsd");
        for(int i=0;i<arr.length;i++){
        	
        	if(arr[i]==13){
        		//imm=true;
        		if(i<arr.length-1)
        			sum-=arr[i+1];
        	}
        	if(arr[i]!=13)
        		sum+=arr[i];
        	//System.out.println(arr[i]);
        }
        
        System.out.println(sum);
        
	}

}
