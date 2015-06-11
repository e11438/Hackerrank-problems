import java.util.ArrayList;
import java.util.Scanner;


public class FifteenAl {
	
	
		
	public static void printArray(long[][] array ){
		long num=0;
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[1].length;j++){
				num=array[i][j];
				System.out.print(num+"   ");
			}
			System.out.println();
		}
		
	}
	public static void printArrayList(ArrayList<ArrayList<Long>> gr){
		long num=0;
		for(int i=0;i<gr.size();i++){
			for(int j=0;j<gr.get(i).size();j++){
				num=gr.get(i).get(j);
				System.out.print(num+"   ");
			}
			System.out.println();
		}
		
	}
	
	
	
	public static void main(String args[]){
		
		ArrayList<Long> row1 = new ArrayList<Long>();
		ArrayList<Long> row2 = new ArrayList<Long>();
		ArrayList<ArrayList<Long>> gr = new ArrayList<ArrayList<Long>>();
		
		//long sum=0;
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		for(int j=0;j<t;j++){
			int width = in.nextInt();
			int height = in.nextInt();
			
			for(int i=0;i<=width;i++){
				row1.add((long) 1);
			}
			/*for(int i=0;i<=width;i++){
				System.out.print(row1.get(i)+" ");
				
			}
			System.out.println();*/
			for(int k=0;k<height;k++){
			
				
				long sum1=1;
				row2.add(sum1);
				for(int i=1;i<=width;i++){
					sum1=(row1.get(i)+row2.get(i-1));
					row2.add(sum1);
				}
			
	
				row1 = new ArrayList<Long>(row2);
				row2.clear();
				
			
				
				//printArrayList(gr);
			
			}
			System.out.println(row1.get(row1.size()-1));
			row1.clear();
			row2.clear();
		}
	}

}
