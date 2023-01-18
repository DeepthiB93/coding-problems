package com.geeksforgeeks.problems;

/*
 * Given a singly linked list of N nodes. 
 * Find the first node of the loop if the linked list has a loop.
 * If a loop is present return the node data of the first node of the loop else return -1.
 */
public class FindFirstNode {
	
	class Node
	{
	    int data;
	    Node next;
	    
	    Node(int x)
	    {
	        data = x;
	        next = null;
	    }
	}

	public static int findFirstNode(Node head){
        if (head == null || head.next == null) {
            return -1;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast.next != null && fast.next.next != null) {
            if (slow == fast) break;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow != fast) return -1;

        while (head != slow.next) {
            head = head.next;
            slow = slow.next;
        }
        return head.data;
    }
}
