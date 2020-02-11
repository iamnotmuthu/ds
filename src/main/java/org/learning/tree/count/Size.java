package org.learning.tree.count;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class Size {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		System.out.println(getSize(root));

	}

	private static int getSize(Node<Integer> root) {
		int size=0;
		if (root == null)
			return size;
		return(getSize(root.left)+1+getSize(root.right));
		
	}

}
