package org.learning.treeTraversals;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class PostOrder {

	public static void main(String[] args) {
		Node<Integer> root=Tree.getTree();
		postOrder(root);
	}

	private static void postOrder(Node<Integer> root) {
		if(root==null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
		
		
	}

}
