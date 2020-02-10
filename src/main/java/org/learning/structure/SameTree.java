package org.learning.structure;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class SameTree {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		Node<Integer> root1 = Tree.getTree();
		System.out.println(isSameTree(root,root1));
	}

	private static boolean isSameTree(Node root,Node root1) {
		
		if(root==null && root1==null) {
			return true;
		}
		if(root==null || root1==null)
			return false;
		
		return (root.data.equals(root1.data)&& isSameTree(root.left, root1.left) && isSameTree(root.right,root1.right));
	}

}
