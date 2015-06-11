import java.util.Scanner;


public class FibonnacciWords {

	/**
	 * @param args
	 */
	
	//public static StringBuilder  
	
	public static StringBuilder findFib(int num){
		if(num==0)
			return new StringBuilder("0");
		if(num==1)
			return new StringBuilder("1");
		else
			return findFib(num-1).append(findFib(num-2));
	}
	public static void main(String[] args) {
		//StringBuilder name1=new StringBuilder("asdsd");
		//String name2 = Double.toString(Math.pow(2, 1000));
		//System.out.println(findFib(9));
		int sum=0;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int t;
        String pattern;
        //int a,b;
        t = in.nextInt();
        pattern = in.nextLine();
        pattern=pattern.substring(1);
        StringBuilder fib = findFib(t); 
        int len = pattern.length();
        
        for(int i=0;i<fib.length()-len+1;i++){
        	//System.out.println(fib.substring(i,i+len));
        	if(fib.substring(i, i+len).equals(pattern))
        		sum++;        	
        }
        //System.out.println(t);
       // System.out.println(pattern);
        System.out.println(sum);

	}

}
