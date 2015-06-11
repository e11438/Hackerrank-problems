import java.util.Scanner;


public class CuttMarble2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t;
        int num1;       
        int num2;
        int side;
        boolean ok;
        t = in.nextInt();
        for (int i=0;i<t;i++) {
        	num1 = in.nextInt();
        	num2= in.nextInt();
        	
        	
        	if(num1%3==0||num2%3==0){
        		System.out.println("YES");
        		
        	}
        	else{
        		ok=false;
        		if(num1%3>num2%3){
        			num2=num2%3;
        			num1=num1%3;
        			System.out.println("NO "+(num2*num1)%3);
        		}
        		else{
        			num1=num1%3;
        			num2=num2%3;
        			System.out.println("NO "+(num1*num2)%3);
        		}        		
        			
        	}
        	
        }
		
		
	}
	
}
