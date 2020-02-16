package org.learning.tree.amzProblems;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class Sibling {

	public static void main(String[] args) {
		Node root = Tree.getTree();
		System.out.println(getSibling(root, 3));

	}

	/**
	 * 6 / \ 3 8 / \ 2 4 \ 5
	 * 
	 * @param root
	 * @param i
	 * @return
	 */
	private static Node getSibling(Node<Integer> root, Integer i) {
		if (root == null)
			return null;

		if (root.data.equals(i)) {
			return root;
		}
		/*
		 * if(root.left!=null && root.left.data.equals(i)) return root.right;
		 * if(root.right!=null && root.right.data.equals(i)) return root.left;
		 */
		Node left = getSibling(root.left, i);
		Node right = getSibling(root.right, i);

		
		if (left != null && left.data.equals(i))
			return root.right;
		if (right != null && right.data.equals(i))
			return root.left;

		return (left != null) ? left : right;

	}

}
