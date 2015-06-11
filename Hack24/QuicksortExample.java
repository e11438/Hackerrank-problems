public class QuicksortExample {

	//private static int []a;
	public static void main(String[] args) {
		// Get a random generated array
		
		int size=10;
		int []array = new int[size];
		
		
		int item = 0;
		for(int i=0;i<size;i++){
			item = (int)(Math.random()*100); 
			array[i] = item;
		}
		int[] dup= new int[size];
		for(int i=0;i<size;i++){
			dup[i]=i;
		}
		// prints the given array
		printArray(array);
		System.out.println("");
		printArray(dup);
		
		// sort the array
		sort(array,dup);
		
		System.out.println("");
		
		//prints the sorted array
		printArray(dup);
		System.out.println("");
		printArray(array);
		
		
	}
	
	// This method sorts an array and internally calls quickSort 
	public static void sort(int[]a,int[] dup){
		int left = 0;
		int right = a.length-1;
			
		quickSort(left, right,a,dup);
	}
	
	// This method is used to sort the array using quicksort algorithm.
	// It takes the left and the right end of the array as the two cursors.
	private static void quickSort(int left,int right,int[] a,int[] dup){
		
		// If both cursor scanned the complete array quicksort exits
		if(left >= right)
			return;
		
		// For the simplicity, we took the right most item of the array as a pivot 
		int pivot = a[right];
		int partition = partition(left, right, pivot,a,dup);
		
		// Recursively, calls the quicksort with the different left and right parameters of the sub-array
		quickSort(0, partition-1,a,dup);
		quickSort(partition+1, right,a,dup);
	}
	
	// This method is used to partition the given array and returns the integer which points to the sorted pivot index
	private static int partition(int left,int right,int pivot,int[] a,int[] dup){
		int leftCursor = left-1;
		int rightCursor = right;
		while(leftCursor < rightCursor){
                while(a[++leftCursor] < pivot);
                while(rightCursor > 0 && a[--rightCursor] > pivot);
			if(leftCursor >= rightCursor){
				break;
			}else{
				swap(leftCursor, rightCursor,a);
				//swap(leftCursor, rightCursor,dup);
			}
		}
		swap(leftCursor, rightCursor,a);
		//swap(leftCursor, right,dup);
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
	
	public static int[] getArray(){
		int size=10;
		int []array = new int[size];
		
		int[] dup= new int[size];
		int item = 0;
		for(int i=0;i<size;i++){
			item = (int)(Math.random()*100); 
			array[i] = item;
		}
		
		for(int i=0;i<size;i++){
			dup[i]=i;
		}
		
		
		return array;
	}

}
