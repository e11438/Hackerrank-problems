package BST;

import java.util.Scanner;

public class SwapNodes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//BST btree =new BST(1, 2, 3);
		
		
		int nodes=in.nextInt();
		
		int left=in.nextInt();
		int right=in.nextInt();
		
		BST btree =new BST(1, left, right);
		
		
		for(int i=1;i<nodes;i++){
			left=in.nextInt();
			right=in.nextInt();
			
			btree.insert(i+1, left, right);
		}
		//btree.inOrder();
		
		int terms=in.nextInt();
		
		int depth;
		TreeNode node;
		TreeNode temp1;
		TreeNode temp2;
		for(int i=0;i<terms;i++){
			depth=in.nextInt();
			btree.addToList(depth);
			//System.out.println(btree.depthNodes.size());
			for(int j=0;j<btree.depthNodes.size();j++){
				if(btree.depthNodes.size()>j){
					node =btree.depthNodes.get(j);
				//System.out.println(node.left.value+" "+node.right.value);
					temp1=node.left;
					temp2=node.right;
					node.left=temp2;
					node.right=temp1;
					
					btree.insert(node);
				}
				//btree.inOrder();
				//System.out.println();
				//System.out.println(btree.depthNodes.get(i).value);
			}
			
			btree.inOrder();
			
			btree.depthNodes.clear();
			temp1=null;
			temp2=null;
			node=null;
			
		}
		
	/*	
		//btree.insert(1, 2, 3);
		btree.insert(2, -1, 4);
		btree.insert(3, -1, -1);
		btree.insert(4, 5, -1);
		btree.insert(5, -1, -1);*/
		/*int nodes=in.nextInt();
		int lchild;
		int rchild;
		
		for(int i=0;i<nodes;i++){
			lchild=in.nextInt();
			rchild=in.nextInt();
			
		}
*/
		
		/*btree.inOrder();
		
		System.out.println();
		if(btree.get(5)!=null)
			System.out.println(btree.get(5).leftIndex+"-"+btree.get(5).parent);
		TreeNode ne =new TreeNode(5,0,0,7,4);
		btree.insert(ne);
		
		btree.inOrder();
		
		System.out.println();
		if(btree.get(5)!=null)
			System.out.println(btree.get(5).leftIndex+"-"+btree.get(5).parent);
		//btree.addToList(2);
		//System.out.println(btree.depthNodes.size());
		for(int i=0;i<btree.depthNodes.size();i++){
			System.out.println(btree.depthNodes.get(i).value);
		}
	}*/

}
}