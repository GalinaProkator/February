
public class LinkedListMerge {

	public static void main(String[] args) {
		Node node8 = new Node(13);
		Node node7 = new Node(11, node8);
		Node node6 = new Node(10, node7);
		Node node5 = new Node(9, node6);
		Node node4 = new Node(7, node5);
		Node node3 = new Node(5, node4);
		Node node2 = new Node(3, node3);
		Node node1 = new Node(-1, node2);

		Node node18 = new Node(1024);
		Node node17 = new Node(32, node18);
		Node node16 = new Node(16, node17);
		Node node15 = new Node(14, node16);
		Node node14 = new Node(10, node15);
		Node node13 = new Node(8, node14);
		Node node12 = new Node(6, node13);
		Node node11 = new Node(0, node12);
		
		printLinkedList(linkedListSortedMerge(node1, node11));

	}

	public static Node linkedListSortedMerge (Node node1, Node node2) {
		if (node1 == null && node2 == null) {
			return null;
		}
		if (node1 == null) {
			Node nodeNew = new Node(0);
			nodeNew.setValue(node2.getValue());
			nodeNew.setNext(linkedListSortedMerge(node1, node2.getNext()));
			return nodeNew;
		}
		if (node2 == null) {
			Node nodeNew = new Node(0);
			nodeNew.setValue(node1.getValue());
			nodeNew.setNext(linkedListSortedMerge(node1.getNext(), node2));
			return nodeNew;
		}
		if (node1.getValue() < node2.getValue()) {
			Node nodeNew = new Node(0);
			nodeNew.setValue(node1.getValue());
			nodeNew.setNext(linkedListSortedMerge(node1.getNext(), node2));
			return nodeNew;
		}
		else {
			Node nodeNew = new Node(0);
			nodeNew.setValue(node2.getValue());
			nodeNew.setNext(linkedListSortedMerge(node1, node2.getNext()));
			return nodeNew;
		}

	}
	
	public static void printLinkedList(Node node) {
		if (node == null) {
			return;
		}
		System.out.println(node.getValue());
		printLinkedList(node.getNext());
	}

}


