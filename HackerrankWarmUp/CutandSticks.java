import java.util.Scanner;


public class CutandSticks {
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		
		int t =in.nextInt();
		int[] arr = new int[t];
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<t;i++){
			int num=in.nextInt();
			
			if(num<min){
				min=num;
			}
			arr[i]=num;
		}
		sort(arr);
		//printArray(arr);
		int count =1;
		//System.out.println();
		System.out.println(arr.length);
		
		for(int i=1;i<arr.length;i++){
			if(arr[i-1]==arr[i]){
				count++;
				
			}else{
				System.out.println((arr.length-count));
				count++;
			}
			
		}
		
		
	}
	
	public static void sort(int[]a){
		int left = 0;
		int right = a.length-1;
			
		quickSort(left, right,a);
	}
	
	// This method is used to sort the array using quicksort algorithm.
	// It takes the left and the right end of the array as the two cursors.
	private static void quickSort(int left,int right,int[] a){
		
		// If both cursor scanned the complete array quicksort exits
		if(left >= right)
			return;
		
		// For the simplicity, we took the right most item of the array as a pivot 
		int pivot = a[right];
		int partition = partition(left, right, pivot,a);
		
		// Recursively, calls the quicksort with the different left and right parameters of the sub-array
		quickSort(0, partition-1,a);
		quickSort(partition+1, right,a);
	}
	
	// This method is used to partition the given array and returns the integer which points to the sorted pivot index
	private static int partition(int left,int right,int pivot,int[] a){
		int leftCursor = left-1;
		int rightCursor = right;
		while(leftCursor < rightCursor){
                while(a[++leftCursor] < pivot);
                while(rightCursor > 0 && a[--rightCursor] > pivot);
			if(leftCursor >= rightCursor){
				break;
			}else{
				swap(leftCursor, rightCursor,a);
			}
		}
		swap(leftCursor, right,a);
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
