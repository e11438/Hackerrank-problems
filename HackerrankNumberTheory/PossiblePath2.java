import java.util.Scanner;


public class PossiblePath2 {
	
	static long gcd(long a, long b){
	    if( a<0 ) a = -a;
	    if( b<0 ) b = -b;
	    while( b!=0 ){
	        a %= b;
	        if( a==0 ) return b;
	        b %= a;
	    }
	    return a;
	}
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		
		int t=in.nextInt();
		
		for(int i=0;i<t;i++){
			long a1=in.nextLong();
			long b1=in.nextLong();
			long a2=in.nextLong();
			long b2=in.nextLong();
			
			if(gcd(a1,b1)==gcd(a2,b2))
				System.out.println("YES");
			else
				System.out.println("NO");
			
			
		}
		
	}
			

}
