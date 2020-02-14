package org.learning.structure;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class CompleteTree {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		System.out.println(isComplete(root, false));

	}

	private static boolean isComplete(Node<Integer> root, boolean flag) {

		if (root == null)
			return true;
		if (root.left == null && root.right != null) {
			return false;
		}
		if (flag) {
			if (root.left == null || root.right == null)
				return false;
		}
		if (root.left != null && root.right == null) {
			flag = true;
			return true;
		}
		return isComplete(root.left, flag) && isComplete(root.right, flag);
	}

}
