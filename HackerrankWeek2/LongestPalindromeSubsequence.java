
public class LongestPalindromeSubsequence {

	/**
	 * @param args
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getLongestPalindromicSubSequence("eeegeeksfor"));
	}

}
