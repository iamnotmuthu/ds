package org.learning.tree.amzProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class TopView {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		topView(root);

	}

	private static void topView(Node<Integer> root) {
		Map<Integer, List<Node>> map = new HashMap();
		if (root == null) {
			return;
		}

		Queue<Node> q = new LinkedList();
		Queue vq = new LinkedList();
		q.add(root);
		vq.add(0);
		List l = new ArrayList();
		l.add(root);
		map.put(0, l);
		int minval=0,maxval=0;
		while (!q.isEmpty()) {
			Node temp = q.remove();
			int val = (int) vq.remove();
			if(val<minval)
				minval=val;
			if(val>maxval)
				maxval=val;
			if (temp.left != null) {
				q.add(temp.left);
				vq.add(val - 1);

				List<Node> lis = map.get(val - 1);
				if (lis == null) {
					lis = new ArrayList();
				}
				lis.add(temp.left);
				map.put(val - 1, lis);
			}

			if (temp.right != null) {
				q.add(temp.right);
				vq.add(val + 1);

				List<Node> lis = map.get(val + 1);
				if (lis == null) {
					lis = new ArrayList();
				}
				lis.add(temp.right);
				map.put(val + 1, lis);
			}

		}
		System.out.println(map);
		
		for(int i=minval;i<=maxval;i++) {
			System.out.print (map.get(i).get(0)+"  ");
		}
	}

}
