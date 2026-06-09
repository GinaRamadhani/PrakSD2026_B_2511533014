package pekan9_2511533014;

public class Node_2511533014 {
	int data_3014;
	Node_2511533014 left_3014;
	Node_2511533014 right_3014;
	public Node_2511533014 (int data_3014) {
		this.data_3014 = data_3014;
		left_3014 = null;
		right_3014 = null;
	}
	public void setLeft_3014(Node_2511533014 node_3014) {
		if (left_3014 == null)
			left_3014 = node_3014;
	}
	public void setRight_3014(Node_2511533014 node_3014) {
		if (right_3014 == null)
			right_3014 = node_3014;
	}
	public Node_2511533014 getLeft_3014() {
		return left_3014;
	}
	public Node_2511533014 getRight_3014 () {
		return right_3014;
	}
	
	public int getData_3014() {
		return data_3014;
	}
	public void setData_3014 () {
		this.data_3014 = data_3014;		
	}
	
	void printPreorder_3014(Node_2511533014 node_3014) {
		if (node_3014 == null)
			return;
		System.out.print(node_3014.data_3014 + " ");
		printPreorder_3014 (node_3014.left_3014);
		printPreorder_3014 (node_3014.right_3014);
	}
	void printPostorder_3014(Node_2511533014 node_3014) {
		if (node_3014 == null)
			return;
		printPostorder_3014(node_3014.left_3014);
		printPostorder_3014(node_3014.right_3014);
		System.out.print(node_3014.data_3014 + " ");
	}
	void printInorder_3014(Node_2511533014 node_3014) {
		if (node_3014 == null)
			return;
		printInorder_3014(node_3014.left_3014);
		System.out.print(node_3014.data_3014 + " ");
		printInorder_3014(node_3014.right_3014);
	}
	public String print_3014() {
		return this.print_3014("",true,"");
		}
	public String print_3014(String prefix, boolean isTail, String sb) {
		if (right_3014 != null) {
			right_3014.print_3014(prefix + (isTail ? "| ": "  "), false, sb);
			}
		System.out.println( prefix+(isTail ? "\\--" : "/--")+data_3014);
		if (left_3014  != null) {
		left_3014.print_3014(prefix+(isTail ?"  ": "|  "), true, sb);	
		}
		return sb;
	}
	
	

}
