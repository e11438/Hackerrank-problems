import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

class Combinations {
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
