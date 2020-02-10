package org.learning.tree.count;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class CountLeaves {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		System.out.println(leafCount(root));

	}

	private static int leafCount(Node<Integer> root) {
		int count=0;
		if(root==null)
			return count;
		if(root.left==null && root.right==null)
			return  ++count;
		return (leafCount(root.left)+leafCount(root.right));
	}

}
