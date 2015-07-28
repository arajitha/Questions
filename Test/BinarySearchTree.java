package Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
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
	
	public static void levelOrder(Node1 root){
		Queue<Node1> queue = new LinkedList<Node1>();
		if (root!=null) queue.add(root);
		while (!queue.isEmpty()){
			Node1 next = queue.remove();
			System.out.println(next.getData());
			if(next.getLeft() != null)
				queue.add(next.getLeft());
			if(next.getRight() != null)
				queue.add(next.getRight());
			
		}
		
	}
	
	public static boolean findKey(Node1 root, int key){
		if(root == null) return false;
		int value = root.getData();
		if (value == key){
			return true;
		}
		else if (value > key){
			return findKey(root.getLeft(), key);
		}
		else{
			return findKey(root.getRight(), key);
		}
	}
	
	public static Node1 insertKey(Node1 root, int key){
		if(root == null){
			return new Node1(key);
		} 
		int value = root.getData();
		if (value > key){
			root.setLeft(insertKey(root.getLeft(), key));	
		}
		if (value < key){
			root.setRight(insertKey(root.getRight(), key));		
		}
		return root;
		
	}
	
	public static void inOrderTraversal(Node1 root){
		if(root!= null){
			inOrderTraversal(root.getLeft());
			System.out.println(root.getData() + " ");
			inOrderTraversal(root.getRight());
		}
	}
	
	
	public static void kthSmallestElement(Node1 root, int k){
		Node1 current = root;
		Stack<Node1> s = new Stack<Node1>();
		while(current != null || !s.isEmpty()){
			if(current != null){
			    s.push(current);
			    current = current.left;
			} else if(!s.isEmpty()) {
			    current = s.pop();
			    k--;
			    if(k==0){	
			    	System.out.println(current.getData());
			        return;
			    }
			    current = current.right;
			}
	   }	
	}
	
	public static void inOrderWithoutRecursion(Node1 root){
		Node1 current = root;
		Stack<Node1> s = new Stack<Node1>();
		while(current != null || !s.isEmpty()){
			if(current != null){
			    s.push(current);
			    current = current.left;
			} else if(!s.isEmpty()) {
			    current = s.pop();
			    System.out.println(current.getData());
			    current = current.right;
			}
	   }
	}
	
	// Find lowest common ancestor
	public static void findLowestCommonAncestor(Node1 root, int k1, int k2){
		while(root != null){
			if(root.getData() > k1 && root.getData() > k2){
				root = root.getLeft();
			} else if(root.getData() < k1 && root.getData() < k2){
				root = root.getRight();
			} else{
				System.out.println("Lowest common ancestor : " +root.getData());
				return;
			}
		}
		
	}
	
	public static boolean isBST(Node1 root, int min, int max){
		if (root == null){
			return true;
		}
		else if (root.getData() <= min || root.getData() >= max){
			return false;
		}
		return (isBST(root.getLeft(), min, root.getData()) && isBST(root.getRight(), root.getData(), max));
		 
	}
	
	public static boolean isBST(Node1 root){
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	
	// delete node in binary tree
	
	public static Node1 deleteKey(Node1 root, int key){		
		
		return root;
		
	}
	
	public static void main(String[] args){
		Node1 one = new Node1(4);
		Node1 two = new Node1(3);
		Node1 three = new Node1(5);
		Node1 four = new Node1(1);
		Node1 five = new Node1(2);
		one.setLeft(two);
		one.setRight(three);
		two.setLeft(four);
		two.setRight(five); 
		levelOrder(one);		
		System.out.println("Node for key found :" +findKey(one, 1));
		

		Node1 root = null;
		root = insertKey(root, 50);
		insertKey(root, 30);
		insertKey(root, 20);
		insertKey(root, 40);
		insertKey(root, 70);
		insertKey(root, 60);
		insertKey(root, 80);
		System.out.println("Inorder traversal after insertion: 20 30 40 50 60 70 80");
		inOrderTraversal(root);		
		System.out.println("Inorder traversal without recursion: 20 30 40 50 60 70 80");

		inOrderWithoutRecursion(root);
		System.out.println("kth smallest element : ");
		kthSmallestElement(root,5);
		findLowestCommonAncestor(root, 20, 40);
		boolean isBST = isBST(root);
		System.out.println("isBST : " +isBST);
		
		Node1 one1 = new Node1(4);
		Node1 two1 = new Node1(3);
		Node1 three1 = new Node1(5);
		Node1 four1 = new Node1(1);
		Node1 five1 = new Node1(2);
		one1.setLeft(two1);
		one1.setRight(three1);
		two1.setLeft(five1);
		two1.setRight(four1); 
		boolean isBST1 = isBST(one1);

		System.out.println("isBST : " +isBST1);

	}

}
