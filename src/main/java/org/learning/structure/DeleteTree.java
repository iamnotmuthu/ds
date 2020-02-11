package org.learning.structure;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class DeleteTree {
	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		deleteTree(root);
		
	}

	private static void deleteTree(Node<Integer> root) {
		if(root==null)
			return;
		deleteTree(root.left);
		deleteTree(root.right);
		System.out.println("deleting"+root.data);
		root=null;
		
	}
}
