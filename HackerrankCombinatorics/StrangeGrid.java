import java.math.BigInteger;
import java.util.Scanner;


public class StrangeGrid {
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		int r= in.nextInt();
		int c=in.nextInt();
		
		
		int sub=(r+1)%2;
		int mn=(r+1)/2;
		
		BigInteger bigSub = new BigInteger(Integer.toString(sub));
		BigInteger start=null;
		BigInteger ten = BigInteger.TEN;
		BigInteger one = BigInteger.ONE;
		
		if(sub==1){
			start=(new BigInteger(Integer.toString(mn-1)).multiply(ten)).add(one);
		}else{
			start=(new BigInteger(Integer.toString(mn-1)).multiply(ten));
		}
		BigInteger plus=new BigInteger(Integer.toString((c-1)*2));
		
		System.out.println(plus.add(start));
		
	}
	

}
