import java.util.ArrayList;
import java.util.Scanner;


public class SmartCheater {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> code1= new ArrayList<String>();
		ArrayList<String> code2= new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		int flag =0;
		
		String line =in.nextLine();	
		
		while(flag<2){		
		
			if(flag==0){
				code1.add(line.trim());
			}
			else if(flag==1){
				code2.add(line.trim());
			}
			line =in.nextLine();
			if(line.trim().equals("/*finish*/")){
				
				flag++;
			}
		}
		
		for(int i=0;i<code1.size();i++){
			System.out.println(code1.get(i));
		}
		System.out.println("==========code 2=======================");
		for(int i=0;i<code1.size();i++){
			System.out.println(code2.get(i));
		}
	}

}
