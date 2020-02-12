
public class LinkedListSequences {

	public static void main(String[] args) {
		Node node10 = new Node(3);
		Node node9 = new Node(3, node10);
		Node node8 = new Node(3, node9);
		Node node7 = new Node(7, node8);
		Node node6 = new Node(3, node7);
		Node node5 = new Node(3, node6);
		Node node4 = new Node(4, node5);
		Node node3 = new Node(3, node4);
		Node node2 = new Node(3, node3);
		Node node1 = new Node(3, node2);

		int num = 3;

		System.out.println(amountOfSequencesInLinkedList(node1, num));

	}

	public static int amountOfSequencesInLinkedList (Node node, int num) {
		if (node == null) {
			return 0;
		}

		int counter = 0;
		
		if (node.getValue() == num && node.getNext().getValue() == num) {
			counter++;
		}

		while (node.getNext().getNext() != null) {
			if (node.getNext().getValue() == num && node.getNext().getNext().getValue() == num) {
				if (node.getValue() != num) {
					counter++;
				}
			}
			node = node.getNext();
		}
		return counter;
	}
}