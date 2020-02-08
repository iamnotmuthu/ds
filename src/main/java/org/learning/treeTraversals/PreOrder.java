package org.learning.treeTraversals;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class PreOrder {

	public static void main(String[] args) {
		Node root=Tree.getTree();
		preOrder(root);
	}

	private static void preOrder(Node root) {
		if(root==null)
			return;
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
		
	}

}
