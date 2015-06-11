import java.util.Scanner;


public class FlipBits {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int t;	       
        int sum=0;
        
        int a;
        t = in.nextInt();
        int[] arr = new int[t];
        
        for(int i=0;i<arr.length;i++){
        	a=in.nextInt();
        	String binary =Integer.toBinaryString(a);
        	arr[i]=Integer.parseInt(flipBits(binary), 2);
        }  
        
        for(int i=0;i<arr.length;i++){
        	System.out.println(arr[i]);
        }
	}

	public static String flipBits(String str){
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++){
			if((arr[i]+"").equals("1"))
				arr[i]='0';
			else
				arr[i]='1';
		}
		return String.valueOf(arr);
	}
}
