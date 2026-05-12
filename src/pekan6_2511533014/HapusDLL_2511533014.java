package pekan6_2511533014;

public class HapusDLL_2511533014 {
	//fungsi mengahpus node di awal
	public static NodeDLL_2511533014 delHead_3014 (NodeDLL_2511533014 head_3014) {
		if (head_3014 == null) {
			return null;
		}
		NodeDLL_2511533014 temp_3014 = head_3014;
		head_3014 = head_3014.next_3014;
		if (head_3014 != null) {
			head_3014.prev_3014 = null;
		}
		return head_3014;
	}
	//fungsi menghapus di akhir
	public static NodeDLL_2511533014 delLast_3014 (NodeDLL_2511533014 head_3014) {
		if (head_3014 == null) {
			return null;
		}
		if (head_3014.next_3014 == null) {
			return null;
		}
		NodeDLL_2511533014 curr_3014 = head_3014;
		while (curr_3014.next_3014 != null) {
			curr_3014 = curr_3014.next_3014;
		}
		//update pointer previous node
		if (curr_3014.prev_3014 != null) {
			curr_3014.prev_3014.next_3014 = null;
		}
		return head_3014;
	}
	//fungsi menghapus node posisi tertentu
	public static NodeDLL_2511533014 delPos_3014 (NodeDLL_2511533014 head_3014, int pos_3014) {
		//jika DLL kosong
		if (head_3014 == null) {
			return head_3014;
		}
		NodeDLL_2511533014 curr_3014 = head_3014;
		//telusuri sampai ke node yang akan dihapus
		for (int i = 1; curr_3014 != null && i < pos_3014; ++i) {
			curr_3014 = curr_3014.next_3014;
		}
		//jika posisi tidak ditemukan
		if (curr_3014 == null) {
			return head_3014;
		}	
		//update pointer
		if (curr_3014.prev_3014 != null) {
			curr_3014.prev_3014.next_3014 = curr_3014.next_3014;
		}
		if (curr_3014.next_3014 != null) {
			curr_3014.next_3014.prev_3014 = curr_3014.prev_3014;
		}
		//jika yang dihapus head
		if (head_3014 == curr_3014) {
			head_3014 = curr_3014.next_3014;
		}
		return head_3014;
	}
	//fungsi mencetak DLL
	public static void printList_3014 (NodeDLL_2511533014 head_3014) {
		NodeDLL_2511533014 curr_3014 = head_3014;
		while (curr_3014 != null) {
			System.out.print ( curr_3014.data_3014 + " <-> ");
			curr_3014 = curr_3014.next_3014;
		}
		System.out.println ();
	}
	public static void main (String[] args) {
		//buat sebuah DLL
		NodeDLL_2511533014 head_3014 = new NodeDLL_2511533014 (1);
		head_3014.next_3014 = new NodeDLL_2511533014 (2);
		head_3014.next_3014.prev_3014 = head_3014;
		head_3014.next_3014.next_3014 = new NodeDLL_2511533014 (3);
		head_3014.next_3014.next_3014.prev_3014 = head_3014.next_3014;	
		head_3014.next_3014.next_3014.next_3014 = new NodeDLL_2511533014 (4);
		head_3014.next_3014.next_3014.next_3014.prev_3014 = head_3014.next_3014;
		head_3014.next_3014.next_3014.next_3014.next_3014 = new NodeDLL_2511533014 (5);
		head_3014.next_3014.next_3014.next_3014.next_3014.prev_3014 = head_3014.next_3014.next_3014.next_3014;
		
		System.out.print ("DLL Awal: ");
		printList_3014(head_3014);
		
		System.out.print ("Setelah head dihapus: ");
		head_3014 = delHead_3014 (head_3014);
		printList_3014 (head_3014);
		
		System.out.print("Setelah node terkahir dihapus: ");
		head_3014 = delLast_3014 (head_3014);
		printList_3014 (head_3014);
		
		System.out.print ("Menghapus node ke 2: ");
		head_3014 = delPos_3014 (head_3014, 2);
		printList_3014 (head_3014);
	}
}