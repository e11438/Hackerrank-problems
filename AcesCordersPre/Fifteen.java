
public class Fifteen {
	
	
		
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
	
	
	
	public static void main(String args[]){
		
		long sum=0;
		long[][] grid=new long[3][3];
		for(int i=0;i<3;i++){
			grid[0][i]=1;
			grid[i][0]=1;
		}
		//printArray(grid);
		
		for(int i=1;i<3;i++){
			sum=1;
			for(int j=1;j<3;j++){
				sum+=grid[j][i-1];
				grid[j][i]=sum;			
			}
			
		}
		printArray(grid);
		
	}

}
