
public class BinaryTreeMaxLength {

	public static void main(String[] args) {
		Node node10 = new Node (57);
		Node node9 = new Node (55);
		Node node8 = new Node (100);
		Node node7 = new Node (90);
		Node node6 = new Node (60, node9);
		Node node5 = new Node (40);
		Node node4 = new Node (10);
		Node node3 = new Node (75, node6, node7);
		Node node2 = new Node (25, node4, node5);
		Node node1 = new Node (50,node2, node3);
		
		node7.setRight(node8);
		node9.setRight(node10);;
		
		System.out.println(binaryTreeMaxLength(node1));
		
		

	}
	
	public static int binaryTreeMaxLength (Node node) {
		if (node == null) {
			return 0;
		}
		if (node.getLeft() == null && node.getRight() == null) {
			return 0;
		}
		return Math.max(1+binaryTreeMaxLength(node.getLeft()), 1 + binaryTreeMaxLength(node.getRight()));
		
	}

}
