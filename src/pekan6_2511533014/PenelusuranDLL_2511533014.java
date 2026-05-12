package pekan6_2511533014;

public class PenelusuranDLL_2511533014 {
	//fungsi penelurusan maju
	static void forwardTraversal_3014 (NodeDLL_2511533014 head_3014) {
		//memulai penelusuran dari head
		NodeDLL_2511533014 curr_3014 = head_3014;
		//lanjutkan sampai akhir
		while (curr_3014 != null) {
			//print data
			System.out.print (curr_3014.data_3014 + " <-> ");
			//pindahkan ke node berikutnya
			curr_3014 = curr_3014.next_3014;
		}
		//print spasi
		System.out.println ();
	}
	//fungsi penelusuran mundur
	static void backwardTraversal_3014 (NodeDLL_2511533014 tail_3014) {
		//mulai dari akhir
		NodeDLL_2511533014 curr_3014 = tail_3014;
		//lanjut sampai head
		while (curr_3014 != null) {
			//cetak data
			System.out.print (curr_3014.data_3014 + " <-> ");
			//pindahkan ke node sebelumnya
			curr_3014 = curr_3014.prev_3014;
		}
		//cetak spasi
		System.out.println();
	}
	public static void main (String[] args) {
		//cetak dll
		NodeDLL_2511533014 head_3014 = new NodeDLL_2511533014 (1);
		NodeDLL_2511533014 second_3014 = new NodeDLL_2511533014 (2);
		NodeDLL_2511533014 third_3014 = new NodeDLL_2511533014 (3);
		
		head_3014.next_3014 = second_3014;
		second_3014.prev_3014 = head_3014;
		second_3014.next_3014 = third_3014;
		third_3014.prev_3014 = second_3014;
		
		System.out.println ("Penelusuran maju: ");
		forwardTraversal_3014 (head_3014);
		
		System.out.println ("Penelusuran mundur: ");
		backwardTraversal_3014 (third_3014);
		
	}
}