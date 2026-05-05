package pekan5_2511533014;

public class HapusSLL_2511533014 {
    // fungsi untuk menghapus head
    public static NodeSLL_2511533014 deleteHead_3014(NodeSLL_2511533014 head_3014) {
        // jika SLL kosong 
        if (head_3014 == null) {
            return null;
        }
        // pindahkan head ke node berikutnya 
        head_3014 = head_3014.next_3014;
        // return head baru 
        return head_3014;
    }

    // fungsi menghapus node terakhir SLL
    public static NodeSLL_2511533014 removeLastNode_3014(NodeSLL_2511533014 head_3014) {
        // jika list kosong , return null 
        if (head_3014 == null) {
            return null;
        }
        // jika list satu node , hapus node dan return null
        if (head_3014.next_3014 == null) {
            return null;
        }
        // temukan node terakhir kedua 
        NodeSLL_2511533014 secondLast = head_3014;
        while (secondLast.next_3014.next_3014 != null) {
            secondLast = secondLast.next_3014;
        }
        // hapus node terakhir 
        secondLast.next_3014 = null;
        return head_3014;
    }

    // fungsi menghapus node di posisi tertentu
    public static NodeSLL_2511533014 deleteNode_3014(NodeSLL_2511533014 head_3014, int position_3014) {
        NodeSLL_2511533014 temp_3014 = head_3014;
        NodeSLL_2511533014 prev_3014 = null;

        // jika linked list null
        if (temp_3014 == null)
            return head_3014;

        // kasus 1: head dihapus
        if (position_3014 == 1) {
            head_3014 = temp_3014.next_3014;
            return head_3014;
        }

        // kasus 2: menghapus node di tengah
        for (int i_3014 = 1; temp_3014 != null && i_3014 < position_3014; i_3014++) {
            prev_3014 = temp_3014;
            temp_3014 = temp_3014.next_3014;
        }

        // jika ditemukan, hapus node
        if (temp_3014 != null) {
            prev_3014.next_3014 = temp_3014.next_3014;
        } else {
            System.out.println("Data tidak ada");
        }
        return head_3014;
    }

    // fungsi mencetak SLL
    public static void printList_3014(NodeSLL_2511533014 head_3014) {
        NodeSLL_2511533014 curr_3014 = head_3014;
        while (curr_3014.next_3014 != null) {
            System.out.print(curr_3014.data_3014 + "-->");
            curr_3014 = curr_3014.next_3014;
        }
        System.out.print(curr_3014.data_3014);
        System.out.println();
    }

    // kelas main
    public static void main(String[] args) {
        // buat SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
        NodeSLL_2511533014 head_3014 = new NodeSLL_2511533014(1);
        head_3014.next_3014 = new NodeSLL_2511533014(2);
        head_3014.next_3014.next_3014 = new NodeSLL_2511533014(3);
        head_3014.next_3014.next_3014.next_3014 = new NodeSLL_2511533014(4);
        head_3014.next_3014.next_3014.next_3014.next_3014 = new NodeSLL_2511533014(5);
        head_3014.next_3014.next_3014.next_3014.next_3014.next_3014 = new NodeSLL_2511533014(6);

        // cetak list awal
        System.out.println("List awal: ");
        printList_3014(head_3014);

        // hapus head
        head_3014 = deleteHead_3014(head_3014);
        System.out.println("List setelah head dihapus: ");
        printList_3014(head_3014);

        // hapus node terakhir
        head_3014 = removeLastNode_3014(head_3014);
        System.out.println("List setelah simpul terakhir dihapus: ");
        printList_3014(head_3014);

        // hapus node di posisi 2
        int position_3014 = 2;
        head_3014 = deleteNode_3014(head_3014, position_3014);
        System.out.println("List setelah posisi 2 dihapus: ");
        printList_3014(head_3014);
    }
}