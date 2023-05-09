package DSLinkedList;

public class DSDoublylinkedList {
	private Node head;

	private class Node {
		private int val;
		private Node next;
		private  Node prev;	

		public Node(int val, Node next, Node prev) {
			this.val = val;
			this.next = next;
			this.prev = prev;
		}

		public Node(int val) {
			this.val = val;
		}
	}


	//*******************************************************insert At first*************************************
	public void insertAtFirst(int val) {
		Node node=new Node(val);
		node.next=head;
		node.prev=null;
		if(head!=null) {
			head.prev=node;
		}
		head=node;
	}

	//*********************************************************************Display*****************************************

	public void display() {
		Node node=head;
		while(node!=null) {
			System.out.print(node.val+ " -> ");
			node=node.next;
		}
		System.out.println("End");
	}

	//*****************************************Insert At LAst*************************************************

	public void displayReverse() {
		Node node=head;
		Node last=null;
		while(node!=null) {
			System.out.print(node.val+ " -> ");
			last=node;
			node=node.next;
		}
		System.out.println("End");


		while(last!=null) {
			System.out.print(last.val+" -> ");
			last=last.prev;
		}
		System.out.println("End");
	}

	//****************************************InsertAtLAst******************************************************************



	public void inserAtLast(int val) {
		Node node=new Node(val);
		node.next=null;
		Node last=head;

		if(head==null) {
			node.prev=null;
			head=node;
			return;
		}

		while(last.next!=null) {
			last=last.next;
		}
		last.next=node;
		node.prev=last;


	}


	//********************************insert at element after*************************************
	public Node find(int val) {
		Node temp=head;
		while(temp!=null) {
			if(temp.val==val) {
				return temp;
			}
			temp=temp.next;
		}
		return null;
	}
//************************************************************************************************************ 
	public void insert(int after, int val) {
		Node p=find(after);
		if(p==null) {
			System.out.println("Does not Exist");
		}

		Node node=new Node(val);
		node.next=p.next;
		node.prev=p;
		p.next=node;
		if(node.next!=null) {
			node.next.prev=node; 
		}
	}
}

















