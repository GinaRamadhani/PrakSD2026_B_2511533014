package pekan7_2511533014;

public class InsertionSort_2511533014 {
    public static void insertionSort_3014(int[] arr_3014) {
        int n_3014 = arr_3014.length;
        for (int i_3014 = 1; i_3014 < n_3014; i_3014++) {
            int key_3014 = arr_3014[i_3014];
            int j_3014 = i_3014 - 1;
            while (j_3014 >= 0 && arr_3014[j_3014] > key_3014) {
                arr_3014[j_3014 + 1] = arr_3014[j_3014];
                j_3014--;
            }
            arr_3014[j_3014 + 1] = key_3014;
        }
    }
    public static void main(String[] args_3014) {
        int arr_3014[] = {23, 78, 45, 8, 32, 56, 1};
        int n_3014 = arr_3014.length;
        System.out.printf("array yang belum terurut:\n");
        for (int i_3014 = 0; i_3014 < n_3014; i_3014++)
            System.out.print(arr_3014[i_3014] + " ");
        System.out.println("");
        insertionSort_3014(arr_3014);
        System.out.printf("array yang terurut:\n");
        for (int i_3014 = 0; i_3014 < n_3014; i_3014++)
            System.out.print(arr_3014[i_3014] + " ");
        System.out.println("");
    }
}