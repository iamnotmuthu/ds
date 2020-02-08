package org.learning.treeTraversals;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class BorderTraversal {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		traverseLeft(root);

	}

	private static void traverseLeft(Node<Integer> root) {
		if(root==null) {
			return;
		}
		
		traverseLeft(root);
	}

}
