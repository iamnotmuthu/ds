package org.learning.structure;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class ConvertToMirror {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		convert(root);

	}

	private static void convert(Node<Integer> root) {
		if(root ==null)
			return;
		convert(root.left);
		convert(root.right);
		Node temp=root.left;
		root.left=root.right;
		root.right=temp;
		
	}

}
