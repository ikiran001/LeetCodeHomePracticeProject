package DSLinkedList;



public class LL {
	private Node head;
	private Node tail;
	private int size;

	public LL() {
		this.size=0;
	}
	
	
	private class Node{
		private int val;
		private Node next;

		public Node(int val) {
			this.val = val;
		}

		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}
	//****************************************************insert At First**********************************************	***************************
	public void insertAtFirst(int val) {
		if(tail==null) {
			tail=head;
		}
		Node node=new Node(val);
		node.next=head;
		head=node;
		size+=1;
	}
	//*********************************************** display*********************************************************************************
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.val+" -> ");
			temp=temp.next;
		}
		System.out.println(" END");

	}

	//******************************************Insert at last******************************************
	public void inserAtLast(int val) {
		if(tail==null) {
			insertAtFirst(val);
			return;
		}
		Node node=new Node(val);
		tail.next=node;
		tail=node;
		size++;
	}

	//************************** Insert at any index //**************************//**************************//**************************//**************************
	public void insert(int val, int index) {

		if(index==0) {
			insertAtFirst(val);
			return;
		}
		if(index==size) {
			inserAtLast(val);
			return ;
		}
		Node temp=head;
		for (int i = 1; i < index; i++) {
			temp=temp.next;
		}
		Node node=new Node(val, temp.next);
		temp.next=node;
		size++;
	}

	//************************************************************Delete First Element *********************************************************************
	public int  deleteFirst() {
		int value=head.val;
		head=head.next;
		if(head==null) {
			tail=null;
		}
		size--;
		return value;
	}

	//********************************************************Delete last element***************************************************************
	public int deleteLast() {
		if(size<=1) {
			return deleteFirst();
		}
		Node secondLast=get(size-2);
		int value=tail.val;
		tail=secondLast;
		tail.next=null;
		return value;
	}





	//********************************************************get any element of index you want***************************************************************
	public Node get(int index) {
		Node node=head;
		for (int i = 1; i < index; i++) {
			node=node.next;
		}
		return node;
	}

	//	//********************************************************delete any element with the help of index***************************************************************

	public int delete(int index) {
		if(index==0) {
			return deleteFirst();
		}

		if(index==size-1) {
			return deleteLast();
		}

		Node prev=get(index-1);
		int val=prev.next.val;
		prev.next=prev.next.next;

		return val;

	}

	//********************************************************get any node of given value*************************************


	public Node value(int value) {
		Node node=head;
		while(node!=null) {
			if(node.val==value) {
				return node;
			}
			node=node.next;
		}
		return null;

	}



















}
