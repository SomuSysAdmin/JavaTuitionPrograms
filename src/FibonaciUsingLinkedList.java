
/**
 * Dynamically generates and stores the first 49 elements of 
 * the fibonaci series in a linked list.
 * 
 * @author Somu
 *
 */

class lList {
	int data;
	lList next;
}

public class FibonaciUsingLinkedList {
	public static void main(String args[]) {
		
		lList node1 = new lList();
		lList node2 = new lList();
		node1.data = 0;
		node1.next = node2;
		node2.data = 1;
		node2.next = null;
		
		int len = 45;
		
		fiboLL(node1,node2,len);
		traverse(node1);
	}	
	
	private static void fiboLL(lList node1, lList node2, int len) {
		if(len>0) {
			lList newNode = new lList();
			newNode.data = node1.data + node2.data;
			node2.next = newNode;
			newNode.next = null;
			fiboLL(node2, newNode, len-1);
		}
	}

	public static void traverse(lList node) {
		System.out.println(node.data);
		if(node.next!=null) {
			traverse(node.next);
		}
	}
}
