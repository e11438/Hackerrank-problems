import java.util.Scanner;


public class EvenTree {

	/**
	 * @param args
	 */
	public static void printMat(int[][] mat){
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] makeG(int num){
		int[][] graph = new int[num][num];
		for(int i=0;i<graph.length;i++){
			for(int j=0;j<graph[i].length;j++){
				graph[i][j]=0;
			}			
		}
		return graph;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int node1;
		int node2;
		
		int numOfV=in.nextInt();
		int numOfE=in.nextInt();
		
		int[][] graph = makeG(numOfV);
		
		for(int i=0;i<numOfE;i++){
			node1=in.nextInt();
			node2=in.nextInt();
			if(node1<=numOfV&&node2<=numOfV){
				if(node1<node2){
					graph[node1-1][node2-1]=1;
				}else{
					graph[node2-1][node1-1]=1;
				}
			}
			
		}
		
		//printMat(graph);
		
		System.out.println(countNumOfChilds(7,graph));
		//System.out.println(countNumOfChilds(numOfV-2,graph));
		//System.out.println(countNumOfChilds(1,graph));
	}
	public static int countNumOfChilds(int v,int[][] g){
		int sum=0;
		for(int i=0;i<g[v].length;i++){
			if(g[v][i]>0){
				//System.out.println(i);
				sum++;
				sum+=countNumOfChilds(i,g);
			}
		}
		return sum;
	}

}
