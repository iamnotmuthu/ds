package org.learning.tree.count;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class NodeDistance {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		nodeDis(root, 5, 0);

	}

	private static int nodeDis(Node<Integer> root, int x, int dis) {
		if (root == null)
			return dis;
		dis++;
		nodeDis(root.left, x, dis);
		nodeDis(root.right, x, dis);
		if (root.data == x) {
			System.out.println(dis);

		} else {
			dis--;
		}
		return dis;

	}

}
