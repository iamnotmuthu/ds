package org.learning.tree.search;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class MinVal {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		System.out.println(min(root));
	}

	private static int min(Node<Integer> root) {

		if (root == null)
			return Integer.MAX_VALUE;
		int left = min(root.left);
		int right = min(root.right);
		int res = root.data;
		if (left < res)
			res = left;
		if (right < res)
			res = right;
		return res;
	}

}
