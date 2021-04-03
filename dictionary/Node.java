package dictionary;

/**
 * this class is used to make node of a Binary Search Tree
 * @author yash.porwal_metacube
 *
 */
public class Node {
	// key of node
	private String key;

	// value of node
	private String value;

	// left node of the current node
	Node left;

	// right node of the current node
	Node right;

	// parent node of the current node
	Node parent;

	/**
	 * constructor which takes key & value to make a Node of Tree
	 * @param key of dictionary
	 * @param value of dictionary
	 */
	public Node(String key, String value) {
		this.key = key;
		this.value = value;
		this.left = null;
		this.right = null;
		this.parent = null;
	}

	/**
	 * getter of Key in Node
	 * @return key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * setter of Key in Node
	 * @param key as a String user input
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * getter of Value in Node
	 * @return value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * setter of Value of Node
	 * @param value as a String user input
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * get left sub child node of Node in a Tree
	 * @return left sub child node
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * set left sub child node of Node in a Tree
	 * @param left sub child node as an input of Node class object
	 */
	public void setLeft(Node left) {
		this.left = left;
	}

	/**
	 * get right sub child node of Node in a Tree
	 * @return right sub child node
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * set right sub child node of Node in a Tree
	 * @param right sub child node
	 */
	public void setRight(Node right) {
		this.right = right;
	}

	/**
	 * get parent node in a Tree
	 * @return parent node
	 */
	public Node getParent() {
		return parent;
	}

	/**
	 * set parent node in a Tree
	 * @param parent node of Node class object
	 */
	public void setParent(Node parent) {
		this.parent = parent;
	}
}