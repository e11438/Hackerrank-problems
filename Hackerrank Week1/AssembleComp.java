import java.util.ArrayList;
import java.util.Scanner;


public class AssembleComp {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int[] arr=new int[6];
		int min=Integer.MAX_VALUE;
		
				
		String t;
		t = in.nextLine();
		t=t.toUpperCase();
		
		for(int i=0;i<t.length();i++){
			if((t.charAt(i)+"").equals("A")){
				arr[0]++;
			}
			if((t.charAt(i)+"").equals("D")){
				arr[1]++;
			}
			if((t.charAt(i)+"").equals("X")){
				arr[2]++;
			}
			if((t.charAt(i)+"").equals("Y")){
				arr[3]++;
			}
			if((t.charAt(i)+"").equals("P")){
				arr[4]++;
			}
			if((t.charAt(i)+"").equals("R")){
				arr[5]++;
			}
			
		}
		//System.out.println(A+" "+D+" "+X+" "+Y+" "+P+" "+R);
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println(min);
		
	}

}
