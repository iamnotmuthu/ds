package org.learning.structure;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class Height {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		System.out.println(getHeight(root));

	}

	private static int getHeight(Node<Integer> root) {
		if(root==null)
			return 0;
		
		int lh=getHeight(root.left);
		int rh=getHeight(root.right);
		return lh>rh?lh+1:rh+1;
	}

}
