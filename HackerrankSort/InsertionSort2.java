import java.util.Scanner;


public class InsertionSort2 {

	public static void insertionSortPart2(int[] ar)
    {       
		boolean flag =true;
          for(int i=1;i<ar.length;i++){
        	 // if(flag){
        		  //printArray(ar);
        		  flag=false;
        	  //}
        	  if(ar[i]<ar[i-1]){
        		  insertIntoSorted(ar,i+1);
        		  flag=true;        		  
        	  }
        	  printArray(ar);
          }
          
    } 
	public static void insertIntoSorted(int[] ar,int len) {		
		 boolean t=true;
	        // Fill up this function  
		 int min=Integer.MAX_VALUE;
		 for(int i=len-1;i>0;i--){
			 if(ar[i]<min){
				 min=ar[i];
			 }
			 if(min<ar[i-1]){				
				 ar[i]=ar[i-1];
				 //printArray(ar);
			 }
			 else{
				 t=false;
				 ar[i]=min;
				 //printArray(ar);
				 break;
			 }			 
		 }
		 if(t){
			 ar[0]=min;
			// printArray(ar);
		 }
		
	 }
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}



