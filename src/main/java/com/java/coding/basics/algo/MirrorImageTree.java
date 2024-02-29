package com.java.coding.basics.algo;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorImageTree {
	 public boolean isSymmetric(TreeNode root) {
	        if (root == null) return true;
	        Queue<TreeNode> q = new LinkedList<TreeNode>();
	        q.offer(root.left);
	        q.offer(root.right);
	        while (!q.isEmpty()) {
	            TreeNode n1 = q.poll();
	            TreeNode n2 = q.poll();
	            if (n1 == null && n2 == null) continue;
	            if (n1 == null && n2 != null) return false;
	            if (n1 != null && n2 == null) return false;
	            if (n1.val != n2.val) return false;
	            q.offer(n1.left);
	            q.offer(n2.right);
	            q.offer(n1.right);
	            q.offer(n2.left);
	        }
	        return true;
	    }

}
