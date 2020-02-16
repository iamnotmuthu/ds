package org.learning.structure;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class BST {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getBST();
		System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

	}

	private static boolean isBST(Node<Integer> root, int min, int max) {

		if (root == null)
			return true;
		if (root.data <= min || root.data > max) {
			return false;
		}

		return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);

	}

}
