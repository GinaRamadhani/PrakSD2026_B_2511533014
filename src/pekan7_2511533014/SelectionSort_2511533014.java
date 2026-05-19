package pekan7_2511533014;

public class SelectionSort_2511533014 {
    public static void selectionSort_3014(int[] arr_3014) {
        int n_3014 = arr_3014.length;
        for (int i_3014 = 0; i_3014 < n_3014 - 1; i_3014++) {
            int minIndex_3014 = i_3014;
            for (int j_3014 = i_3014 + 1; j_3014 < n_3014; j_3014++) {
                if (arr_3014[j_3014] < arr_3014[minIndex_3014]) {
                    minIndex_3014 = j_3014;
                }
            }
            int temp_3014 = arr_3014[i_3014];
            arr_3014[i_3014] = arr_3014[minIndex_3014];
            arr_3014[minIndex_3014] = temp_3014;
        }
    }
    public static void main(String[] args_3014) {
        int arr_3014[] = {23, 78, 45, 8, 32, 56, 1};
        int n_3014 = arr_3014.length;
        System.out.print("array yang belum terurut:\n");
        for (int i_3014 = 0; i_3014 < n_3014; i_3014++) {
            System.out.print(arr_3014[i_3014] + " ");
        }
        System.out.println("");
        selectionSort_3014(arr_3014);
        System.out.print("array yang terurut:\n");
        for (int i_3014 = 0; i_3014 < n_3014; i_3014++) {
            System.out.print(arr_3014[i_3014] + " ");
        }
        System.out.println("");
    }
}