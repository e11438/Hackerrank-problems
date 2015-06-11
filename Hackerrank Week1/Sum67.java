import java.util.Scanner;


public class Sum67 {
	
	
	public static void main(String args[]){
        Scanner in = new Scanner(System.in);
       // Scanner in2 = new Scanner(System.in);
        int t;
        String input;
        int sum=0;
        boolean inSection=false;
        int a,b;
        t = in.nextInt();
        int[] arr = new int[t];
        
        for(int i=0;i<arr.length;i++){
        	a=in.nextInt();
        	arr[i]=a;
        }       
       
        
        for(int i=0;i<arr.length;i++){
        	//System.out.print(arr[i]+" ");
        	if((arr[i])==6){
        		inSection=true;
        	}
        	if(inSection&&(arr[i])==7){
        		inSection=false;
        		sum-=7;
        	}
        	if(!inSection)
        		sum+=(arr[i]);
        }
        System.out.println(sum);
	}

}
