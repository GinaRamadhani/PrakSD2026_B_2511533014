package pekan9_2511533014;

public class BTree_2511533014 {	
	    private Node_2511533014 root_3014;
	    private Node_2511533014 currentNode_3014;
	    public BTree_2511533014() {
	        root_3014 = null;
	    }
	    public boolean search_3014(int data_3014) {
	        return search_3014(root_3014, data_3014);
	    }
	    private boolean search_3014(Node_2511533014 node_3014, int data_3014) {
	        if (node_3014.getData_3014() == data_3014)
	            return true;
	        if (node_3014.getLeft_3014() != null)
	            if (search_3014(node_3014.getLeft_3014(), data_3014))
	                return true;
	        if (node_3014.getRight_3014() != null)
	            if (search_3014(node_3014.getRight_3014(), data_3014))
	                return true;
	        return false;
	    }
	    public void printInorder_3014() {
	        root_3014.printInorder_3014(root_3014);
	    }
	    public void printPreorder_3014() {
	        root_3014.printPreorder_3014(root_3014);
	    }
	    public void printPostorder_3014() {
	        root_3014.printPostorder_3014(root_3014);
	    }
	    
	    public Node_2511533014 getRoot_3014() {
	        return root_3014;
	    }
	    
	    public boolean isEmpty_3014() {
	        return root_3014 == null;
	    }

	    public int countNodes_3014() {
	        return countNodes_3014(root_3014);
	    }

	    private int countNodes_3014(Node_2511533014 node_3014) {
	        int count_3014 = 1;
	        if (node_3014 == null) {
	            return 0;
	        } else {
	            count_3014 += countNodes_3014(node_3014.getLeft_3014());
	            count_3014 += countNodes_3014(node_3014.getRight_3014());
	            return count_3014;
	        }
	    }

	    public void print_3014() {
	        root_3014.print_3014();
	    }

	    public Node_2511533014 getCurrent_3014() {
	        return currentNode_3014;
	    }

	    public void setCurrent_3014(Node_2511533014 node_3014) {
	        this.currentNode_3014 = node_3014;
	    }

	    public void setRoot_3014(Node_2511533014 root_3014) {
	        this.root_3014 = root_3014;
	    }
	}


