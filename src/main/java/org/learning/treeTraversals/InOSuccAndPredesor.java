package org.learning.treeTraversals;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class InOSuccAndPredesor {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		inoPS(root, 6);
	}

	private static void inoPS(Node<Integer> root,int key) {
		if(root ==null)
			return;
		if(root.left!=null) {
			Node temp=root.left;
			while(temp.right!=null) {
				temp=temp.right;
			}
			System.out.println("Predessor of "+key +" is "+ temp.data);
		}
		
		if(root.right!=null) {
			Node temp=root.right;
			while(temp.left!=null) {
				temp=temp.left;
			}
			System.out.println("Predessor of "+key +" is "+ temp.data);
		}
		
	}

}
