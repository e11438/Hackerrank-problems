import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ladder {
	
	public static boolean contain(String[] data,int start) 
    {
        // int low = 0;
         for(int i=start;i<data.length;i++){
        	 if(data[i].equals("1"))
        		 return true;
         }         
        	 return false;
   }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	String input=in.nextLine();
    	
    	 //String str ="[D][C][B][A]Hello world!";
    	  String[] s =  input.split("\\[");
    	  String[] newarr = new String[2];
    	  int cont=0;
    	  for (String o: s) {
    	    if (o.length() > 0){
    	      String[] s2 =  o.split("\\]");
    	      newarr[cont]=(s2[0]);
    	      cont++;
    	    }
    	  }
    	 // System.out.println(newarr[0]);
    	 // System.out.println(newarr[1]);
    	String[] arr1=newarr[0].split(" ");
    	String[] arr2=newarr[1].split(" ");
    	
    	
    	int count1=0;
    	int count2=0;
    	float sum=0;
    	
    	for(int i=0;i<arr1.length&&contain(arr1,i);i++){    		
    		if(arr1[i].equals("1")){
    			for(int j=count2;j<arr2.length&&contain(arr2,j);j++){
    				if(arr2[j].equals("1")){
    					if(count1==count2){
    						//System.out.println("added equals: 1"+" "+sum );
    						sum+=(float)1;
    						count2++;
    						break;
    					}
    					else{
    						float distance=(float) Math.sqrt( Math.pow(Math.abs(count1-count2),2)+1);
    						//System.out.println("added difference: " +distance+" "+sum);
    						sum+=distance;
    						count2++;
    						break;
    					}
    				}
    				count2++;
    			}    			
    		}
    		count1++;    		
    	}
    	//DecimalFormat df = new DecimalFormat("#.000000");
    	//df.format(0.912385);
    	//System.out.println((float)sum);
    	String strsum=Float.toString(sum);
    	BigDecimal bigSum=new BigDecimal(strsum);
    	String[] numParts=strsum.split(".");
    	int num=0;
    	if(numParts.length>0){
    	num=numParts[0].length();
    	}
    	int numOfDec=7-num;
    	//System.out.println(numOfDec);
    	if(numOfDec>0){
    		BigDecimal divide = bigSum.divide(BigDecimal.ONE, numOfDec-1, RoundingMode.HALF_EVEN);
    		System.out.println(divide);
    		
    	}
    	else{
    	System.out.println(Float.toString(sum).substring(0,7));
    	}
    
    }
}