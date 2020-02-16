package org.learning.tree.search;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class SearchKey {

	public static void main(String[] args) {
		Node root = Tree.getTree();
		System.out.println(search(root,8));
	}

	private static Node search(Node root, int i) {
		if(root ==null)
			return null;
		if(root.data.equals(i)){
			return root;
		}
		Node left=search(root.left,i);
		Node right=search(root.right,i);
		return left == null ? right : left;
			
	}

}
