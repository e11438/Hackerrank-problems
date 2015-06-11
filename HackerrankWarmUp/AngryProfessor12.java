import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;


public class AngryProfessor12 {
	public static void main(String args[]){
		ArrayList<OurClass2> objList =new ArrayList<OurClass2>();
		ArrayList<Integer> timeList =new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
        int t;
        int sum;
        int a,b;
        t = in.nextInt();
        for (int i=0;i<t;i++) {
            a = in.nextInt();
            b = in.nextInt();
            
            //System.out.println(sum);
            for(int j=0;j<a;j++){
            	int c= in.nextInt();
            	timeList.add(c);
            }
                        
            objList.add(new OurClass2(a,b,timeList));
            timeList.clear();
            
        }
       
        
		/*for(int i=0;i<objList.size();i++){
			objList.get(i).printTimes();
		}*/
    	for(int i=0;i<objList.size();i++){
    		if(objList.get(i).isOk())
    			System.out.println("NO");
    		else
    			System.out.println("YES");
    	}
    	
		
	}

}
class OurClass2{
	int stdWant;
	int allStd;
	ArrayList<Integer> times1= new ArrayList<Integer>();
	
	public OurClass2(int allStd,int stdWant,ArrayList<Integer> times){
		this.stdWant=stdWant;
		this.allStd=allStd;
		for(int i=0;i<times.size();i++){
			times1.add(times.get(i));
		}
	}
	
	public void printTimes(){
		for(int i=0;i<times1.size();i++){
			System.out.print(times1.get(i)+" ");
		}
		System.out.println(stdWant);
		System.out.println(allStd);
	}
	public boolean isOk(){
		if(times1.size()!=allStd)
			return false;
		int count=0;
		for(int i=0;i<times1.size();i++){
			if(!(times1.get(i)>0)){
				count++;
				//System.out.print(count+ " ");
			}
		}
		
		if(count<stdWant)
			return false;
		else
			return true;
	}
	
}
