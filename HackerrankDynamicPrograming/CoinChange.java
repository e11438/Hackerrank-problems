import java.util.Arrays;
import java.util.Scanner;


public class CoinChange {
	
	public static void main(String args[]){
		Scanner in = new Scanner (System.in);
		
		
		long sum=in.nextLong();
		long num=in.nextLong();
		long[] coins = new long[(int)num];
		for(int i=0;i<num;i++){
			coins[i]=in.nextInt();
		}
		Arrays.sort(coins);
		System.out.println(count(coins,num,sum));
		
	}
	
	public static long count(long[] coins,long num,long sum){
		
		if(sum<0||num<1) return 0;
		if(sum==0) return 1;
		
		long[][] res = new long[(int)num][(int)sum+1];
		
		for(int i=0;i<num;i++){
			res[i][0]=1;
		}
		for(int i=1;i<sum+1;i++){
			for(int j=0;j<num;j++){
				
				// Count of solutions including S[j]
				long x=((i-coins[j]) >= 0)? res[j][(int) (i - coins[j])]: 0;
				
				// Count of solutions excluding S[j]
				long y = (j >= 1)? res[j-1][i]: 0;
				
				res[j][i]=x+y;
			}
			
		}
		
		
		return res[(int) (num-1)][(int) sum];
	}

}
