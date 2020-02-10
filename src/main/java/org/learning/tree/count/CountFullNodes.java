package org.learning.tree.count;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class CountFullNodes {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		System.out.println(countFull(root));

	}

	private static int countFull(Node<Integer> root) {
		int count=0;
		if(root==null)
			return count;
		if(root.left!=null && root.right!=null)
			 ++count;
		count+=countFull(root.left)+countFull(root.right);
		return count;
	}

}
