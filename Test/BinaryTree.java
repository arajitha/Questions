package Test;

import java.util.LinkedList;
import java.util.Queue;



public class BinaryTree {
	private static class Node1 {
		private Node1 left;
		private Node1 right;
		private int data;
		  
		public Node1(int data){
			this.data = data;
		}
	
		public void setData(int data) {
			this.data = data;
		}
	
		public int getData() {
			return data;
		}
	
		public Node1 getLeft() {
			return left;
		}
	
		public void setLeft(Node1 left) {
			this.left = left;
		}
	
		public Node1 getRight() {
			return right;
		}
	
		public void setRight(Node1 right) {
			this.right = right;
		}	

	}
	
	public static int size(Node1 root){
		if (root == null){
			return 0;
		}
		return (size(root.getLeft()) + 1 + size(root.getRight()));
	}
	
	public static void preOrderTraversal(Node1 root){
		if(root!= null){
			System.out.print(root.getData() + " ");
			preOrderTraversal(root.getLeft());
			preOrderTraversal(root.getRight());
		}
	}
	
	public static void inOrderTraversal(Node1 root){
		if(root!= null){
			inOrderTraversal(root.getLeft());
			System.out.println(root.getData() + " ");
			inOrderTraversal(root.getRight());
		}
	}
	
	public static void postOrderTraversal(Node1 root){
		if(root!= null){
			postOrderTraversal(root.getLeft());
			postOrderTraversal(root.getRight());
			System.out.println(root.getData() + " ");

		}
	}
	
	public static void levelOrderTraversal(Node1 n){
		Queue<Node1> queue = new LinkedList<Node1>();
		if (n!=null){
			queue.add(n);
		}
		while (!queue.isEmpty()){
			Node1 next = queue.remove();

			System.out.println(next.getData());
			if (next.getLeft()!= null)
				queue.add(next.getLeft());
			if (next.getRight()!= null)
				queue.add(next.getRight());
			
		}
		
	}
	
	public static int getTreeHeight(Node1 root){
		if (root == null){
			return 0;
		}
		int	lheight = getTreeHeight(root.getLeft());
		int rheight = getTreeHeight(root.getRight());
		if (lheight > rheight){
			return lheight + 1;
		} else {
			return rheight + 1;
		}
		
	}
	
	public static int getLeafCount(Node1 root){
		if(root == null) return 0;
		else if (root.getLeft() == null && root.getRight() == null) return 1;
		return getLeafCount(root.getLeft()) + getLeafCount(root.getRight());
	}
	
	public static void main(String[] args){
		Node1 one = new Node1(1);
		Node1 two = new Node1(2);
		Node1 three = new Node1(3);
		Node1 four = new Node1(4);
		Node1 five = new Node1(5);
		one.setLeft(two);
		one.setRight(three);
		two.setLeft(four);
		two.setRight(five);
		//four.setLeft(new Node1(6));

		System.out.println("Preorder  : 1 2 4 5 3.");
		preOrderTraversal(one);
		System.out.println("Inorder  : 4 2 5 1 3.");
		inOrderTraversal(one);
		System.out.println("Postorder  :  4 5 2 3 1" );
		postOrderTraversal(one);
		System.out.println("LevelOrder  :  1 2 3 4 5" );
		levelOrderTraversal(one);
		
		System.out.println("Size  :" +getLeafCount(one));

		System.out.println("Size  :" +size(one));
		
		System.out.println("Size  :" +size(one));
		
		System.out.println("Tree Height "  +getTreeHeight(one));

	}
}
