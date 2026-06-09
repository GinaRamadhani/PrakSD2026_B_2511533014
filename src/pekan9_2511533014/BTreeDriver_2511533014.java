package pekan9_2511533014;

public class BTreeDriver_2511533014 {
	    public static void main(String[] args_3014) {
	        // Membuat Pohon
	        BTree_2511533014 tree_3014 = new BTree_2511533014();
	        System.out.print("Jumlah Simpul awal pohon: ");
	        System.out.println(tree_3014.countNodes_3014());
	        // menambahkan simpul data 1
	        Node_2511533014 root_3014 = new Node_2511533014(1);
	        // menjadikan simpul 1 sebagai root
	        tree_3014.setRoot_3014(root_3014);
	        System.out.println("Jumlah simpul jika hanya ada root");
	        System.out.println(tree_3014.countNodes_3014());
	        Node_2511533014 node2_3014 = new Node_2511533014(2);
	        Node_2511533014 node3_3014 = new Node_2511533014(3);
	        Node_2511533014 node4_3014 = new Node_2511533014(4);
	        Node_2511533014 node5_3014 = new Node_2511533014(5);
	        Node_2511533014 node6_3014 = new Node_2511533014(6);
	        Node_2511533014 node7_3014 = new Node_2511533014(7);
	        Node_2511533014 node8_3014 = new Node_2511533014(8);
	        Node_2511533014 node9_3014 = new Node_2511533014(9);
	        root_3014.setLeft_3014(node2_3014);
	        node2_3014.setLeft_3014(node4_3014);
	        node2_3014.setRight_3014(node5_3014);
	        node4_3014.setRight_3014(node8_3014);
	        root_3014.setRight_3014(node3_3014);
	        node3_3014.setLeft_3014(node6_3014);
	        node3_3014.setRight_3014(node7_3014);
	        node6_3014.setLeft_3014(node9_3014);
	        //Set root
	        tree_3014.setCurrent_3014(tree_3014.getRoot_3014());
	        System.out.println("Menampilkan simpul terakhir: ");
	        System.out.println(tree_3014.getCurrent_3014().getData_3014());
	        System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
	        System.out.println(tree_3014.countNodes_3014());
	        System.out.println("InOrder: ");
	        tree_3014.printInorder_3014();
	        System.out.println("\nPreorder: ");
	        tree_3014.printPreorder_3014();
	        System.out.println("\nPostorder : ");
	        tree_3014.printPostorder_3014();
	        System.out.println("\nDmenampilkan simpul dalam bentuk pohon");
	        tree_3014.print_3014();
	    }
	}
	


