package org.learning.structure;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class SearchKey {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		System.out.println(search(root,7));

	}

	private static boolean search(Node<Integer> root, int key) {
		if(root==null)
			return false;
		if(root.data==key) {
			return true;
		}
		return (search(root.left,key) || search(root.right,key));
	}

}
