package org.learning.structure;

import java.util.LinkedList;
import java.util.Queue;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class HeightIterativeBFS {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		System.out.println(getHeight(root));

	}

	private static int getHeight(Node<Integer> root) {
		int h = 0;
		if (root == null)
			return h;
		Queue<Node> q = new LinkedList();
		q.add(root);
		
		while (!q.isEmpty()) {
			int ls = q.size();
			while (ls > 0) {
				Node temp = q.remove();
				--ls;
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
				q.add(temp.right);
			}
			++h;
		}
		return h;
	}

}
