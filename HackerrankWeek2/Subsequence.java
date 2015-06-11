import java.util.ArrayList;
import java.util.HashMap;

public class Subsequence { 
	public ArrayList<String> res = new ArrayList<String>();
	int indx=0;
    public void print(String prefix, String remaining, int k) {
        if (k == 0) {
        	res.add(prefix);
            System.out.println(prefix);
            return;
        }
        if (remaining.length() == 0) return;
        print(prefix + remaining.charAt(0), remaining.substring(1), k-1);
        print(prefix, remaining.substring(1), k);
        
    }
    public static boolean canMakePal(String str){
		HashMap<String,String> set =new HashMap<String,String>();
		if(str.length()%2==0){
			for(int i=0;i<str.length();i++){
				if(set.containsKey(str.charAt(i)+"")){
					set.remove(str.charAt(i)+"");
				}else{
					set.put(str.charAt(i)+"", str.charAt(i)+"");
				}
				
			}		
			if(set.size()==0)
				return true;
			else
				return false;
			
		}else{
			for(int i=0;i<str.length();i++){
				if(set.containsKey(str.charAt(i)+"")){
					set.remove(str.charAt(i)+"");
				}else{
					set.put(str.charAt(i)+"", str.charAt(i)+"");
				}
				
			}		
			if(set.size()==1)
				return true;
			else
				return false;
			
		}
	}
  public int maxLenPal(){
	  int len=0;
	  
	  for(int i=0;i<res.size();i++){
		  if(canMakePal(res.get(i))&&res.get(i).length()>len){
			  indx=i;
			  len=res.get(i).length();
		  }
	  }
	  //System.out.println(res.get(indx));
	  return len;
  }


    public static void main(String[] args) { 
        String s = "ksfors";
        Subsequence obj = new Subsequence();
        int k = 4;
        obj.print("", s, k);
        System.out.println(obj.maxLenPal());
        System.out.println(obj.res.get(obj.indx));
    }

}
