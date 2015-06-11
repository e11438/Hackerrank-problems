package BST;

public class TreeNode {	
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

