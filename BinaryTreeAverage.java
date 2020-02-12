
public class BinaryTreeAverage {

	public static void main(String[] args) {
		Node node7 = new Node (90);
		Node node6 = new Node (60);
		Node node5 = new Node (40);
		Node node4 = new Node (10);
		Node node3 = new Node (75, node6, node7);
		Node node2 = new Node (25, node4, node5);
		Node node1 = new Node (50,node2, node3);

		System.out.println(binaryTreeAmountOfMembers(node1));
		System.out.println(binaryTreeSum(node1));

		int binaryTreeAverage = binaryTreeSum(node1)/binaryTreeAmountOfMembers(node1);
		System.out.println(binaryTreeAverage);

	}

	public static int binaryTreeAmountOfMembers(Node node) {
		if (node == null) {
			return 0;
		}

		if (node.getLeft() == null && node.getRight()==null) {
			return 1;
		}
		return 1+ binaryTreeAmountOfMembers(node.getLeft()) + binaryTreeAmountOfMembers(node.getRight());
	}

	public static int binaryTreeSum (Node node) {
		if (node == null) {
			return 0;
		}
		if (node.getLeft() == null && node.getRight()==null) {
			return node.getValue();
		}
		return node.getValue() + binaryTreeSum(node.getLeft()) + binaryTreeSum(node.getRight());
	}

}
