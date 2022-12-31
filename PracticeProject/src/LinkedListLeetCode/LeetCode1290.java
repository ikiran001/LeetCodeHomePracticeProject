package LinkedListLeetCode;

public class LeetCode1290 {

	//Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	class Solution {
		public int getDecimalValue(ListNode head) {
			if(head==null){
				return 0;
			}
	
			String s="";
			ListNode temp=head;
			while(temp!=null && temp.next!=null) {
				s+=temp.val;
				
					temp=temp.next;
				
			}
			return binaryToInteger(s);
		}
		
		public int binaryToInteger(String binary) {
		    char[] numbers = binary.toCharArray();
		    int result = 0;
		    for(int i=numbers.length - 1; i>=0; i--)
		        if(numbers[i]=='1')
		            result += Math.pow(2, (numbers.length-i - 1));
		    return result;
		}
	}
}
