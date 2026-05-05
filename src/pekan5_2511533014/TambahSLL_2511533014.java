package pekan5_2511533014;

public class TambahSLL_2511533014 {
	public static NodeSLL_2511533014 insertAtFront (NodeSLL_2511533014 head, int value) {
		NodeSLL_2511533014 new_node = new NodeSLL_2511533014 (value);
		new_node.next_3014 = head;
		return new_node;
	}
	// fungsi menambahkan node di akhir SLL
	public static NodeSLL_2511533014 insertAtEnd (NodeSLL_2511533014 head, int value) {
		// buat sebuah node dengan sebuah nilai
		NodeSLL_2511533014 newNode = new NodeSLL_2511533014 (value);
		// jika list kosong maka node jadi head
		if (head == null) {
			return newNode;
		}
		// Simpan head ke variabel sementara
		NodeSLL_2511533014 last = head;
		// telusuri ke node akhir
		while (last.next_3014 != null) {
			last = last.next_3014;
		}
		// ubah pointer
		last.next_3014 = newNode;
		return head;
	}
	static NodeSLL_2511533014 GetNode (int data_3014) {
		return new NodeSLL_2511533014 (data_3014);
	}
	
	static NodeSLL_2511533014 insertPos (NodeSLL_2511533014 headNode, int position, int value) {
		NodeSLL_2511533014 head = headNode;
		if (position < 1)
			System.out.print ("Invalid position");
		if (position == 1) {
			NodeSLL_2511533014 new_node = new NodeSLL_2511533014(value);
			new_node.next_3014 = head;
			return new_node;	
		} else {
			while (position-- != 0) {
				if (position == 1) {
					NodeSLL_2511533014 newNode = GetNode (value);
					newNode.next_3014 = headNode.next_3014;
					headNode.next_3014 = newNode;
					break;
				}
				headNode = headNode.next_3014;
			}
			if (position != 1)
		System.out.print("Posisi di luar jangkauan");          
		return head;    }  }  
	public static void printList_3014 (NodeSLL_2511533014 head) {
		NodeSLL_2511533014 curr = head;
	 while (curr.next_3014 != null) {
		 System.out.print(curr.data_3014+"-->");
		 curr = curr.next_3014;
	 }
	 if (curr.next_3014==null) {
		 System.out.print(curr.data_3014);  }
	 System.out.println();
	 }
		
	public static void main (String[] args) {
		// buat linked list 2->3->5->6
		NodeSLL_2511533014 head = new NodeSLL_2511533014(2);
		head.next_3014 = new NodeSLL_2511533014(3);
		head.next_3014.next_3014 = new NodeSLL_2511533014(5);
		head.next_3014.next_3014.next_3014 = new NodeSLL_2511533014(6);
		// cetak list asli
		System.out.print("Senarai berantai awal:");
		printList_3014 (head);
		// tambahkan node baru didepan
		System.out.print("tambah 1 simpul di depan: ");
		int data_3014 = 1;
		head = insertAtFront(head, data_3014);
		// cetak update list
		printList_3014(head);
		// tambahkan node baru dibelakang
		System.out.print("tambah 1 simpul di belakang");
		int data2 = 7;
		head = insertAtEnd (head, data2);
		// cetak update list
		printList_3014 (head);
		System.out.print("tambah 1 simpul ke data 4: ");
		int data3 = 4;
		int pos=4;
		head = insertPos (head,pos,data3);
		// cetak update list
		printList_3014 (head);
		
	}
		}


