package BST;

import java.util.ArrayList;

public class BST {	

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
