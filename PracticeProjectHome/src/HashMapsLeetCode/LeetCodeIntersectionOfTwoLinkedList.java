package HashMapsLeetCode;
import java.util.*;
public class LeetCodeIntersectionOfTwoLinkedList {
	
	 // Definition for singly-linked list.
	  public class ListNode {
	    int val;
	     ListNode next;
	     ListNode(int x) {
	         val = x;
	         next = null;
	      }
	 }
	 
	public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        HashSet<Integer> set=new HashSet<>();
	        ListNode temp=headA;
	        while(temp.next!=null) {
	        	set.add(temp.val);
	        	temp=temp.next;
	        }
	        ListNode temp2=headB;
	        while(temp2.next!=null) {
	        	if(set.contains(temp2.val)) {
	        		return temp2;
	        	}
	        }
	        return null;
	    }
	}
}
