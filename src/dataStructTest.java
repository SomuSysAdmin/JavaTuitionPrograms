
/**
 * A simple program implementing a singly linked list that is traversed using recursion.
 * 
 * @author Somu
 *
 */

class linkedList {
	int data;
	linkedList next;
}

public class dataStructTest {
	public static void main(String args[]) {
		
		linkedList node1 = new linkedList();
		linkedList node2 = new linkedList();
		linkedList node3 = new linkedList();
		linkedList node4 = new linkedList();
		linkedList node5 = new linkedList();
		
		node1.data = 2;
		node1.next = node2;
	
		node2.data = 3;
		node2.next = node3;
	
		node3.data = 5;
		node3.next = node4;
	
		node4.data = 8;
		node4.next = node5;
	
		node5.data = 13;
		node5.next = null;
		
		traverse(node1);
	}	
	
	public static void traverse(linkedList node) {
		System.out.println(node.data);
		if(node.next!=null) {
			traverse(node.next);
		}
	}
}
