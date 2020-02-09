
public class LinkedListGoOneBack {

	public static void main(String[] args) {
		Node node7 = new Node(7);
		Node node6 = new Node(6, node7);
		Node node5 = new Node(5, node6);
		Node node4 = new Node(4, node5);
		Node node3 = new Node(3, node4);
		Node node2 = new Node(2, node3);
		Node node1 = new Node(1, node2);
		
		getOneBack(node1, node6);

	}
	
	public static void getOneBack(Node node, Node nodeAim) {
		if (node == null || node.getNext() == null || node == nodeAim) {
			System.out.println("Failed to perform");
			return;
		}
		if (node.getNext() == nodeAim) {
			System.out.println(node.getValue());
			return;
		}
		getOneBack(node.getNext(), nodeAim);
	}

}
