import java.util.Arrays;
import java.util.Scanner;


public class MarkAndToys2 {

	/**
	 * @param args
	 */
	
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        Scanner input=new Scanner(System.in);
        int n;
        int numberoftoyscanbuy=0;
                n=input.nextInt();
                int money=input.nextInt();
                int[]toys=new int[n];
                for(int count=1;count<=n;++count)
                    toys[count-1]=input.nextInt();
                Arrays.sort(toys);
                for(int count=0;count<=n;++count)
                {
                    money-=toys[count];
                    if(money<0)
                        break;
                    numberoftoyscanbuy++;
                 }
                System.out.println(numberoftoyscanbuy);

	}

}
