package org.learning.tree.amzProblems;

import java.util.Stack;

import org.learning.tree.util.Node;
import org.learning.tree.util.Tree;

public class ZigZag {

	public static void main(String[] args) {
		Node<Integer> root = Tree.getTree();
		zigzag(root);
	}

	private static void zigzag(Node<Integer> root) {
		if(root==null) 
			return ;
		Stack<Node> s1=new Stack();
		Stack <Node>s2=new Stack();
		
		s1.add(root);
		
		while(!s1.isEmpty() || !s2.isEmpty()) {
			while(!s1.isEmpty()) {
				Node cur=s1.pop();
				System.out.println(cur.data);
				if(cur.left!=null)
					s2.push(cur.left);
				if(cur.right!=null)
					s2.push(cur.right);
			}
			while(!s2.isEmpty()) {
				Node cur=s2.pop();
				System.out.println(cur.data);
				if(cur.right!=null)
					s1.push(cur.right);
				if(cur.left!=null)
					s1.push(cur.left);
				
			}
		}
		
	}

}
