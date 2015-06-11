import java.util.Scanner;


public class BirthdayGifts {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
	        int t;
	        int numB;       
	        int numW;
	        int x,y,z;
	        int cost1=0;
	        int cost2 = 0;
	        int cost3=0;
	        int cost=0;
	        boolean ok;
	        t = in.nextInt();
	        for (int i=0;i<t;i++) {
	        	numB = in.nextInt();
	        	numW= in.nextInt();
	        	x=in.nextInt();
	        	y=in.nextInt();
	        	z=in.nextInt();
	        	
	        	cost1=x*numB+y*numW;
	        	
	        	
	        	if(x>y+z){
	        		cost2=y*(numB+numW)+(numB*z);
	        	}if(y>x+z){
	        		cost3=x*(numB+numW)+(numW*z);
	        	}
	        	if(cost2==0)
	        		cost=cost1;
	        	if(cost1>0&&cost2>0){
	        		if(cost1<cost2)
	        			cost=cost1;
	        		else
	        			cost=cost2;
	        	}
	        	
	        	if(cost3>0){
	        		if(cost3<cost)
	        			cost=cost3;
	        	}
	            System.out.println(cost);
	            //System.out.println(cost2);
	        	/*if(cost2==0||cost1<cost2)
	        		System.out.println(cost1);
	        	else //if(cost1>cost2&&cost2!=0)
	        		System.out.println(cost2);*/
	            cost=0;
	            cost1=0;
	            cost2=0;
	            cost3=0;
	        	
	        }
			
			
		}

	}