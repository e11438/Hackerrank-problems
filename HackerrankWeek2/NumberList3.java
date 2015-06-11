import java.util.ArrayList;
import java.util.Scanner;


public class NumberList3 {

	/**
	 * @param args
	 */	
	public static void main(String[] args) {
		String set = "";
		int sum=0;
		int count=0;
		int gapCount=0;
		Scanner in = new Scanner(System.in);
        int t;
        String numE;
        String bigNum;
        String el;
       
        t = Integer.parseInt(in.nextLine());
        for (int i=0;i<t;i++) {
            numE = in.nextLine();
           if(numE.length()>0&&numE.charAt(0)==' ')
        	   numE=numE.substring(1);
            bigNum = in.nextLine();
            if(bigNum.length()>0&&bigNum.charAt(0)==' ')
            	bigNum=bigNum.substring(1);
            System.out.print(numE+" - "+bigNum);
            
            sum=setSum(Integer.parseInt(numE));
            
            for(int j=0;j<Integer.parseInt(numE);j++){
            	el = in.nextLine();
            	if(el.compareTo(bigNum)>0&&gapCount!=0){
            		//gaps.add(gapCount);
            		sum-=setSum(gapCount);
            		gapCount=0;
            	}else{
            		gapCount++;
            	}
            	set+=el;
            	
            }
           
           
        	
        	
        	System.out.println(sum);
        	//System.out.println("count-"+count+"-"+reslt.size());
        	
        	//--------------------------
        	//gaps.clear();
        	sum=0;
        	gapCount=0;
        	set="";
        }
	}
	public static int setSum(int num){
		int sum=0;
		for(int i=0;i<num;i++){
			sum+=(num-i);
		}
		return sum;
	}

}
