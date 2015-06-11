import java.util.ArrayList;
import java.util.Scanner;


public class AngryProfessor1 {
	
	public static void main(String args[]){
		ArrayList<OurClass> objList =new ArrayList<OurClass>();
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		Scanner in3 = new Scanner(System.in);
		
		int num=in.nextInt();
    	
    	 
    	for(int i=0;i<num;i++){
    		//System.out.println("NO");
    		String input=in2.nextLine();
    		String[] parts1=input.split(" ");
    		int num1=Integer.parseInt(parts1[0]);
    		int num2=Integer.parseInt(parts1[1]);
    		input=in3.nextLine();
    		String[] parts2=input.split(" ");
    		int[] toEnter=new int[parts2.length];
    		//System.out.println("YES");
    		for(int j=0;j<parts2.length;j++){
    			toEnter[j]=Integer.parseInt(parts2[j]);
    		}
    		objList.add(new OurClass(num1,num2,toEnter)); 
    		//System.out.println("YES");
    		//objList.get(i).printTimes();
    	}
    	for(int i=0;i<objList.size();i++){
    		if(objList.get(i).isOk())
    			System.out.println("NO");
    		else
    			System.out.println("YES");
    	}
		
	}

}
class OurClass{
	int stdWant;
	int allStd;
	ArrayList<Integer> times1= new ArrayList<Integer>();
	
	public OurClass(int allStd,int stdWant,int[] times){
		this.stdWant=stdWant;
		this.allStd=allStd;
		for(int i=0;i<times.length;i++){
			times1.add(times[i]);
		}
	}
	
	public void printTimes(){
		for(int i=0;i<times1.size();i++){
			System.out.print(times1.get(i)+" ");
		}
		System.out.println();
	}
	public boolean isOk(){
		if(times1.size()!=allStd)
			return false;
		int count=0;
		for(int i=0;i<times1.size();i++){
			if(!(times1.get(i)>0))
				count++;
		}
		if(count<stdWant)
			return false;
		else
			return true;
	}
	
}
