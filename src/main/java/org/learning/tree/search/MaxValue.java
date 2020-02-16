package org.learning.tree.search;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class MaxValue {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		System.out.println(max(root));
	}

	private static int max(Node<Integer> root) {
		if(root==null)
			return Integer.MIN_VALUE;
		int rd=root.data;
		int l=max(root.left);
		int r=max(root.right);
		if(rd>l && rd>r) {
			return rd;
		}
		if(l>r)
			return l;
		return r;
			
		
	}

}
