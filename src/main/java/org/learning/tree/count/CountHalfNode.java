package org.learning.tree.count;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class CountHalfNode {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		System.out.println(countHalf(root));

	}

	private static int countHalf(Node<Integer> root) {
		int count=0;
		if(root==null)
			return count;
		if(root.left==null && root.right==null)
			return count;
		if(root.left==null || root.right==null)
			 ++count;
		 count+=countHalf(root.left)+ countHalf(root.right);
		 return count;
	}

}
