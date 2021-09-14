package linkedList;

public class LinkedList<E> {

	private class Node {
		
		Node next;
		E data;
		
		public Node(E data) {
			this.data = data;
		}
	}
	
	private Node first;
	
	public void add(E info, int i) {
		
		if (first == null) {
			first = new Node(info);
			return;
		}

		Node newNode = new Node(info);
		
		if (i == 0) {
			newNode.next = first;
			first = newNode;
			return;
		}
		
		try {
			Node curr = first;
			for (int j = 0; j < i; j++) { 
				curr = curr.next;
			}
			
			newNode.next = curr.next;
			curr.next = newNode;
			
		}
		catch(NullPointerException e) {
			
			throw new IndexOutOfBoundsException();
		}
		
	}
	
}
