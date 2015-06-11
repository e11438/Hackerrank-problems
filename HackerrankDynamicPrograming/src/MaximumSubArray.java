import java.util.ArrayList;
import java.util.Scanner;


public class MaximumSubArray {

	/**
	 * @param args
	 */
	public static void maxSubArray(ArrayList<Integer> a){
		int maxCon=0;
		int maxNonCon=0;
		int maxEndHere=0;
		for(int i=0;i<a.size();i++){
			if(a.get(i)>0){
				maxNonCon+=a.get(i);
			}
			
			maxEndHere+=a.get(i);
			if(maxEndHere<0)
				maxEndHere=0;
			if(maxEndHere>maxCon)
				maxCon=maxEndHere;			
		}
		if(maxCon==0&&maxNonCon==0){
			System.out.println(printMax(a)+" "+ printMax(a));
		}else if(maxCon==0){
			System.out.println(printMax(a)+" "+ maxNonCon);
			
		}else if(maxNonCon==0){
			System.out.println(maxCon+" "+ printMax(a));
			
		}else if (maxCon!=0&&maxNonCon!=0)
			System.out.println(maxCon+" "+ maxNonCon);
			
		
	}
	public static int printMax(ArrayList<Integer> a){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.size();i++){
			if(a.get(i)>max)
				max=a.get(i);
		}
		return max;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		
		int t=in.nextInt();
		int size=0;
		for(int i=0;i<t;i++){
			size=in.nextInt();
			for(int j=0;j<size;j++){
				ar.add(in.nextInt());
			}
			maxSubArray(ar);
			ar.clear();
		}
		
	}

}
