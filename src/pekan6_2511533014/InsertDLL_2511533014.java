package pekan6_2511533014;

public class InsertDLL_2511533014 {
    // menambahkan node di awal DLL
    static NodeDLL_2511533014 insertBegin_3014(NodeDLL_2511533014 head_3014, int data_3014){
        NodeDLL_2511533014 new_node_3014 = new NodeDLL_2511533014(data_3014);
        new_node_3014.next_3014 = head_3014;
        if (head_3014 != null){
            head_3014.prev_3014 = new_node_3014;
        }
        return new_node_3014;
    }

    // fungsi menambahkan node di akhir
    public static NodeDLL_2511533014 insertEnd_3014(NodeDLL_2511533014 head_3014, int newData_3014){
        NodeDLL_2511533014 newNode_3014 = new NodeDLL_2511533014(newData_3014);
        if (head_3014 == null){
            head_3014 = newNode_3014;
        } else {
            NodeDLL_2511533014 curr_3014 = head_3014;
            while (curr_3014.next_3014 != null){
                curr_3014 = curr_3014.next_3014;
            }
            curr_3014.next_3014 = newNode_3014;
            newNode_3014.prev_3014 = curr_3014;
        }
        return head_3014;
    }

    // fungsi menambahkan node di posisi tertentu
    public static NodeDLL_2511533014 insertAtPosition_3014(NodeDLL_2511533014 head_3014, int pos_3014, int new_data_3014) {
        NodeDLL_2511533014 new_node_3014 = new NodeDLL_2511533014(new_data_3014);
        if (pos_3014 == 1) {
            new_node_3014.next_3014 = head_3014;
            if (head_3014 != null) {
                head_3014.prev_3014 = new_node_3014;
            }
            head_3014 = new_node_3014;
            return head_3014;
        }
        NodeDLL_2511533014 curr_3014 = head_3014;
        for (int i_3014 = 1; i_3014 < pos_3014 - 1 && curr_3014 != null; ++i_3014) {
            curr_3014 = curr_3014.next_3014;
        }
        if (curr_3014 == null) {
            System.out.println("Posisi tidak ada");
            return head_3014;
        }
        new_node_3014.prev_3014 = curr_3014;
        new_node_3014.next_3014 = curr_3014.next_3014;
        curr_3014.next_3014 = new_node_3014;
        if (new_node_3014.next_3014 != null) {
            new_node_3014.next_3014.prev_3014 = new_node_3014;
        }
        return head_3014;
    }

    public static void printList_3014(NodeDLL_2511533014 head_3014) {
        NodeDLL_2511533014 curr_3014 = head_3014;
        while (curr_3014 != null) {
            System.out.print(curr_3014.data_3014 + " <-> ");
            curr_3014 = curr_3014.next_3014;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NodeDLL_2511533014 head_3014 = new NodeDLL_2511533014(2);
        head_3014.next_3014 = new NodeDLL_2511533014(3);
        head_3014.next_3014.prev_3014 = head_3014;
        head_3014.next_3014.next_3014 = new NodeDLL_2511533014(5);
        head_3014.next_3014.next_3014.prev_3014 = head_3014.next_3014;

        System.out.print("DLL Awal: ");
        printList_3014(head_3014);

        head_3014 = insertBegin_3014(head_3014, 1);
        System.out.print("Simpul 1 ditambah di awal: ");
        printList_3014(head_3014);

        System.out.print("Simpul 6 ditambah di akhir: ");
        int data_3014 = 6;
        head_3014 = insertEnd_3014(head_3014, data_3014);
        printList_3014(head_3014);

        System.out.print("Tambah node 4 di posisi 4: ");
        int data2_3014 = 4;
        int pos_3014 = 4;
        head_3014 = insertAtPosition_3014(head_3014, pos_3014, data2_3014);
        printList_3014(head_3014);
    }
}