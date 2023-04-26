package LinkedListLeetCode;
public class LengthOfTheCycle {

	public static void main(String[] args) {


	}



	//  Definition for singly-linked list.
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public int hasCycle(ListNode head) {
			ListNode fast=head;
			ListNode slow=head;
			while(fast!=null && fast.next!=null){
				fast=fast.next.next;
				slow=slow.next;
				if(fast==slow){
					ListNode temp=slow;
					int length=0;
					do {
						temp=temp.next;
						length++;
					}while(temp!=slow);
					return length;
				}
			}
			return 0;
		}
	}


}
