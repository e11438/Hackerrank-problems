import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class BuildingaList {

	/**
	 * @param args
	 */
	
	public static TreeSet<String> permute(String chars)
	  {
	    // Use sets to eliminate semantic duplicates (aab is still aab even if you switch the two 'a's)
	    // Switch to HashSet for better performance
	    TreeSet<String> set = new TreeSet<String>();

	    // Termination condition: only 1 permutation for a string of length 1
	    if (chars.length() == 1)
	    {
	      set.add(chars);
	    }
	    else
	    {
	      // Give each character a chance to be the first in the permuted string
	      for (int i=0; i<chars.length(); i++)
	      {
	        // Remove the character at index i from the string
	        String pre = chars.substring(0, i);
	        String post = chars.substring(i+1);
	        String remaining = pre+post;

	        // Recurse to find all the permutations of the remaining chars
	        for (String permutation : permute(remaining))
	        {
	          // Concatenate the first character with the permutations of the remaining chars
	          set.add(chars.charAt(i) + permutation);
	        }
	      }
	    }
	    return set;
	  }
	 
	public static void main(String[] args) {
		
		//System.out.println("acb".compareTo("abc"));	
		TreeSet<String> nt;
		//TreeSet<String> n = (TreeSet<String>) permute("123");
		//System.out.println(n.first());
		CombinationsTest cT =new CombinationsTest();
		Scanner in = new Scanner(System.in);
		
		int t=Integer.parseInt(in.nextLine());
		int len;
		String word;
		
		for(int i=0;i<t;i++){
			len=Integer.parseInt(in.nextLine());
			word=in.nextLine().trim();
			//word=word.trim();
			cT.generate(word);
			
			for(String s:cT.getTree()){
				System.out.println(s);
			}
			
			cT.res.clear();
			
		}
		
	  
		
		
		
		
		
	}

}
class CombinationsTest {
	public TreeSet<String> res = new TreeSet<String>();
  String input;
  StringBuilder cur;
  
  public TreeSet<String> getTree(){
	  return res;
  }

  private void next(int pos, int reminder) {
    cur.append(input.charAt(pos));

    if (reminder == 1) {
      //System.out.println(cur);
      res.add(cur.toString());
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
 
}

