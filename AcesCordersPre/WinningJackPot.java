import java.util.Scanner;


public class WinningJackPot {

	/**
	 * @param args
	 */
	
	public static String toBinary2(int num){
		return Integer.toBinaryString(num);
	}
	
	public static void main(String[] args) {
		String c = "0010";
		int decimalValue = Integer.parseInt(c, 2);
		//System.out.println(bitAndWise("01","1"));
		//System.out.println(0&1);
		
		Scanner in = new Scanner(System.in);
        int num1;
        int num2;       
        int lim;
       
        num1 = in.nextInt();
        num2 = in.nextInt();
        lim = in.nextInt();
        
        for(int i=0;i<num1;i++){
        	for(int j=0;j<num2;j++){
        		
        		
        	}
        	
        }
		
	}
	
	public static String bitAndWise(String s1,String s2){
		int lenA=s1.length();
		int lenB=s2.length();
		int dif=0;
		String res="";
		
		if(lenA<lenB){	
			
			dif=lenB-lenA;
			
			for(int i=0;i<dif;i++){
				s1="0"+s1;
			}
		}
		else{
			dif=lenA-lenB;
			//System.out.println(dif);
			for(int i=0;i<dif;i++){
				s2="0"+s2;
			}
		}
		System.out.println(s1+" "+s2);
		if(s1.length()==s2.length()){
			for(int i=0;i<s1.length();i++){
				if(s1.charAt(i)=='0'&&s2.charAt(i)=='0')					
					res+="0";
				if(s1.charAt(i)=='1'&&s2.charAt(i)=='0')					
					res+="0";
				if(s1.charAt(i)=='0'&&s2.charAt(i)=='1')					
					res+="0";
				if(s1.charAt(i)=='1'&&s2.charAt(i)=='1')					
					res+="1";
						
				
			}
		}
		return res;
		
	}

}
