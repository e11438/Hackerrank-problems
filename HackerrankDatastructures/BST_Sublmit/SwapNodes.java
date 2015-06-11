package BST_Sublmit;

import java.util.ArrayList;
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
class TreeNode {	
	int depth;
	int parent;
	int value;
	int leftIndex;
	int rightIndex;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int val,int lI,int rI,int p,int d){
		depth=d;
		parent=p;
		value = val;
		left = null;
		right = null;
		leftIndex=lI;
		rightIndex=rI;
	}
	
	public TreeNode(){
		depth=0;
		parent=0;
		value = 0;
		leftIndex=-1;
		rightIndex=-1;
		left = null;
		right = null;
	}
	
	public void setLeft(TreeNode node){
		left=node;
	}
	
	public void setRight(TreeNode node){
		right=node;
	}
	
	public void setValue(int val){
		value = val;
	}
	
	public int getValue(){
		return value;		
	}
	
	public TreeNode getLeft(){
		return left;
	}
	
	public TreeNode getRight(){
		return right;
	}
}

class BST {	

	ArrayList<TreeNode> depthNodes = new ArrayList<TreeNode>();	
	private TreeNode root;	

	public BST(){
		root = null;
	}
	public BST(int data,int li,int ri){
		root = new TreeNode(data,li,ri,0,1);
	}

	/*method to determine whether BST is empty or not*/
	public boolean isEmpty(){
		return root==null;
	}	

	/*method to insert a node to BST*/
	public void insert(int data,int li,int ri){
		insert(root,data,li,ri);
	}	

	private void insert(TreeNode node,int data,int li,int ri){
		if(node==null){
			return;
		}
		if(node.leftIndex==data){
			node.left=new TreeNode(data,li,ri,node.value,node.depth+1);
			return;
		}
		if(node.rightIndex==data){
			node.right=new TreeNode(data,li,ri,node.value,node.depth+1);
			return;
		}
		insert(node.left,data,li,ri);
		insert(node.right,data,li,ri);
	}	
	public void insert(TreeNode en){
		if(en.depth==1){
			root=en;
		}
		else{
		insert(root,en);
		}
	}
	
	private void insert(TreeNode node,TreeNode en){
		if(node==null){
			return;
		}
		if(node.leftIndex==en.value){
			node.left= en;
			return;
		}
		if(node.rightIndex==en.value){
			node.right= en;
			return;
		}
		insert(node.left,en);
		insert(node.right,en);
	}	
		
		


	/*method to delete a node from BST*/
	public void delete(int val){
		if(isEmpty()){
			 System.out.println("Tree Empty");
		}
		else if(!search(val))
			System.out.println("Sorry "+ val +" is not present");
		else{
			root=delete(root,val);
			 System.out.println(val+ " deleted from the tree");
		}
	}	

	private TreeNode delete(TreeNode node,int val){
		TreeNode n1,n2,k;		

		if(root.getValue()==val){
			TreeNode lt=root.getLeft();
			TreeNode rt=root.getRight();			

			if(lt==null&&rt==null)
				return null;
			else if(lt==null)
				return rt;
			else if (rt==null)
				return lt;
			else{
				n1=rt;
				n2=rt;
				while(n2.getLeft()!=null)
					n2=n2.getLeft();
				n2.setLeft(lt);
				return n1;
			}
		}

		if(val<root.getValue()){
			k=delete(root.getLeft(),val);
			root.setLeft(k);
		}
		else{
			k=delete(root.getRight(),val);
			root.setRight(k);
		}
		return root;		
	}	

	/*method to count number of nodes of BST*/
	public int countNodes(){
		return countNodes(root);
	}	

	private int countNodes(TreeNode node){
		if(node==null)
			return 0;
		else{
			int count=1;
			count+=countNodes(node.getLeft());
			count+=countNodes(node.getRight());
			return count;
		}
	}	

	/*method to search element of BST*/
	public boolean search(int val){
		return search(root,val);
	}	

	private boolean search(TreeNode node,int val){
		if(node!=null){
			if(node.value==val)
				return true;
			if(search(node.left,val))
				return true;
			else if(search(node.right,val))
				return true;
			else
				return false;
		}else
			return false;	
	}
	
	public TreeNode get(int data){
		return get(root,data);
	}
	
	
	
	private TreeNode get(TreeNode node,int val){
		
			if(node.value==val)
				return node;
			if(search(node.left,val))
				return get(node.left,val);
			else if(search(node.right,val))
				return get(node.right,val);
			return node;					
	}
	
	public void addToList(int d){
		if(d==1){
			depthNodes.add(root);
		}else{
			addToList(root,d);
		}
	}
	
	private void addToList(TreeNode node,int d){
		if(node==null)
			return;
		if(node.depth==d||node.depth%d==0)
			depthNodes.add(node);
		addToList(node.left,d);
		addToList(node.right,d);			
	}
	
	
	/*method for inorder traversal*/
	public void inOrder(){
		inOrder(root);
	}
	
	private void inOrder(TreeNode node){
		if(node != null){
			inOrder(node.getLeft());
			System.out.print(node.getValue() +" ");
			inOrder(node.getRight());
		}
	}
	
	/*method for preorder traversal*/
	public void preOrder(){
		preOrder(root);
	}
	
	private void preOrder(TreeNode node){
		if(node != null){
			System.out.print(node.getValue() +" ");
			inOrder(node.getLeft());			
			inOrder(node.getRight());
		}
	}
	
	/*method for postorder traversal*/
	public void postOrder(){
		postOrder(root);
	}
	
	private void postOrder(TreeNode node){
		if(node != null){			
			inOrder(node.getLeft());			
			inOrder(node.getRight());
			System.out.print(node.getValue() +" ");
		}
	}
	
}
