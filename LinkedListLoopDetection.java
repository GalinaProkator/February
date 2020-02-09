
public class LinkedListLoopDetection {

	public static void main(String[] args) {
		Node node7 = new Node(7);
		Node node6 = new Node(6, node7);
		Node node5 = new Node(5, node6);
		Node node4 = new Node(4, node5);
		Node node3 = new Node(3, node4);
		Node node2 = new Node(2, node3);
		Node node1 = new Node(1, node2);

//		node5.setNext(node2);
		System.out.println(isLoopDetected(node1));

	}

	public static boolean isLoopDetected(Node node) {
		if (node == null) {
			return false;
		}

		Node slow = node;
		Node fast = node;

		while (fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			if (slow == fast) {
				return true;
			}
			if (slow == null || fast == null) {
				return false;
			}
		}
		return false;

	}

}
