
public class LinkedListIsCyclic {

	public static void main(String[] args) {
		Node node7 = new Node(7);
		Node node6 = new Node(6, node7);
		Node node5 = new Node(5, node6);
		Node node4 = new Node(4, node5);
		Node node3 = new Node(3, node4);
		Node node2 = new Node(2, node3);
		Node node1 = new Node(1, node2);
		
		node1.setNext(node1);
		
		System.out.println(isCyclic(node1));
	}
	
	public static boolean isCyclic(Node node) {
		return isCyclicCheck(node.getNext(), node);
	}
	
	public static boolean isCyclicCheck(Node node, Node first) {
		if (node == null) {
			return false;
		}
		if (node == first) {
			return true;
		}
		return isCyclicCheck (node.getNext(), first);
	}


}
