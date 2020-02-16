package org.learning.tree.amzProblems;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class ConstructMirrorTree {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		Node r = mirror(root);
		
	}

	private static Node mirror(Node<Integer> root) {

		if (root == null)
			return null;

		Node left = mirror(root.left);
		Node right = mirror(root.right);
		root.left = right;
		root.right = left;
		return root;
	}

}
