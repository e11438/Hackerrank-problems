import java.math.BigInteger;
import java.util.Scanner;


public class ConnectTowns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int t =in.nextInt();
		int num;
		BigInteger sum=new BigInteger("1");
		int paths;
		
		for(int i=0;i<t;i++){
			num=in.nextInt();
			
			for(int j=1;j<num;j++){
				paths=in.nextInt();
				sum=sum.multiply(new BigInteger(Integer.toString(paths)));
			}
			System.out.println(sum.mod(new BigInteger("1234567")));
			sum=new BigInteger("1");
		}
		
	}

}
