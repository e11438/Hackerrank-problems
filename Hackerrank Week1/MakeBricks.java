import java.util.Scanner;


public class MakeBricks {
	
	

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
    	String input=in.nextLine();    	
    	String[] name= input.split(" ");
    	
    	int numOfOnes=Integer.parseInt(name[0]);
    	int numOfFives=Integer.parseInt(name[1]);
    	int target=Integer.parseInt(name[2]);
    	if(isOk(numOfOnes,numOfFives,target))
     	   System.out.println("true");
         else
             System.out.println("false");
 	
    	
	
	}
	public static boolean isOk(int numOfOnes,int numOfFives,int target){
		int sum=0;
    	int sum2=0;
    	for(int i=0;i<numOfOnes;i++){
    		sum++;
    		sum2=sum;
    		for(int j=0;j<numOfFives;j++){
    			sum2+=5;
    			if(sum2==target)
    				return true;
    			else if(sum2>target){
    				sum2=0;
    				break;
    			}
    		}
    	}
    	return false;		
	}

}
