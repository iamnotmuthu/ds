package org.learning.structure;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class DeleteLeaves {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		delete(root);
	}

	private static void delete(Node<Integer> root) {
		if (root == null)
			return;
		delete(root.left);
		if (root.left == null && root.right == null) {
			System.out.println("deleting"+root.data);
			root = null;
			return;
		}
		delete(root.right);

	}

}
