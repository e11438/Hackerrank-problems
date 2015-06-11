import java.util.ArrayList;
import java.util.Scanner;


public class NumberList {

	/**
	 * @param args
	 */
	
	static String set = "";
	static int sum=0;
	static int bigNum=0;
	public static boolean isthereGreaterOne(String str,int num,int start,int end){
		
		int mid =(start+end)/2;
		if(start>end)
			return false;
		if(Integer.parseInt(str.charAt(mid)+"")>num)
			return true;
		else
			return isthereGreaterOne(str,num,mid+1,end);
	}
	
	static void substrings(int start, int end){
        if(start == set.length() && end == set.length()){
            return;
        }else{
            if(end == set.length()+1){
                substrings(start+1,start+1);
            }else{
                if(isthereGreaterOne(set.substring(start, end),bigNum,0,set.substring(start, end).length()-1))
                	sum++;
                substrings(start, end+1);
            }
        }
    }
	
	public static void main(String[] args) {
		int count=0;
		//ArrayList<String> reslt = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
        int t;
        int numE;
        int el;
        String charSet="";
        t = in.nextInt();
        for (int i=0;i<t;i++) {
            numE = in.nextInt();
            bigNum = in.nextInt();
            for(int j=0;j<numE;j++){
            	el = in.nextInt();
            	set+=Integer.toString(el);
            	
            }
           
        	//System.out.println(charSet);
        	
            substrings(0,1);
        	/*for(int j=0;j<charSet.length();j++){
        		for(int k=1;k<=charSet.length();k++){
        			//if(j<charSet.length()&&k<=charSet.length())
        			if(j>=0&&j<k){
        				if(isthereGreaterOne(charSet.substring(j, k),bigNum,0,k-j-1))        					
        					count++;
        			}
        		}
        		
        	}
        	*/
        	
        	System.out.println(sum);
        	//System.out.println("count-"+count+"-"+reslt.size());
        	charSet="";         	
        	count=0;
        	//--------------------------
        	sum=0;
        	set="";
        }
	}

}
