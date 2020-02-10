package org.learning.treeTraversals;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class BoundryTraversal {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		traverseLeft(root);
		traverseRight(root);
		printLeaves(root);
	}

	private static void printLeaves(Node<Integer> root) {
		if(root==null)
			return;
		if(root.left==null&& root.right==null) {
			System.out.println(root.data);
		}
		else {
			printLeaves(root.left);
			printLeaves(root.right);
		}
		
	}

	private static void traverseLeft(Node<Integer> root) {
		if(root==null) {
			return;
		}
		
		while(root.left!=null) {
			System.out.println(root.data);
			root=root.left;
		}
		if(root.right!=null) {
			System.out.println(root.data);
			traverseLeft(root.right);
		}
	}
	
	private static void traverseRight(Node<Integer> root) {
		if(root==null) {
			return;
		}
		
		while(root.right!=null) {
			System.out.println(root.data);
			root=root.right;
		}
		if(root.left!=null) {
			System.out.println(root.data);
			traverseRight(root.left);
		}
	}
	

}
