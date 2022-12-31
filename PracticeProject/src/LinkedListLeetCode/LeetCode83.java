package LinkedListLeetCode;


public class LeetCode83 {



	//  Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	class Solution {
	
		public static ListNode deleteDuplicates(ListNode head) {
			ListNode node=head;
			if(node==null){
				head=null;
				return head;
			}
			while(node.next!=null){
				if(node.val==node.next.val){
					node.next=node.next.next;
				}
				else{
					node=node.next;
				}
			}
			node.next=null;
			return head;
		}
	}
}
