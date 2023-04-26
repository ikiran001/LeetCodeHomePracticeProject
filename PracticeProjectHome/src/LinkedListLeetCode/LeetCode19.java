package LinkedListLeetCode;



public class LeetCode19 {

	
	
	// Definition for singly-linked list.
	  public class ListNode {
	     int val;
	      ListNode next;
	     ListNode() {
	    	 
	     }
	     
	      ListNode(int val) { 
	    	  this.val = val; }
	      
	      ListNode(int val, ListNode next) {
	    	  this.val = val; this.next = next; }
	  }
	 
	public static void main(String[] args) {
	

	}
	
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	      ListNode node=head;
	      for (int i = 1; i < n-1; i++) {
			node=node.next;
		}
	      ListNode prev=node;
	      return prev.next=prev.next.next;

	    }
	 
	 
	

}
