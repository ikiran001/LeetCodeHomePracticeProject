package LinkedListLeetCode;



public class LeetCode148 {

	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	class Solution {
		public ListNode sortList(ListNode head) {
			if(head==null || head.next==null) {
				return head;
			}

			ListNode mid= findMid(head);
			ListNode left=sortList(head);
			ListNode right=sortList(mid);

			return merge(left, right);

		}

		public ListNode merge(ListNode list1, ListNode list2) {
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


		public ListNode findMid(ListNode head) {
			ListNode slow =head; 
			ListNode fast=head;
			while(fast!=null && fast.next!=null) {
				slow=slow.next;
				fast=fast.next.next;
			}
			return slow;
		}

	}
}
