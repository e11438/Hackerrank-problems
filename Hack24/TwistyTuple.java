import java.util.Scanner;


public class TwistyTuple {
	
	public static void main(String args[]){
		
		
		Scanner in =new Scanner(System.in);
		
		int n=in.nextInt();
		long[] arr=new long[n];
		int[] dup=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextLong();
		}
		
		for(int i=0;i<n;i++){
			dup[i]=i;
		}
		
		//printArray(arr);
		System.out.println("");
		printArray(dup);
		
		// sort the array
		sort(arr,dup);
		
		System.out.println("");
		
		//prints the sorted array
		printArray(dup);
		
		for(int i=0;i<n;i++){
			
			
		}
		
		
		
		
		
		
	}
	
	public static void sort(long[]a,int[] dup){
		int left = 0;
		int right = a.length-1;
			
		quickSort(left, right,a,dup);
	}
	
	// This method is used to sort the array using quicksort algorithm.
	// It takes the left and the right end of the array as the two cursors.
	private static void quickSort(long left,long right,long[] a,int[] dup){
		
		// If both cursor scanned the complete array quicksort exits
		if(left >= right)
			return;
		
		// For the simplicity, we took the right most item of the array as a pivot 
		long pivot = a[(int) right];
		long partition = partition(left, right, pivot,a,dup);
		
		// Recursively, calls the quicksort with the different left and right parameters of the sub-array
		quickSort(0, partition-1,a,dup);
		quickSort(partition+1, right,a,dup);
	}
	
	// This method is used to partition the given array and returns the integer which points to the sorted pivot index
	private static int partition(long left,long right,long pivot,long[] a,int[] dup){
		int leftCursor = (int) (left-1);
		int rightCursor = (int) right;
		while(leftCursor < rightCursor){
                while(a[++leftCursor] < pivot);
                while(rightCursor > 0 && a[--rightCursor] > pivot);
			if(leftCursor >= rightCursor){
				break;
			}else{
				//swap(leftCursor, rightCursor,a);
				swap(leftCursor, rightCursor,dup);
			}
		}
		swap(leftCursor, (int)right,dup);
		return leftCursor;
	}
	
	// This method is used to swap the values between the two given index
	public static void swap(int left,int right,int[] a){
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}
	
	public static void printArray(int[] a){
		for(int i : a){
			System.out.print(i+" ");
		}
	}

}
