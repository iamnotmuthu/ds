package org.learning.structure;

import java.util.ArrayList;
import java.util.List;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class BalanceBST {

	public static void main(String[] args) {
		Node root = Tree.getBST();
		List al = new ArrayList();
		inOrder(root, al);
		Node cur=balance( al, 0, al.size()-1);
		System.out.println();
	}

	private static Node balance(List al, int start, int end) {
		Node root=null;
		if (start < end) {
			int mid = (start + end) / 2;
			 root = (Node) al.get(mid);
			root.left = balance( al, start, mid);
			root.right = balance( al, mid + 1, end);
		}
		return root;

	}

	private static void inOrder(Node root, List aList) {
		if (root == null)
			return;
		inOrder(root.left, aList);
		aList.add(root);
		inOrder(root.right, aList);

	}

}
