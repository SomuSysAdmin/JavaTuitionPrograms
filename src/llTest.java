import java.io.*;
class ll {
	int data;
	ll next;
}

public class llTest {
	public static void create_node(int val, int pos, ll node) {
		if(pos!=0)
			create_node(val, pos-1, node.next);
		else {
			ll newNode = new ll();
			newNode.data = val;
			newNode.next = node.next;
			node.next = newNode;
		}
	}
	
	public static int enter_ch() throws IOException {
		System.out.println("Enter choice: ");
		System.out.println("1. New Node");
		System.out.println("2. View List");
		System.out.println("3. Exit");
		System.out.print("Enter Choice: ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		return Integer.parseInt(in.readLine());
	}
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		ll start,end;
		start = end = null;		
		
		int ch;
		while((ch = enter_ch())!=3) {
			switch(ch) {
				case 1:		System.out.println("Enter Value: ");
							int val = Integer.parseInt(in.readLine());
							System.out.println("Enter Position: ");
							int pos = Integer.parseInt(in.readLine());
							create_node(val, pos, start);
							break;
							
				case 2 :	traverse(start);
							break;
							
				default:	System.out.println("Please try again!");
			}
		}
	}
	
	public static void traverse(ll node) {
		System.out.print(node.data+", ");
		if(node.next!=null)
			traverse(node.next);
		else
			System.out.println();
	}
}
