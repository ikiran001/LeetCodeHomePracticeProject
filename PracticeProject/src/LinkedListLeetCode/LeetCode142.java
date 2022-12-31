package LinkedListLeetCode;

public class LeetCode142 {
	
	 // Definition for singly-linked list.
	  class ListNode {
	      int val;
	     ListNode next;
	      ListNode(int x) {
	         val = x;
	          next = null;
	      }
	  }
	 
	public class Solution {
	    public ListNode detectCycle(ListNode head) {
	    	ListNode fast=head, slow=head;
	    	while(fast!=null && fast.next!=null) {
	    		fast=fast.next.next;
	    		slow=slow.next;
	    		if(slow==fast) {
	    			slow=head;
	    			while(slow!=fast) {
	    				slow=slow.next;
	    				fast=fast.next;
	    			}
	    			return slow;
	    		}
	 		   	}
	    	return null;
	    }
	}
}
