import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class WordGame2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine().trim();
		//c1.generate("eeegeeks");
		
		
		System.out.println(calcMax(str,5,str.length()-5));	

	}
	public static int calcMax(String str,int s,int e){
		int max=0;
		if(e-s<20){
		Combinations2 c1 =new Combinations2();
		Combinations2 c2 =new Combinations2();
		//System.out.println(max);
			for(int i=s;i<e;i=i+2){
				//System.out.println(i);
				c1.generate(str.substring(0, i));
				c2.generate(str.substring(i));
				//System.out.println(c1.res.size());
				//System.out.println(c2.res.size());
				
				//if(c1.maxLenPal()*c2.maxLenPal()>max){
				if(c1.name.length()*c2.name.length()>max){
					//System.out.println(c1.maxLenPal()+" - "+c2.maxLenPal());
					//System.out.println(c1.name+" - "+c2.name);
					max=c1.name.length()*c2.name.length();
					//max=c1.maxLenPal()*c2.maxLenPal();
				}
				
				//c1.res.clear();
				//c2.res.clear();
				c1.name="";
				c2.name="";
			}		
			return max;
		}
		else{
			
			return calcMax(str,s+5,e-5);
		}
	}

}

class Combinations2 {
	//public ArrayList<String> res = new ArrayList<String>();
	String name="";
  String input;
  StringBuilder cur;
  int indx=0;

  private void next(int pos, int reminder) {
    cur.append(input.charAt(pos));

    if (reminder == 1) {
      //System.out.println(cur);
    	if(isPalindrom(cur.toString())){
    		if(name.length()<cur.length())
    			name=cur.toString();    		
    	}
    } else {
      for (int i = pos + 1; i + reminder - 1 <= input.length(); i++)
        next(i, reminder - 1);
    }
    cur.deleteCharAt(cur.length() - 1);
  }

  public void generate(String input) {
    cur = new StringBuilder();
    this.input = input;
    for (int length = 1; length <= input.length(); length++)
      for (int pos = 0; pos + length <= input.length(); pos++)
        next(pos, length);
  }
  public static boolean isPalindrom(String s){
	  int n = s.length();
	    s = s.toLowerCase();
	    for (int i = 0; i < (n / 2) + 1; ++i) {
	        if (s.charAt(i) != s.charAt(n - i - 1)) {
	            return false;
	        }
	    }
	    return true;
  } 
  /*public int maxLenPal(){
	  int len=0;
	  
	  for(int i=0;i<res.size();i++){
		  if(res.get(i).length()>len){
			  indx=i;
			  len=res.get(i).length();
		  }
	  }
	  //System.out.println(res.get(indx));
	  return len;
  }*/
}
