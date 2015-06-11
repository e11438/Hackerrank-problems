import java.util.HashSet;
import java.util.Scanner;


public class GemStones {
	
	public static void main(String args[]){
		HashSet<Character> h1 = new HashSet<Character>(), h2 = new HashSet<Character>();
		
		Scanner in = new Scanner (System.in);
		
		int t=Integer.parseInt(in.nextLine());
		
		String str = in.nextLine();
		for(int i = 0; i < str.length(); i++)                                            
		{
		  h1.add(str.charAt(i));
		}
		//System.out.println(t);
		//System.out.println(h1.size());
		for(int i=1;i<t;i++){
			String str1=in.nextLine();			
			for(int j = 0; j < str1.length();j++)
			{
				if(j<str1.length())
					h2.add(str1.charAt(j));
			}
			//System.out.print(h1.size()+" ");
			//System.out.println(h2.size());
			h1.retainAll(h2);
			//Character[] res = h1.toArray(new Character[0]);	
			//System.out.print(h1.size()+" ");
			//System.out.println(h2.size());
			h2.clear();
		}
		System.out.println(h1.size());
	}

}
