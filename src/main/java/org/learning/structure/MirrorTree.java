package org.learning.structure;

import org.learning.tree.util.Node;

public class MirrorTree {

	public static void main(String[] args) {
		Node<Integer> root = new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		
		Node<Integer> root1 = new Node(1);
		root1.left=new Node(3);
		root1.right=new Node(2);
		
		
		System.out.println(isMirrorTree(root,root1));
	}

	private static boolean isMirrorTree(Node<Integer> root, Node<Integer> root1) {
		if(root==null && root1==null) {
			return true;
		}
		if(root==null || root1==null) {
			return false;
		}
		return (root.data .equals(root1.data)&& isMirrorTree(root.left,root1.right)
				&&isMirrorTree(root.right,root1.left));
		
	}

}
