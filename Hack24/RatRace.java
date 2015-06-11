import java.util.Arrays;
import java.util.Scanner;


public class RatRace {
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		
		int n=in.nextInt();
		
		int[] speed=new int[n];
		int[] dist=new int[n];
		float[] time = new float[n];
		
		for(int i=0;i<n;i++){
			speed[i]=in.nextInt();
		}
		
		for(int i=0;i<n;i++){
			dist[i]=in.nextInt();
		}
		
		
		
		for(int i=0;i<n;i++){
			time[i]=(float)dist[i]/speed[i];
			
		}
		int min=0;
		
		float[] timeCopy = Arrays.copyOf(time, time.length);
		Arrays.sort(time);
		float minTime=time[0];
		
		for(int i=0;i<n;i++){
			if(timeCopy[i]==minTime){
				System.out.println(i+1);
			}			
		}
		
		
	}

}
