package com.java.coding.basics.algo;

public class MergeLists {
	
	public static void main(String[] args) {
		
	}
	
	public static ListNode mergeLists(ListNode ln1, ListNode ln2) {
		ListNode temp;
		ListNode head;
		if(ln1 == null) 
			return ln2;
		
		if(ln2 == null)
			return ln1;
		
		if(ln1.val < ln2.val) {
			temp = head = new ListNode(ln1.val);
			ln1 = ln1.next;
		} else {
			temp = head = new ListNode(ln2.val);
			ln2 = ln2.next;
		}
		
		while(ln1 != null && ln2 != null) {
			if(ln1.val < ln2.val) {
				temp.next = new ListNode(ln1.val);
				ln1 = ln1.next;
			} else {
				temp.next = new ListNode(ln2.val);
				ln2 = ln2.next;
			}
			temp = temp.next;
		}
		
		while(ln1 != null) {
			temp.next = new ListNode(ln1.val, ln1.next);
			temp = temp.next;
		}
		
		while(ln2 != null) {
			temp.next = new ListNode(ln2.val, ln2.next);
			temp = temp.next;
		}
		
		return temp;
		
	}
	

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
