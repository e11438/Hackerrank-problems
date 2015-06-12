import java.util.Scanner;


public class LIS {
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		int[] res= new int[t];
		int[] input= new int[t];
		for(int i=0;i<t;i++){
			int num=in.nextInt();
			input[i]=num;
			res[i]=1;
		}
		
		//res[0]=1;
		
		for(int i=1;i<t;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(input[i]>input[j]&&(res[j]+1)>res[i])
					res[i]=res[j]+1;
			}
		}
		int max=0;
		for(int i=0;i<t;i++){
			if(res[i]>max)
				max=res[i];
		}
		
		System.out.println(max);
		
	}

}
