import java.util.Scanner;


public class funyString {

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
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String str,revStr;
		boolean flg=true;
		
		String tStr= in.nextLine();
		int t=Integer.parseInt(tStr);
		
		for(int i=0;i<t;i++){
			str=in.nextLine().trim();
			revStr=reverse5(str);
			for(int j=0;j<str.length()-1;j++){
				if(j+1<str.length()&&j+1<=revStr.length()){
					int diff1=Math.abs((int)str.charAt(j+1)-(int)str.charAt(j));
					int diff2=Math.abs((int)revStr.charAt(j+1)-(int)revStr.charAt(j));
					//System.out.print(diff1+"-"+diff2+" ->");
					if(diff1!=diff2){
						flg=false;
						break;
					}
				}
			}
			//System.out.println();
			if(flg){
				System.out.println("Funny");
			}
			else{
				System.out.println("Not Funny");
			}
			flg=true;
		}

	}

}
