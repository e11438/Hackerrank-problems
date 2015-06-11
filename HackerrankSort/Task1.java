import java.util.Scanner;


public class Task1 {

	/**
	 * @param args
	 */
	
	
	   
	
	    public static int binarySearch(int key,int[] data) 
	    {
	    	//int size=data.length;
	         int low = 0;
	         int high = data.length - 1;
	          
	         while(high >= low) {
	             int middle = (low + high) / 2;
	             if(data[middle] == key) {
	                 return middle;
	             }
	             if(data[middle] < key) {
	                 low = middle + 1;
	             }
	             if(data[middle] > key) {
	                 high = middle - 1;
	             }
	        }
	        return (Integer) null;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int num =in.nextInt();
		int len=in.nextInt();
		int[] arr = new int[len];
		for(int i=0;i<len;i++){
			arr[i]=in.nextInt();
		}
		System.out.println(binarySearch(num,arr));
		
	}

}
