package DSLinkedList;

public class CircularLinkedList {
	private Node head;
	private Node tail;



	public CircularLinkedList() {
		head=null;
		tail=null;
	}



	private class Node{
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	//*************************InsertAtFirst***************************

	public void inserAtFirst(int value) {
		Node node=new Node(value);

		if(head==null) {
			head=node;
			tail=node;
			return;
		}
		tail.next=node;
		node.next=head;
		tail=node;
	}

///**********************Display*************************************
	
	
	public void display() {
		Node temp=head;
		if(head!=null) {
			do {
				System.out.print(temp.val+" -> ");
				temp=temp.next;
			}while(temp!=head);
		}
	}
}
