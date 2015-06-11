import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class MinScalProd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double sum=0;
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
        int t;
        int numE;       
        int el;
       
        t = in.nextInt();
        for (int i=0;i<t;i++) {
        	numE=in.nextInt();
        	
        	 for(int j=0;j<numE;j++){
        		 el = in.nextInt();
        		 arr1.add(el);
        	 }
        	 for(int j=0;j<numE;j++){
        		 el = in.nextInt();
        		 arr2.add(el);
        	 }
        	 
        	 Collections.sort(arr1);
        	 Collections.sort(arr2, Collections.reverseOrder());
        	 if(arr1.size()==arr2.size()){
        		 for(int k=0;k<arr1.size();k++){
        			 sum+=((double)arr1.get(k)*(double)arr2.get(k));
        			 
        		 }        		 
        	 }
        	 System.out.println("Case #"+(i+1)+": "+(int)sum);
        	 arr1.clear();
        	 arr2.clear();
        	 sum=0;
        }
		
	}

}
