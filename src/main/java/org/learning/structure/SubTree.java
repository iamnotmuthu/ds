package org.learning.structure;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class SubTree {

	public static void main(String[] args) {
		Node<Integer> tree = Tree.getTree();
		
		Node<Integer> sub = new Node(9);
		sub.right=new Node(7);
		sub.right.left=new Node(0);

		System.out.println(isSub(tree, sub));

	}

	private static boolean isSub(Node<Integer> tree, Node<Integer> sub) {
		if (sub == null)
			return true;
		
		if (tree == null)
			return false;
		
		if(isSame(tree,sub)) {
			return true;
		}
	return isSub(tree.left,sub) || isSub(tree.right,sub);

	
	}
	

	private static boolean isSame(Node<Integer> left, Node<Integer> left2) {
		if(left==null && left2==null) {
			return true;
		}
		if(left==null || left2==null) {
			return false;
		}
		if(left.data.equals(left2.data) && isSame(left.left,left2.left) && isSame(left.right,left2.right))
			return true;
		return false;
	}

}
