
public class LinkedListEraseLastMember {

	public static void main(String[] args) {
		Node node7 = new Node(7);
		Node node6 = new Node(6, node7);
		Node node5 = new Node(5, node6);
		Node node4 = new Node(4, node5);
		Node node3 = new Node(3, node4);
		Node node2 = new Node(2, node3);
		Node node1 = new Node(1, node2);

		eraseLastMember(node1);

		printLinkedList(node1);
	}

	public static void eraseLastMember(Node node) {
		while (node.getNext().getNext() != null) {
			node = node.getNext();
		}
		node.setNext(null);
		return;
	}



	public static void printLinkedList(Node node) {
		if (node == null) {
			return;
		}
		System.out.println(node.getValue());
		printLinkedList(node.getNext());
	}

}
