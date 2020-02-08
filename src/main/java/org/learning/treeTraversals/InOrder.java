package org.learning.treeTraversals;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class InOrder {

	public static void main(String[] args) {
		
		Node<Integer> root=Tree.getTree();
		
		inorder(root);
	}

	private static void inorder(Node<Integer> root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
		
	}

}
