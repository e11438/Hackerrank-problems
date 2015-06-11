import java.util.Scanner;


public class NumberListSubed {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ArrayList<Integer> gaps = new ArrayList<Integer>();
		//String set = "";
		int sum=0;
		int count=0;
		int gapCount=0;
		//ArrayList<String> reslt = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
        int t;
        int numE;
        double bigNum=0;
        int el;
       
        t = in.nextInt();
        for (int i=0;i<t;i++) {
            numE = in.nextInt();
            
            bigNum = in.nextDouble();
            //sum=setSum(numE);
            for(int j=0;j<numE;j++){
            	sum+=(j+1);
            	el = in.nextInt();
            	//&&gapCount!=0
            	if(el>bigNum){
            		//gaps.add(gapCount);
            		//sum-=setSum(gapCount);
            		gapCount=0;
            	}else{
            		gapCount++;
            		//System.out.println(gapCount+" "+j+" "+el);
            		sum-=gapCount;
            	}
            	//set+=Double.toString(el);
            	
            }        	
        	System.out.println(sum);
        	//System.out.println("count-"+count+"-"+reslt.size());
        	
        	//--------------------------
        	//gaps.clear();
        	sum=0;
        	gapCount=0;
        	//set="";
        }
	}
}