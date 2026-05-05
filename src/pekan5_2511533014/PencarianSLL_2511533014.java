package pekan5_2511533014;

public class PencarianSLL_2511533014 {
	static boolean searchKey_3014 (NodeSLL_2511533014 head, int key) {
		NodeSLL_2511533014 curr = head;
		while (curr != null) {
			if (curr.data_3014 == key)
				return true;
			curr = curr.next_3014; }
		return false; }
	public static void traversal_3014 (NodeSLL_2511533014 head) {
		//mulai dari head
		NodeSLL_2511533014 curr = head;
		// telusuri sampai pointer null
		while (curr != null)  {
			System.out.print(" " + curr.data_3014);
			curr = curr.next_3014; }
		System.out.println();      }
		public static void main (String[] args) {
			NodeSLL_2511533014 head = new NodeSLL_2511533014(14);
			head.next_3014 = new NodeSLL_2511533014(21);
			head.next_3014.next_3014 = new NodeSLL_2511533014(13);
			head.next_3014.next_3014.next_3014 = new NodeSLL_2511533014(30);
			head.next_3014.next_3014.next_3014.next_3014 = new NodeSLL_2511533014(10);
			System.out.print ("Penelusuran SLL : ") ;
			traversal_3014 (head);
			// data yang akan dicari
			int key = 30;
			System.out.print("cari data " + key+ "  =  ");
			if (searchKey_3014(head, key))
				System.out.println("ketemu");
			else
				System.out.println("tidak ada");
	
			
		}
	}


