package LinkedListLeetCode;

import LinkedListLeetCode.LeetCode234.ListNode;

public class LeetCode143 {

	
	  public void reorderList(ListNode head) {
		  
		  if(head==null || head.next==null) {
			  return ;
		  }
		  ListNode mid=mid(head);
		   ListNode hs=reverse(mid);
		   
		  ListNode hf=head;
		  
		  while(hf!=null && hs!=null) {
			  ListNode temp=hf.next;
			  hf.next=hs;
			  hf=temp;
			  
			  temp=hs.next;
			  hs.next=hf;
			  hs=temp ;
		  }
		  
		  if(hf!=null) {
			  hf.next=null;
		  }
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
}
