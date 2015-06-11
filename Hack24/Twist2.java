import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class Twist2 {
	
	static Stack<Long> one = new Stack<Long>();
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int t= in.nextInt();
		long[] arr=new long[t];
		for(int i=0;i<t;i++){
			arr[i]=in.nextLong();
		}
		
		ArrayList<Long> one = new ArrayList<Long>();
		ArrayList<Long> two = new ArrayList<Long>();
		ArrayList<Long> three = new ArrayList<Long>();
		
			
	}
	
	public static boolean containLow(ArrayList<Long> data,long key){
		int low = 0;
        int high = data.size() - 1;
         
        while(high >= low) {
            int middle = (low + high) / 2;
            if(data.get(middle)< key) {
                return true;
            }
            if(data.get(middle) < key) {
                low = middle + 1;
            }
            if(data.get(middle) > key) {
                high = middle - 1;
            }
       }
       return false;
	}
	
	public static boolean containHigh(ArrayList<Long> data,long key){
		int low = 0;
        int high = data.size() - 1;
         
        while(high >= low) {
            int middle = (low + high) / 2;
            if(data.get(middle)> key) {
                return true;
            }
            if(data.get(middle) < key) {
                low = middle + 1;
            }
            if(data.get(middle) > key) {
                high = middle - 1;
            }
       }
       return false;
	}

}
