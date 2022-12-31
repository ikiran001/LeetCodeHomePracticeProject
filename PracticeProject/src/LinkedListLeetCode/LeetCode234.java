package LinkedListLeetCode;

public class LeetCode234 {

	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	class Solution {
		
		public ListNode reverse(ListNode head) {
			ListNode previous=null;
			ListNode present=head;
			ListNode next=present.next;
			while(present!=null) {
				present.next=previous;
				previous=present;
				present=next;
				if(next!=null) {
					next=next.next;
				}
			}
			return previous;
		}
		
		
		public boolean isPalindrome(ListNode head) {
			ListNode mid=mid(head);
			ListNode head2=reverse(mid);
			ListNode reversehead=head2;
			
			while(head!=null && head2!=null) {
				if(head.val!=head2.val) {
					break;
				}
				head=head.next;
				head2=head2.next;
			}
			
			reverse(reversehead);
			return (head==null || head2==null);
		}

		public ListNode mid(ListNode head) {
			ListNode s=head;
			ListNode f=head;
			while(f!=null && f.next!=null) {
				s=s.next;
				f=f.next.next;
			}
			return s;
		}
	}
}
