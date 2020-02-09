
public class LinkedListMinimal {

	public static void main(String[] args) {
		Node node7 = new Node(7);
		Node node6 = new Node(6, node7);
		Node node5 = new Node(5, node6);
		Node node4 = new Node(-4, node5);
		Node node3 = new Node(3, node4);
		Node node2 = new Node(2, node3);
		Node node1 = new Node(1, node2);
		
		System.out.println(linkedListMinimal(node1));

		linkedListMinimal(node1);
	}

	public static int linkedListMinimal(Node node) {
		if (node == null) {
			return 0;
		}
		if (node.getNext() == null) {
			return node.getValue();
		}
		return Math.min(linkedListMinimal(node.getNext()), node.getValue());
			
		}

		
	}


