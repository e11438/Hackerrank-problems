import java.util.Scanner;


public class WordGame1 {

	/**
	 * @param args
	 */
	/**
	* To find  longest palindrome sub-sequence
	* It has time complexity O(N^2)
	* 
	* @param source
	* @return String
	*/
	public static String getLongestPalindromicSubSequence(String source){
	    int n = source.length();
	    int[][] LP = new int[n][n];

	    //All sub strings with single character will be a plindrome of size 1
	    for(int i=0; i < n; i++){
	        LP[i][i] = 1;
	    }
	    //Here gap represents gap between i and j.
	    for(int gap=1;gap<n;gap++){
	        for(int i=0;i<n-gap;i++ ){
	                    int j=i+gap;
	                    if(source.charAt(i)==source.charAt(j) && gap==1)
	                        LP[i][j]=2;
	                    else if(source.charAt(i)==source.charAt(j))
	                        LP[i][j]=LP[i+1][j-1]+2;
	                    else
	                        LP[i][j]= Math.max(LP[i][j-1], LP[i+1][j]);              
	         }      
	    }   
	    //Rebuilding string from LP matrix
	    StringBuffer strBuff = new StringBuffer();
	    int len;
	    int x = 0;
	    int y = n-1;
	    while(x < y){
	        if(source.charAt(x) == source.charAt(y)){
	            strBuff.append(source.charAt(x));
	            x++;
	            y--;
	        } else if(LP[x][y-1] > LP[x+1][y]){
	            y--;
	        } else {
	            x++;
	        }
	    }
	    StringBuffer strBuffCopy = new StringBuffer(strBuff);
	    String str = strBuffCopy.reverse().toString();
	    if(x == y){          
	        strBuff.append(source.charAt(x)).append(str);
	    } else {
	        strBuff.append(str);
	    }
	    return strBuff.toString();
	}
	
	public static int getMax(String str,int s,int e){
		int max=0;
		if(e-s<20){
		
		//System.out.println(max);
			for(int i=s;i<e;i=i+1){
				//System.out.println(i);
				//c1.generate(str.substring(0, i));
				//c2.generate(str.substring(i));
				int len1=getLongestPalindromicSubSequence(str.substring(0, i)).length();
				int len2 = getLongestPalindromicSubSequence(str.substring(i)).length();
				//System.out.println(len1+" "+len2);
				if(len1*len2>max){
					//System.out.println(c1.maxLenPal()+" - "+c2.maxLenPal());
					//System.out.println(c1.name+" - "+c2.name);
					max=len1*len2;
					//max=c1.maxLenPal()*c2.maxLenPal();
				}
				
				//c1.res.clear();
				//c2.res.clear();				
			}		
			return max;
		}
		else{
			
			return getMax(str,s+5,e-5);
		}
		
	}

	public static void main(String[] args) {
	    //System.out.println(getLongestPalindromicSubSequenceSize("XAYBZA"));
	    //System.out.println(getLongestPalindromicSubSequence("XAYBZBA"));
		int max=0;
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine().trim();
		//c1.generate("eeegeeks");
		
		
		for(int i=str.length()/2-50;i<str.length()/2;i=i+1){
			if(i<0)
				i=0;
			//System.out.println(i);
			//c1.generate(str.substring(0, i));
			//c2.generate(str.substring(i));
			int len1=getLongestPalindromicSubSequence(str.substring(0, i)).length();
			int len2 = getLongestPalindromicSubSequence(str.substring(i)).length();
			//System.out.println(len1+" "+len2);
			if(len1*len2>max){
				//System.out.println(c1.maxLenPal()+" - "+c2.maxLenPal());
				//System.out.println(c1.name+" - "+c2.name);
				max=len1*len2;
				//max=c1.maxLenPal()*c2.maxLenPal();
			}
			
			//c1.res.clear();
			//c2.res.clear();				
		}
		System.out.println(max);
		//return max;
		
		//System.out.println(getMax(str,5,str.length()-5));	
	}
}
