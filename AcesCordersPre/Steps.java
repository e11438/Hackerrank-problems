import java.util.Scanner;


public class Steps {

	/**
	 * @param args
	 */
	
	public static int steps(int n) {
	    return steps(n, 0);
	}
	private static Integer steps(int n, int consecutiveMinusOnes) {
	    if (n <= 1) {
	        return 0;
	    }
	    Integer minSteps = null;
	    if (consecutiveMinusOnes < 2) {
	        Integer subOne = steps(n - 1, consecutiveMinusOnes + 1);
	        if (subOne != null) {
	            minSteps = 1 + subOne;
	        }
	    }
	    if (n % 2 == 0) {
	        Integer div2 = steps(n / 2, 0);
	        if (div2 != null) {
	            if (minSteps == null) {
	                minSteps = div2 + 1;
	            } else {
	                minSteps = Math.min(minSteps, 1 + div2);
	            }
	        }
	    }
	    if (n % 3 == 0) {
	        Integer div3 = steps(n / 3, 0);
	        if (div3 != null) {
	            if (minSteps == null) {
	                minSteps = div3 + 1;
	            } else {
	                minSteps = Math.min(minSteps, 1 + div3);
	            }
	        }
	    }
	    return minSteps;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
    	//String s = scan.next();
    	int a = scan.nextInt();
    	int i = 0;
    	int firs = 0;
    	int secon = 0;
    	int[] bob = new int[a];
    	int[] alice = new int[a];
    	while(i < a){
    		firs = scan.nextInt();
    		secon = scan.nextInt();
    		
    		alice[i] = steps(firs, 0);
    		bob[i] = steps(secon, 0);
    		i++;
    	}
    	for(int j = 0; j < a; j++){
    		System.out.println(alice[j]+" "+bob[j]);
    		if(alice[j] > bob[j]){
    			System.out.println("BOB");
    		}else if(alice[j] < bob[j]){
    			System.out.println("ALICE");
    		}else{
    			System.out.println("DRAW");
    		}
    	}
		//System.out.println(steps(7,0));

	}
	

}
