import java.util.Scanner;


public class Funny {

	/**
	 * @param args
	 */
	public static String reverse5(final String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }
	public static void main(String[] args) {	
		
		Scanner in = new Scanner(System.in);
        int t;
        String str;  
        String rev;
        boolean flg=true;
       
        t = Integer.parseInt(in.nextLine());
        for (int i=0;i<t;i++) {
        	str=in.nextLine();
        	rev = reverse5(str);
        	if(str.length()==rev.length()){
        		
        		for(int j=1;j<str.length();j++){
        			if(j<str.length()&&j<rev.length()){
        				int num1=(int)str.charAt(j)-(int)str.charAt(j-1);
        				int num2=(int)rev.charAt(j)-(int)rev.charAt(j-1);
        				//System.out.println(num1+" "+num2);
        				if(Math.abs(num1)!=Math.abs(num2)){
	        				System.out.println("Not Funny");
	        				
	        				//System.out.println(str.charAt(j)+"-"+str.charAt(j-1)+"!="+rev.charAt(j)+"-"+rev.charAt(j-1));
	        				flg=false;
	        				break;
        				}
        			}
        				
        		}
        		if(flg)
        			System.out.println("Funny");
        		
        		flg=true;
        	}
        	
        }
		
	}

}
