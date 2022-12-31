package LinkedListLeetCode;

public class LeetCode21 {

	public static void main(String[] args) {
	

	}
	
	
//	 Definition for singly-linked list.
	  public class ListNode {
	     int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	   }
	 
	class Solution {
	    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	    	ListNode head=new ListNode(); //ans or new ans node
	    	ListNode node=head; 
	    	
	    	while(list1!=null && list2!=null) {
	    		if(list1.val<list2.val) {
	    			node.next=list1;
	    			list1=list1.next;
	    			node=node.next;
	    		}
	    		else{
	    			node.next=list2;
	    			list2=list2.next;
	    			node=node.next;
	    		
	    		}
	    	}
	    	
	    	while(list1!=null) {
	    		node.next=list1;
	    		list1=list1.next;
	    		node=node.next;
	    	}
	    	while(list2!=null) {
	    		node.next=list2;
	    		list2=list2.next;
	    		node=node.next;
	    	}
	    	return head.next;
	    }
	}

}
