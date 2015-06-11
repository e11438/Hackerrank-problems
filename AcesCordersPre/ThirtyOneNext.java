
public class ThirtyOneNext {
	
	
	
	public static void main(String args[]){
		int money=200;
		int[] coins = {200,100,50,20,10,5,2,1};
		System.out.println(findWays2(200));
		
		
	}
	
	public static int findWays(int target){
		
		int ways = 0;
		 
		for (int a = target; a >= 0; a -= 200) {
		    for (int b = a; b >= 0; b -= 100) {
		        for (int c = b; c >= 0; c -= 50) {
		            for (int d = c; d >= 0; d -= 20) {
		                for (int e = d; e >= 0; e -= 10) {
		                    for (int f = e; f >= 0; f -= 5) {
		                        for (int g = f; g >= 0; g -= 2) {
		                            ways++;
		                        }
		                    }
		                }
		            }
		        }
		    }
		}
		return ways;
	}
	
	public static int findWays2(int target){
		
		int[] coinSizes = { 1, 2, 5, 10, 20, 50, 100, 200 };
		int[] ways = new int[target+1];
		ways[0] = 1;
		 
		for (int i = 0; i < coinSizes.length; i++) {
		    for (int j = coinSizes[i]; j <= target; j++) {
		        ways[j] += ways[j - coinSizes[i]];
		    }
		}
		for(int i=0;i<ways.length;i++){
			System.out.println(ways[i]);
		}
		return ways[target];
	}

}
